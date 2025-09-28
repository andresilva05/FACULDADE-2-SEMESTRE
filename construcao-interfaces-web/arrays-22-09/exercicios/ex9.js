// 9. Crie um array [1, 2, 2, 3, 4, 4, 5]. Crie um novo array sem elementos duplicados.

const meuSet = new Set([1, 2, 2, 3, 4, 4, 5]);

const novoArray = [...meuSet]; // vira [1, 2, 3, 4, 5]

console.log(novoArray);
