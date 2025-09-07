// ✅ Exercício 2: Encontrar o maior e o menor número

// Escreva um programa em C que:

// Pergunte ao usuário quantos números ele quer digitar (n).

// Aloque dinamicamente um vetor de n números inteiros usando malloc.

// Leia os n números.

// Determine e exiba:

// O maior número

// O menor número

// Libere a memória com free().

// Exemplo de saída esperada:
// Quantos numeros deseja digitar? 5
// Digite o numero 1: 12
// Digite o numero 2: 8
// Digite o numero 3: 45
// Digite o numero 4: 3
// Digite o numero 5: 20

// Maior numero = 45
// Menor numero = 3 
#include <stdio.h>
#include <stdlib.h>

void maiorMenor();

int main()
{
    maiorMenor();
    return 0;
}

void maiorMenor()
{
    int qtd, *ptr, maior, menor;

    printf("Digite quantos numeros deseja adicionar: ");
    scanf("%d", &qtd);

    ptr = (int *)malloc(qtd * sizeof(int));
    if (ptr == NULL)
    {
        printf("\nErro na alocacao de memoria.");
        return;
    }

    // Lê o primeiro número e inicializa maior e menor
    printf("\nDigite o numero 1: ");
    scanf("%d", ptr); // ptr[0]
    maior = menor = ptr[0];

    // Lê os números restantes e atualiza maior e menor
    for (int i = 1; i < qtd; i++)
    {
        printf("\nDigite o numero %d: ", i + 1);
        scanf("%d", (ptr + i));

        if (*(ptr + i) > maior)
        {
            maior = *(ptr + i);
        }
        if (*(ptr + i) < menor)
        {
            menor = *(ptr + i);
        }
    }

    printf("\nMaior numero: %d", maior);
    printf("\nMenor numero: %d", menor);

    free(ptr); // libera a memória
}
