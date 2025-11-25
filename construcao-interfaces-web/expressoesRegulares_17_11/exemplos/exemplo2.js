// regex a partir de strings

const texto = "Meu gato é cinza e meu cachorro é marrom. Eu amo gato!";

// match() --> retorna um array de ocorrências do padrão

const er = /gato/ig;

let ocorrencias = texto.match(er);

console.log(ocorrencias);

console.log(`A palavra ocorre ${ocorrencias.length} vezes`);

//search() --> retorna o indice da ocorrência do padrão

ocorrencias = texto.search(er);

console.log(ocorrencias);

//replace() --> substitui a ocorrência do padrão

ocorrencias = texto.replace(er, "cavalo");

console.log(ocorrencias);
