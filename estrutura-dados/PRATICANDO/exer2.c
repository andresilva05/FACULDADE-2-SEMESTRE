// 🧩 Exercício: Cadastro de pessoa

// Crie uma struct chamada Pessoa com os campos:

// nome (string)

// idade (int)

// No main, peça para o usuário digitar o nome e a idade de uma pessoa.

// Crie uma função chamada fazAniversario que:

// Recebe um ponteiro para a struct Pessoa;

// Aumenta a idade da pessoa em 1.

// Mostre antes e depois da chamada da função:

// Idade original

// Idade após o “aniversário”

// 💡 Exemplo de saída esperada:

// Digite o nome: Ana
// Digite a idade: 25
// Antes do aniversario: 25
// Depois do aniversario: 26

#include <stdio.h>

typedef struct
{

    char nome[100];
    int idade;
} Pessoa;

void fazAniversario(Pessoa *ptr);

int main(int argc, char const *argv[])
{
    Pessoa primeiraPessoa;

    printf("Digite seu nome: ");
    scanf("%s", &primeiraPessoa.nome);

    printf("\nInforme sua idade: ");
    scanf("%d", &primeiraPessoa.idade);

    printf("\n\nIdade antes do aniversario: %d", primeiraPessoa.idade);

    fazAniversario(&primeiraPessoa);
    printf("\n\nIdade depois do aniversario: %d", primeiraPessoa.idade);

    return 0;
}

void fazAniversario(Pessoa *ptr)
{
    ptr->idade++;
}
