// 5. Crie um objeto livro = {titulo: "1984", autor: "George Orwell", ano: 1949}. Utilize
// desestruturação para extrair titulo e autor em variáveis separadas e exiba-as no
// console.

const livro = { titulo: "1984", autor: "George Orwell", ano: 1949 };

let { titulo, autor } = livro;

console.log(`Titulo: ${titulo}`);
console.log(`Autor: ${autor}`);
