#include <stdio.h>
#include <string.h>

// Definição da struct
typedef struct {
    char nome[50];
    int idade;
} Pessoa;

// Função que recebe a struct por valor
void altera_pessoa_por_valor(Pessoa p) {
    printf("Alterando dentro da funcao (por valor)...\n");
    p.idade = 30; // Altera a copia
    printf("Idade dentro da funcao: %d\n", p.idade);
}

int main() {
    Pessoa minha_pessoa;
    strcpy(minha_pessoa.nome, "Maria");
    minha_pessoa.idade = 25;

    printf("Idade original: %d\n", minha_pessoa.idade);

    // Chamada da funcao, passando a struct por valor
    altera_pessoa_por_valor(minha_pessoa);

    printf("Idade apos a funcao: %d\n", minha_pessoa.idade); // O valor permanece o mesmo

    return 0;
}