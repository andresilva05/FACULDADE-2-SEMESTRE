#include <stdio.h>

int main()
{
    int X[5];
    int i, j, eleito;
    // clrscr() é específico de conio.h e não tem um equivalente padrão em stdio.h
    // Se precisar limpar a tela, a solução é dependente do sistema operacional

    // carregando os números no vetor
    for (i = 0; i <= 4; i++)
    {
        printf("Digite o %dº numero: ", i + 1);
        scanf("%d", &X[i]);
    }

    // ordenando de forma crescente
    // laço com a quantidade de elementos do vetor – 1
    for (i = 1; i <= 4; i++)
    {
        eleito = X[i];
        j = i - 1;
        // laço que percorre os elementos à
        // esquerda do número eleito
        // ou até encontrar a posição para
        // recolocação do número eleito
        // respeitando a ordenação procurada
        while (j >= 0 && X[j] > eleito)
        {
            X[j + 1] = X[j];
            j = j - 1;
        }
        X[j + 1] = eleito;
    }

    // mostrando o vetor ordenado
    for (i = 0; i <= 4; i++)
    {
        printf("%dº numero: %d\n", i + 1, X[i]);
    }
    return 0;
}