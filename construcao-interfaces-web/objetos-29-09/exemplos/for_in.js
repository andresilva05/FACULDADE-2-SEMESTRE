// 🏠 Agora imagine um objeto

// Um objeto é como uma casa com várias gavetas.
// Cada gaveta tem um nome (chave) e guarda algo (valor).

// Exemplo:

const cachorro1 = {
  raca: "Rotwailer",
  nome: "Scooby",
  idade: 5
};


// A casa é o cachorro.

// As gavetas são as chaves (raca, nome, idade).

// O que tem dentro das gavetas são os valores ("Rotwailer", "Scooby", 5).

// 🔄 O que o for…in faz

// O for…in serve para olhar uma gaveta de cada vez.

for (let chave in cachorro1) {
  console.log(chave, ":", cachorro1[chave]);
}


// 👉 Na primeira volta, chave = "raca"
// 👉 Na segunda, chave = "nome"
// 👉 Na terceira, chave = "idade"

// cachorro[chave] pega o que tem dentro da gaveta.

// 🔎 Diferença para o for normal

// for normal: anda por números (0,1,2,3…) — ideal para arrays e contagens.

// for…in: anda pelas chaves do objeto — ideal para objetos.

// 🐶 Exemplo completo
const cachorro2 = {
  raca: "Rotwailer",
  nome: "Scooby",
  idade: 5
};

for (let chave in cachorro2) {
  console.log(`\nA chave é ${chave} e o valor é ${cachorro2[chave]}`);
}


// 🎨 Resumo

// Pense no for normal como andar numa rua com casas numeradas (0,1,2…).

// Pense no for…in como abrir as gavetas de uma casa, uma por vez, sem se importar com números.

// O que muda é que o for…in pega nomes das gavetas (chaves) em vez de posições numéricas.