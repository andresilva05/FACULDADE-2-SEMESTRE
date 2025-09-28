// 7. Crie um array [10, 25, 30, 45, 50]. Pesquise sobre as funções filter() e reduce(). Use
// filter() para criar um novo array apenas com números maiores que 30. Use reduce()
// para somar todos os números do array original.

const numeros = [10, 25, 30, 45, 50];

const maiorTrinta = numeros.filter((num) => num > 30);

const soma = numeros.reduce((a, b) => a + b);

console.log(`Novo array: ${maiorTrinta} \nSoma do array original: ${soma}`);
