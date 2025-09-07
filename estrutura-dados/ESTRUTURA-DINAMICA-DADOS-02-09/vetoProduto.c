#include <stdio.h>
#include <string.h>

// 1. Definição da struct Produto
// Estrutura que representa um produto, contendo nome, quantidade em estoque e preço unitário.
typedef struct {
    char nome[50];      // Nome do produto (até 49 caracteres + '\0')
    int quantidade;     // Quantidade disponível em estoque
    float preco;        // Preço unitário do produto
} Produto;

// Protótipos das funções
// Declaração das funções utilizadas no programa para facilitar a organização.
void exibirMenu();
int adicionarProduto(Produto estoque[], int *totalProdutos);
void exibirProdutos(Produto estoque[], int totalProdutos);
void adicionarEstoque(Produto estoque[], int totalProdutos);
void removerEstoque(Produto estoque[], int totalProdutos);
void calcularValorTotalEstoque(Produto estoque[], int totalProdutos);

int main() {
    // Declaração do vetor de structs
    // Vetor que armazena até 100 produtos cadastrados.
    Produto estoque[100]; // Capacidade máxima de 100 produtos
    int totalProdutos = 0; // Quantidade atual de produtos cadastrados
    int opcao; // Variável para armazenar a opção escolhida pelo usuário

    // Loop principal do menu
    do {
        exibirMenu(); // Exibe o menu de opções
        printf("Escolha uma opcao: ");
        scanf("%d", &opcao); // Lê a opção do usuário

        // Executa a ação correspondente à opção escolhida
        switch (opcao) {
            case 1:
                // Adiciona um novo produto ao estoque
                adicionarProduto(estoque, &totalProdutos);
                break;
            case 2:
                // Exibe todos os produtos cadastrados
                exibirProdutos(estoque, totalProdutos);
                break;
            case 3:
                // Adiciona itens ao estoque de um produto existente
                adicionarEstoque(estoque, totalProdutos);
                break;
            case 4:
                // Remove itens do estoque de um produto existente
                removerEstoque(estoque, totalProdutos);
                break;
            case 5:
                // Calcula e exibe o valor total do estoque de cada produto
                calcularValorTotalEstoque(estoque, totalProdutos);
                break;
            case 6:
                // Sai do programa
                printf("Saindo do programa. Ate mais!\n");
                break;
            default:
                // Opção inválida
                printf("Opcao invalida. Tente novamente.\n");
        }
        printf("\n"); // Espaço entre as operações
    } while (opcao != 6); // Repete até o usuário escolher sair

    return 0; // Fim do programa
}

// Função que exibe o menu de opções para o usuário
void exibirMenu() {
    printf("--- Menu de Gerenciamento de Produtos ---\n");
    printf("1. Adicionar novo produto\n");
    printf("2. Exibir lista de produtos\n");
    printf("3. Adicionar itens ao estoque\n");
    printf("4. Remover itens do estoque\n");
    printf("5. Calcular valor total do estoque\n");
    printf("6. Sair\n");
}

// Função para adicionar um novo produto ao estoque
// Recebe o vetor de produtos e um ponteiro para a quantidade total de produtos
int adicionarProduto(Produto estoque[], int *totalProdutos) {
    // Verifica se já atingiu o limite de produtos
    if (*totalProdutos >= 100) {
        printf("Erro: Limite de produtos atingido!\n");
        return 0;
    }
    printf("--- Cadastro de Produto ---\n");
    printf("Nome do produto: ");
    // Lê o nome do produto (inclui espaços)
    scanf(" %[^\n]", estoque[*totalProdutos].nome);
    printf("Quantidade em estoque: ");
    scanf("%d", &estoque[*totalProdutos].quantidade);
    printf("Preco unitario: ");
    scanf("%f", &estoque[*totalProdutos].preco);

    (*totalProdutos)++; // Incrementa o total de produtos cadastrados
    printf("Produto adicionado com sucesso!\n");
    return 1;
}

