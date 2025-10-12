// 🏟️ Imagine um time de futebol

// O time é como um array.

// Cada jogador é um valor dentro do array.

// Exemplo:

const jogadores = ["Neymar", "Vini Jr", "Rodrygo"];

// 📦

// O array é como uma fila de jogadores.

// Cada jogador tem uma posição numérica:

// Neymar → posição 0

// Vini Jr → posição 1

// Rodrygo → posição 2

// 🚶‍♂️ Como funciona o for…of

// O for…of serve para pegar direto cada valor (o jogador)
// sem precisar se preocupar com a posição.

for (let jogador of jogadores) {
  console.log(jogador);
}

// 👉 Na 1ª volta: jogador = "Neymar"
// 👉 Na 2ª volta: jogador = "Vini Jr"
// 👉 Na 3ª volta: jogador = "Rodrygo"

// Saída:

// Neymar
// Vini Jr
// Rodrygo

// ⚽ É como se você chamasse cada jogador pelo nome, sem perguntar a posição dele na fila.

// 🔎 Diferença entre for…in e for…of

// for…in → pega as CHAVES (números do array ou nomes das propriedades do objeto).

// for…of → pega os VALORES (o que está dentro do array ou coleção).

// Exemplo para comparar:

const frutas = ["Maçã", "Banana", "Uva"];

for (let i in frutas) {
  console.log("for...in:", i); // mostra os índices: 0, 1, 2
}

for (let fruta of frutas) {
  console.log("for...of:", fruta); // mostra os valores: Maçã, Banana, Uva
}

// for...in: 0
// for...in: 1
// for...in: 2
// for...of: Maçã
// for...of: Banana
// for...of: Uva

// ⚠️ Importante

// for…of NÃO funciona diretamente em objetos, porque objetos não são iteráveis.

// Para percorrer um objeto, use for…in ou Object.values(obj) com for…of.

// Exemplo:

const cachorro = {
  nome: "Scooby",
  raca: "Rotwailer",
  idade: 5,
};

// Para usar for...of, transformamos em array de valores:
for (let valor of Object.values(cachorro)) {
  console.log(valor);
}

// Scooby
// Rotwailer
// 5

// 🟢 Resumo Simples
// Tipo de loop	Anda por…	Exemplo ideal
// for normal	NÚMEROS (índices)	Contar de 1 a 10, percorrer arrays por posição
// for…in	CHAVES (nomes das propriedades ou índices do array)	Percorrer objetos
// for…of	VALORES (de arrays, strings, listas)	Percorrer elementos de arrays, caracteres de uma string
// ⚙️ Código para você testar

// Cole no seu arquivo .js:

// Exemplo com array
const frutas1 = ["Maçã", "Banana", "Uva"];

console.log("=== for...in ===");
for (let i in frutas1) {
  console.log("Índice:", i);
}

console.log("=== for...of ===");
for (let fruta of frutas1) {
  console.log("Fruta:", fruta);
}

// Exemplo com string
const palavra = "Olá";
console.log("=== for...of em string ===");
for (let letra of palavra) {
  console.log(letra);
}

// Exemplo com objeto usando Object.values
const cachorro2 = { nome: "Scooby", idade: 5, raca: "Rotwailer" };
console.log("=== for...of com Object.values ===");
for (let valor of Object.values(cachorro2)) {
  console.log(valor);
}
