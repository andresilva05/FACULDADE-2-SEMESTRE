#include <stdio.h>
#include <string.h>

// Definição da struct
typedef struct {
    char nome[50];
    int idade;
} Pessoa;

// Função que recebe um ponteiro para a struct (por referência)
void altera_pessoa_por_referencia(Pessoa *p) {
    printf("Alterando dentro da funcao (por referencia)...\n");
    p->idade = 30; // Altera a struct original
    printf("Idade dentro da funcao: %d\n", p->idade);
}

int main() {
    Pessoa minha_pessoa;
    strcpy(minha_pessoa.nome, "Maria");
    minha_pessoa.idade = 25;

    printf("Idade original: %d\n", minha_pessoa.idade);

    // Chamada da funcao, passando o endereco da struct
    altera_pessoa_por_referencia(&minha_pessoa);

    printf("Idade apos a funcao: %d\n", minha_pessoa.idade); // O valor e alterado

    return 0;
}