// Função para exibir todos os produtos cadastrados
void exibirProdutos(Produto estoque[], int totalProdutos) {
    // Verifica se há produtos cadastrados
    if (totalProdutos == 0) {
        printf("Nenhum produto cadastrado.\n");
        return;
    }
    printf("--- Lista de Produtos ---\n");
    // Percorre o vetor e exibe os dados de cada produto
    for (int i = 0; i < totalProdutos; i++) {
        printf("Produto %d:\n", i + 1);
        printf("  Nome: %s\n", estoque[i].nome);
        printf("  Quantidade: %d\n", estoque[i].quantidade);
        printf("  Preco: R$ %.2f\n", estoque[i].preco);
        printf("-------------------------\n");
    }
}

// Função para adicionar itens ao estoque de um produto existente
void adicionarEstoque(Produto estoque[], int totalProdutos) {
    // Verifica se há produtos cadastrados
    if (totalProdutos == 0) {
        printf("Nenhum produto cadastrado para adicionar estoque.\n");
        return;
    }
    int indice, valor;
    printf("Informe o numero do produto para adicionar estoque (1 a %d): ", totalProdutos);
    scanf("%d", &indice);
    indice--; // Ajusta para o índice do array (começa em 0)

    // Verifica se o índice é válido
    if (indice < 0 || indice >= totalProdutos) {
        printf("Numero de produto invalido.\n");
        return;
    }

    printf("Produto selecionado: %s\n", estoque[indice].nome);
    printf("Quantidade a adicionar: ");
    scanf("%d", &valor);

    // Adiciona a quantidade se o valor for positivo
    if (valor > 0) {
        estoque[indice].quantidade += valor;
        printf("Estoque atualizado com sucesso! Nova quantidade: %d\n", estoque[indice].quantidade);
    } else {
        printf("Valor a adicionar deve ser maior que zero.\n");
    }
}

// Função para remover itens do estoque de um produto existente
void removerEstoque(Produto estoque[], int totalProdutos) {
    // Verifica se há produtos cadastrados
    if (totalProdutos == 0) {
        printf("Nenhum produto cadastrado para remover estoque.\n");
        return;
    }
    int indice, valor;
    printf("Informe o numero do produto para remover estoque (1 a %d): ", totalProdutos);
    scanf("%d", &indice);
    indice--; // Ajusta para o índice do array

    // Verifica se o índice é válido
    if (indice < 0 || indice >= totalProdutos) {
        printf("Numero de produto invalido.\n");
        return;
    }

    printf("Produto selecionado: %s\n", estoque[indice].nome);
    printf("Quantidade a remover: ");
    scanf("%d", &valor);

    // Remove a quantidade se o valor for positivo e houver estoque suficiente
    if (valor > 0) {
        if (estoque[indice].quantidade >= valor) {
            estoque[indice].quantidade -= valor;
            printf("Estoque atualizado com sucesso! Nova quantidade: %d\n", estoque[indice].quantidade);
        } else {
            printf("Erro: Nao ha estoque suficiente para remover.\n");
        }
    } else {
        printf("Valor a remover deve ser maior que zero.\n");
    }
}

// Função para calcular e exibir o valor total do estoque de cada produto
void calcularValorTotalEstoque(Produto estoque[], int totalProdutos) {
    // Verifica se há produtos cadastrados
    if (totalProdutos == 0) {
        printf("Nenhum produto cadastrado.\n");
        return;
    }
    printf("--- Valor Total do Estoque ---\n");
    // Percorre o vetor e calcula o valor total de cada produto (quantidade * preço)
    for (int i = 0; i < totalProdutos; i++) {
        float valorTotal = estoque[i].quantidade * estoque[i].preco;
        printf("Produto: %s | Valor Total: R$ %.2f\n", estoque[i].nome, valorTotal);
    }
}