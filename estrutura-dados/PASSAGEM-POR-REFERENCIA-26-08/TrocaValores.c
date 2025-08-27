#include <stdio.h>

// Protótipo da função que troca os valores
void troca_valores(int *ptr_a, int *ptr_b);

int main() {
    int a = 10, b = 50;
    
    printf("Valores antes da troca: a = %d, b = %d\n", a, b);
    
    // Passa os endereços de a e b para a função
    troca_valores(&a, &b);
    
    printf("Valores depois da troca: a = %d, b = %d\n", a, b);
    
    return 0;
}

// Implementação da função que troca os valores
void troca_valores(int *ptr_a, int *ptr_b) {
    int temp = *ptr_a;
    *ptr_a = *ptr_b;
    *ptr_b = temp;
}