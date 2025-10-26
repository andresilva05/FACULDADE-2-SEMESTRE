#include <stdio.h>
#include <string.h>

#define TAMANHO_MAXIMO 100

typedef struct
{
    char elementos[TAMANHO_MAXIMO];
    int topo;
} Pilha;

// Protótipos
int pilhaVazia(Pilha *pilha);
int pilhaCheia(Pilha *pilha);
int empilhar(char simbolo, Pilha *pilha);
char desempilhar(Pilha *pilha);
int simbolosCorrespondem(char abridor, char fechador);
int estaBalanceada(char expressao[], Pilha *pilha);

int main()
{
    Pilha pilha;
    char expressao[TAMANHO_MAXIMO];

    printf("Digite a expressão: ");
    fgets(expressao, TAMANHO_MAXIMO, stdin);
    expressao[strcspn(expressao, "\n")] = '\0'; // Remove '\n'

    if (estaBalanceada(expressao, &pilha))
        printf("Expressao Balanceada\n");
    else
        printf("Expressao Nao Balanceada\n");

    return 0;
}

// Funções da pilha
int pilhaVazia(Pilha *pilha)
{
    return (pilha->topo == -1);
}

int pilhaCheia(Pilha *pilha)
{
    return (pilha->topo == TAMANHO_MAXIMO - 1);
}

int empilhar(char simbolo, Pilha *pilha)
{
    if (pilhaCheia(pilha))
        return 0; // Pilha cheia
    pilha->topo++;
    pilha->elementos[pilha->topo] = simbolo;
    return 1;
}

char desempilhar(Pilha *pilha)
{
    if (pilhaVazia(pilha))
        return '\0'; // Pilha vazia
    char simboloTopo = pilha->elementos[pilha->topo];
    pilha->topo--;
    return simboloTopo;
}

int simbolosCorrespondem(char abridor, char fechador)
{
    if (abridor == '(' && fechador == ')')
        return 1;
    if (abridor == '[' && fechador == ']')
        return 1;
    if (abridor == '{' && fechador == '}')
        return 1;
    return 0;
}

// Função de verificação de balanceamento
int estaBalanceada(char expressao[], Pilha *pilha)
{
    char simboloTopo;
    char simboloAtual;

    pilha->topo = -1; // inicializa a pilha

    for (int i = 0; expressao[i] != '\0'; i++)
    {
        simboloAtual = expressao[i];

        if (simboloAtual == '(' || simboloAtual == '[' || simboloAtual == '{')
        {
            if (!empilhar(simboloAtual, pilha))
                return 0; // Pilha cheia
        }
        else if (simboloAtual == ')' || simboloAtual == ']' || simboloAtual == '}')
        {
            if (pilhaVazia(pilha))
                return 0; // Pilha vazia → erro
            simboloTopo = desempilhar(pilha);
            if (!simbolosCorrespondem(simboloTopo, simboloAtual))
                return 0; // Não corresponde → erro
        }
    }

    // Ao final, pilha deve estar vazia
    return pilhaVazia(pilha);
}
