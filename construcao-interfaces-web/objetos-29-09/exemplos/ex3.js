//Função construtora
function Cachorro(raca, nome, sobrenome, idade) {
  this.raca = raca;
  this.nome = nome;
  this.sobrenome = sobrenome;
  this.idade = idade;
  this.peso = 0;
  this.dono = "abandonado";

  this.nomeCompleto = function () {
    return `\n${this.nome}  ${this.sobrenome}`;
  };
}

const cachorro1 = new Cachorro("Rotwailer", "Scooby", "Doo", 5);

const cachorro2 = new Cachorro("Viralata", "Billy", "Men", 3);

const cachorro3 = new Cachorro("Pitbuul", "Ranger", "Donuts", 4);

console.log(cachorro1.nomeCompleto());

console.log(cachorro2.nomeCompleto());

console.log(cachorro3.nomeCompleto());

