#include <stdio.h>

void lerVetor(int v[], int tam)
{
    for (int i = 0; i < tam; i++)
    {
        printf("Digite o %dº numero: ", i + 1);
        scanf("%d", &v[i]);
    }
}

void mostrarVetor(int v[], int tam)
{
    for (int i = 0; i < tam; i++)
    {
        printf("%d ", v[i]);
    }
    printf("\n");
}

// a) Ordenação por troca (bubble sort simples)
void ordenacaoTroca(int v[], int tam)
{
    int aux;
    for (int i = 0; i < tam - 1; i++)
    {
        for (int j = 0; j < tam - 1; j++)
        {
            if (v[j] > v[j + 1])
            {
                aux = v[j];
                v[j] = v[j + 1];
                v[j + 1] = aux;
            }
        }
    }
}

// b) Ordenação por inserção (insertion sort)
void ordenacaoInsercao(int v[], int tam)
{
    int chave, j;

    for (int i = 1; i < tam; i++)
    {
        chave = v[i];
        j = i - 1;

        while (j >= 0 && v[j] > chave)
        {
            v[j + 1] = v[j];
            j--;
        }

        v[j + 1] = chave;
    }
}

int main()
{
    int vetor[5];

    printf("=== Cadastro dos numeros ===\n");
    lerVetor(vetor, 5);

    int vetorTroca[5];
    int vetorInsercao[5];

    for (int i = 0; i < 5; i++)
    {
        vetorTroca[i] = vetor[i];
        vetorInsercao[i] = vetor[i];
    }

    // Ordenação por troca
    ordenacaoTroca(vetorTroca, 5);
    printf("\nOrdenacao por troca: ");
    mostrarVetor(vetorTroca, 5);

    // Ordenação por inserção
    ordenacaoInsercao(vetorInsercao, 5);
    printf("Ordenacao por insercao: ");
    mostrarVetor(vetorInsercao, 5);

    return 0;
}
