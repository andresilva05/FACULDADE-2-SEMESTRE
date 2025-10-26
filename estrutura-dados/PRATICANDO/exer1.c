// Crie um programa que:

// Peça ao usuário um número inteiro;

// Use uma função com ponteiro para dobrar o valor desse número;

// Mostre o valor antes e depois da chamada da função.

// 💡 Exemplo de saída esperada:

// Digite um número: 5
// Antes da função: 5
// Depois da função: 10

#include <stdio.h>

void dobraValor(int *num);

int main()
{

    int num;

    printf("Digite um numero inteiro: ");
    scanf("%d", &num);

    printf("\n\nAntes da funcao: %d", num);

    dobraValor(&num);

    printf("\nDepois da funcao: %d", num);
    return 0;
}

void dobraValor(int *num)
{

    *num = *num * 2;
}
