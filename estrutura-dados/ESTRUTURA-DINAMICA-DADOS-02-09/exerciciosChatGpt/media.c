#include <stdio.h>
#include <stdlib.h>

void aloca();

int main()
{
    aloca();
    return 0;
}

void aloca()
{
    int qtd;
    float *ptr, soma = 0, media;

    printf("Digite quantos numeros deseja: ");
    scanf("%d", &qtd);

    ptr = (float *)malloc(qtd * sizeof(float));

    if (ptr == NULL)
    {
        printf("Erro na alocacao de memoria.\n");
        return;
    }

    for (int i = 0; i < qtd; i++)
    {
        printf("Informe o %d numero: ", i + 1);
        scanf("%f", (ptr + i));
        soma += *(ptr + i);
    }

    media = soma / qtd;

    printf("\nSoma = %.2f", soma);
    printf("\nMedia = %.2f\n", media);

    free(ptr);
}
    