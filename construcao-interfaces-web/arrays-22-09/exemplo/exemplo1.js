// ------------------------
// Criando Arrays
// ------------------------
const frutas = ["maçã", "banana", "laranja"];
const numeros = [10, 20, 30];
const misto = [1, "texto", true, [2, 3]];

// ------------------------
// Acessando elementos
// ------------------------
console.log(frutas[0]); // "maçã"
frutas[1] = "abacaxi";  // altera "banana" para "abacaxi"
console.log(frutas);    // ["maçã", "abacaxi", "laranja"]

// ------------------------
// Percorrendo arrays
// ------------------------
for (let i = 0; i < frutas.length; i++) {
    console.log(frutas[i]);
}

frutas.forEach((item, indice) => {
    console.log(`${indice}: ${item}`);
});

for (const fruta of frutas) {
    console.log(fruta);
}

// ------------------------
// Adicionando elementos
// ------------------------
frutas.push("morango");    // adiciona no final
frutas.unshift("uva");     // adiciona no início
console.log(frutas);       // ["uva", "maçã", "abacaxi", "laranja", "morango"]

// ------------------------
// Removendo elementos
// ------------------------
frutas.pop();   // remove o último ("morango")
frutas.shift(); // remove o primeiro ("uva")
console.log(frutas); // ["maçã", "abacaxi", "laranja"]

// ------------------------
// Acessando com at()
// ------------------------
console.log(frutas.at(0));  // "maçã"
console.log(frutas.at(-1)); // "laranja"

// ------------------------
// Concatenando arrays
// ------------------------
const vegetais = ["cenoura", "batata"];
const combinado = frutas.concat(vegetais);
console.log(combinado); // ["maçã", "abacaxi", "laranja", "cenoura", "batata"]

// ------------------------
// Usando splice()
// ------------------------
frutas.splice(1, 1, "kiwi", "mamão"); 
// remove 1 elemento do índice 1 e adiciona "kiwi" e "mamão"
console.log(frutas); // ["maçã", "kiwi", "mamão", "laranja"]

// ------------------------
// Buscando elementos
// ------------------------
console.log(frutas.indexOf("kiwi"));  // 1
console.log(frutas.lastIndexOf("kiwi")); // 1
console.log(frutas.includes("laranja")); // true

// ------------------------
// Ordenando arrays
// ------------------------
const letras = ["d", "b", "a", "c"];
letras.sort();    // ["a", "b", "c", "d"]
letras.reverse(); // ["d", "c", "b", "a"]

const nums = [100, 25, 5, 50];
nums.sort((a, b) => a - b); // [5, 25, 50, 100]
nums.sort((a, b) => b - a); // [100, 50, 25, 5]

// ------------------------
// forEach()
nums.forEach((num, i) => console.log(`Índice ${i}: ${num}`));
