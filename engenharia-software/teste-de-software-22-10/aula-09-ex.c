#include <stdio.h>

void verificaTriangulo(int a, int b, int c);

int main()
{
    int x, y, z;
    int opcao = 0;

    do
    {
        printf("Digite os tres lados do triangulo: ");
        scanf("%d %d %d", &x, &y, &z);

        verificaTriangulo(x, y, z);

        printf("Deseja sair? (sair = 0) ");
        scanf("%d", &opcao);
    } while (opcao != 0);

    return 0;
}

// Funcao que verifica o tipo de triangulo
void verificaTriangulo(int a, int b, int c)
{
    // Primeiro, verifica se os lados podem formar um triangulo
    if ((a + b > c) && (a + c > b) && (b + c > a))
    {
        // Se for triangulo, identifica o tipo
        if (a == b && b == c)
        {
            printf("Triangulo Equilatero\n");
        }
        else if (a == b || a == c || b == c)
        {
            printf("Triangulo Isosceles\n");
        }
        else
        {
            printf("Triangulo Escaleno\n");
        }
    }
    else
    {
        printf("Os lados informados nao formam um triangulo.\n");
    }
}
