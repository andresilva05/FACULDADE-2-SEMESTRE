package pre_atividade_avaliativa_23_10.Exercicicio;

import java.util.Scanner;

public class App {

    // Método para cadastrar um produto do tipo Eletrônicos
    public static Eletronicos cadastrarEletronico(Scanner sc) {
        System.out.println("Nome: ");
        String nome = sc.nextLine(); // lê o nome do eletrônico

        System.out.println("Preço: ");
        double preco = sc.nextDouble(); // lê o preço
        sc.nextLine(); // consome o ENTER pendente

        System.out.println("Quantidade: ");
        int qtd = sc.nextInt(); // lê a quantidade
        sc.nextLine();

        System.out.println("Marca: ");
        String marca = sc.nextLine(); // lê a marca

        System.out.println("Voltagem: ");
        int voltagem = sc.nextInt(); // lê a voltagem
        sc.nextLine();

        // Cria e retorna um novo objeto Eletronicos com os dados informados
        return new Eletronicos(nome, preco, qtd, marca, voltagem);
    }

    // Método para cadastrar um produto do tipo Perfumaria
    public static Perfumaria cadastrarPerfumaria(Scanner sc) {
        System.out.println("Nome: ");
        String nome = sc.nextLine(); // lê o nome do perfume

        System.out.println("Preço: ");
        double preco = sc.nextDouble(); // lê o preço
        sc.nextLine(); // consome o ENTER pendente

        System.out.println("Quantidade: ");
        int qtd = sc.nextInt(); // lê a quantidade
        sc.nextLine();

        System.out.println("Público destinado: ");
        String publico = sc.nextLine(); // lê o público (ex: masculino, feminino)

        System.out.println("Marca: ");
        String marca = sc.nextLine(); // lê a marca

        System.out.println("Volume: ");
        int volume = sc.nextInt(); // lê o volume em ml
        sc.nextLine();

        // Cria e retorna um novo objeto Perfumaria com os dados informados
        return new Perfumaria(nome, preco, qtd, publico, marca, volume);
    }

    // Método principal (ponto de entrada do programa)
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcao;
        ProductCatalog productCatalog = new ProductCatalog(); // cria o catálogo de produtos

        do {
            // Menu principal
            System.out.println("1 - Cadastrar Eletrônico");
            System.out.println("2 - Cadastrar Perfumaria");
            System.out.println("3 - Exibir produtos");
            System.out.println("4 - Remover quantidade");
            System.out.println("5 - Ordenar produtos");
            System.out.println("6- Sair");
            System.out.println("Digite opcao desejada: ");
            opcao = sc.nextInt(); // lê a opção do usuário
            sc.nextLine();

            if (opcao <= 0 || opcao > 6) {
                System.out.println("Escolha as opções de acordo com menu.");
            } else {
                // Escolhe a ação conforme a opção
                switch (opcao) {

                    case 1: { // cadastrar eletrônico
                        Eletronicos e = cadastrarEletronico(sc);
                        productCatalog.adicionaProduto(e);
                        break;
                    }

                    case 2: { // cadastrar perfumaria
                        Perfumaria p = cadastrarPerfumaria(sc);
                        productCatalog.adicionaProduto(p);
                        break;
                    }

                    case 3: // exibir catálogo
                        productCatalog.exibirCatalogo();
                        break;

                    case 4: // remover quantidade de produto
                        System.out.println("=== REMOVER DO ESTOQUE ===");
                        productCatalog.exibirCatalogo(); // mostra os produtos atuais

                        Product produto = null;
                        do {
                            System.out.print("Digite o nome do produto que deseja alterar: ");
                            String nomeBusca = sc.nextLine();

                            produto = productCatalog.buscaPorNome(nomeBusca); // procura pelo nome

                            if (produto != null) {
                                System.out.print("Quantidade a remover: ");
                                int qtd = sc.nextInt();
                                sc.nextLine();
                                produto.removeProducts(qtd); // remove a quantidade informada
                                System.out.println("Quantidade removida com sucesso!");
                                break;
                            }
                            System.out.println("Produto não encontrado. Tente novamente.");
                        } while (produto == null);
                        break;

                    case 5: // ordenar catálogo em ordem alfabética
                        System.out.println("=== ORDENAR PRODUTOS ===");
                        System.out.println("Ordenando catálogo em ordem alfabética...");
                        productCatalog.ordena();
                        System.out.println("Catálogo ordenado com sucesso!");
                        break;
                }
            }
        } while (opcao != 6); // sai do loop se o usuário digitar 6

        sc.close(); // fecha o Scanner
    }
}
