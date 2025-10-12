// 2. Crie uma função construtora Pessoa com os parâmetros nome, idade e profissao.
// a. Crie dois objetos usando a função construtora.
// b. Adicione um método saudar() que exiba "Olá, meu nome é [nome]".

function Pessoa(nome, idade, profissao) {
  this.nome = nome;
  this.idade = idade;
  this.profissao = profissao;

  this.saudar = function () {
    return `Olá, meu nome é ${this.nome} e sou ${this.profissao}`;
  };
}

const pessoa1 = new Pessoa("André", 20, "Técnico de Internet");

const pessoa2 = new Pessoa("Teté", 21, "Desenvolvedor front-end junior");

console.log(pessoa1.saudar());

console.log(pessoa2.saudar());
