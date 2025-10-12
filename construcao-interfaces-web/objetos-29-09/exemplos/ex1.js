const cachorro = {
  raca: "Border collie",
  nome: "Bidu",
  sobrenome: "Borderer",
  idade: 10,
  peso: 16.5,

  nomeCompleto: function () {
    return `${this.nome} ${this.sobrenome}`;
  },
};

console.log(cachorro.nome);
console.log(cachorro["idade"]);
let p = "peso";
console.log(cachorro[p]);

console.log(cachorro);

console.log("\n", cachorro.nomeCompleto());
