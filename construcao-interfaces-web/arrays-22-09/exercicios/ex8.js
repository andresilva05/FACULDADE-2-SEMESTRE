// 8. Crie dois arrays: arr1 = [1, 2, 3] e arr2 = [4, 5, 6]. Combine os dois arrays em um
// novo array usando concat(). Pesquise sobre o operador spread (...) e utilize-o para
// fazer a mesma operação.

const arr1 = [1, 2, 3];

const arr2 = [4, 5, 6];

let combinado = arr1.concat(arr2);

console.log(combinado);

combinado = [...arr1, ...arr2];

console.log(combinado);
