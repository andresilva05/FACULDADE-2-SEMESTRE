// 6. Crie um array de números [1, 2, 3, 4, 5]. Pesquise sobre a função map(). Crie um
// novo array multiplicando cada número por 2 usando map().

const numeros = [1, 2, 3, 4, 5];

const doubles = numeros.map((num) => num * 2);

for (let i = 0; i < numeros.length; i++) {
  console.log(doubles[i]);
}
