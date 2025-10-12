// 4. Com o mesmo objeto do exercício anterior, use Object.entries() para percorrer as
// propriedades e valores, e exiba-os no console no formato: "propriedade: valor".

const pessoa = { nome: "Ana", idade: 25, cidade: "São Paulo" };

for (const [chave, valor] of Object.entries(pessoa)) {
  console.log(`${chave}: ${valor}`);
}

for (let chave in pessoa) {
  console.log(chave + ": " + pessoa[chave]);
}