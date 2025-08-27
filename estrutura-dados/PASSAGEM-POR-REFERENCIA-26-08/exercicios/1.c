#include <stdio.h>

// Função que recebe um número por valor (porValor) e um ponteiro para inteiro (porReferencia)
// A ideia é dobrar o primeiro número (não afeta a variável original, pois é por valor)
// e triplicar o segundo número (afeta a original, pois é por referência)
void dobrar_e_triplicar(int porValor, int *porReferencia);

int main() {
    int numero_a = 5, numero_b = 10; // Variáveis iniciais

    // Exibe os valores antes da chamada da função
    printf("--- Antes da chamada da funcao ---");
    printf("\nValor de numero_a: %d", numero_a);
    printf("\nValor de numero_b: %d", numero_b);

    // Chamada da função:
    // - Passamos numero_a por valor (apenas uma cópia)
    // - Passamos o endereço de numero_b (&numero_b) para permitir alteração real
    dobrar_e_triplicar(numero_a, &numero_b);

    // Exibe os valores após a chamada
    printf("\n\n--- Depois da chamada da funcao ---");
    printf("\nValor de numero_a (na main): %d", numero_a); // continua igual, pois foi por valor
    printf("\nValor de numero_b (na main): %d\n", numero_b); // alterado, pois foi por referência

    return 0;
}

// Implementação da função
void dobrar_e_triplicar(int porValor, int *porReferencia) {
    // Dobra o valor da variável recebida por valor (não altera a original)
    porValor = porValor * 2;

    // Exibe o valor dobrado dentro da função
    printf("\n\nDentro da funcao:");
    printf("\nO dobro do primeiro valor (por valor): %d", porValor);

    // Triplica o valor da variável apontada pelo ponteiro (altera a original)
    *porReferencia = (*porReferencia) * 3;

    // Exibe o novo valor do segundo número após a alteração
    printf("\nO triplo do segundo valor (por referencia): %d", *porReferencia);
}
