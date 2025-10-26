package pre_atividade_avaliativa_23_10.Exercicio;


// Classe responsável por gerenciar o catálogo de produtos
public class ProductCatalog {
    Product[] catalog = new Product[10]; // vetor com até 10 produtos
    private int contador = 0; // contador de produtos adicionados

    // Busca produto pelo nome
    public Product buscaPorNome(String nome) {
        for (int i = 0; i < contador; i++) {
            if (catalog[i].getName().equalsIgnoreCase(nome.trim())) {
                return catalog[i]; // retorna o produto encontrado
            }
        }
        return null; // se não encontrar, retorna null
    }

    // Adiciona um novo produto ao catálogo
    public void adicionaProduto(Product produto) {
        // Verifica se o produto já existe
        for (int i = 0; i < contador; i++) {
            if (produto.getName().equals(catalog[i].getName())) {
                System.out.println("Produto já existe!\n\n");
                return;
            }
        }

        // Se houver espaço, adiciona o produto
        if (contador < 10) {
            catalog[contador] = produto;
            contador++;
        } else {
            System.out.println("Catálogo cheio!\n\n");
        }
    }

    // Exibe todos os produtos cadastrados
    public void exibirCatalogo() {
        if (contador == 0) {
            System.out.println("Nenhum produto cadastrado.\n\n");
            return;
        }
        for (int i = 0; i < contador; i++) {
            System.out.println(catalog[i].toString());
        }
    }

    // Ordena o catálogo em ordem alfabética (usando Bubble Sort)
    public void ordena() {
        for (int i = 0; i < contador - 1; i++) {
            for (int j = 0; j < contador - 1 - i; j++) {
                if (catalog[j].getName().compareTo(catalog[j + 1].getName()) > 0) {
                    Product temp = catalog[j];
                    catalog[j] = catalog[j + 1];
                    catalog[j + 1] = temp;
                }
            }
        }
    }
}
