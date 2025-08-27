/* Cubo de uma variável usando chamada por valor */
#include <stdio.h>
int CuboPorValor(int n); /* protótipo */
int main(void)
{
    int numero = 5; /* inicializa número */
    printf("0 valor original do numero eh %d", numero);
    /* passa numero por valor a CuboPorValor */
    numero = CuboPorValor(numero);
    printf("\n0 novo valor do numero eh %d\n", numero);
    return 0; /* indica conclusão bem-sucedida */
    /* fim do main */
}

/* calcula e retorna cubo do argumento inteiro */
int CuboPorValor(int n)
{
    return n * n * n; /* calcula cubo da variável local n e retorna resultado */
}
/* fim da função CuboPorValor */