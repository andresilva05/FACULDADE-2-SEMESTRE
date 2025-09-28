// 5. Crie um array [5, 1, 10, 3]. Ordene os números em ordem crescente usando sort()
// com função de comparação.

const numeros = [5, 1, 10, 3];

// Ordena em ordem crescente usando função de comparação
numeros.sort((a, b) => a - b);

console.log(numeros); // [1, 3, 5, 10]
