const citacao = "Silva, Marcos";

//             $1     $2
const er = /^(\w+), (\w+)$/;

const textoFormatado = citacao.replace(er, "$2 $1");

console.log(textoFormatado);
