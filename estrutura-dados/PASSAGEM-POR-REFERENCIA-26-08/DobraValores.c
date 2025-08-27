#include <stdio.h>
// Protótipo da função que dobra os valores do vetor
void dobra_valores(int *vetor, int tamanho);

int main()
{
    int numeros[] = {1, 2, 3, 4, 5};
    int tamanho = 5;
    printf("Valores originais do vetor:\n");
    for (int i = 0; i < tamanho; i++)
    {
        printf("%d ", numeros[i]);
    }

    printf("\n");
    // Passa o vetor por referência (endereço) para a função
    dobra_valores(numeros, tamanho);
    printf("Valores do vetor apos a funcao:\n");
    for (int i = 0; i < tamanho; i++)
    {
        printf("%d ", numeros[i]);
    }
    printf("\n");
    return 0;
}

// Implementação da função
void dobra_valores(int *vetor, int tamanho)
{
    for (int i = 0; i < tamanho; i++)
    {
        vetor[i] = vetor[i] * 2;
    }
}