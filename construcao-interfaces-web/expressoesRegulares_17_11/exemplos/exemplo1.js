// Expressões regulares

//test
// const texto =
//   "Estou aprendendo a desenvolver sistemas no curso de Sistemas para Internet";

//   const er = /sistemas/i;

//   if (er.test(texto)){
//     console.log("Encontrou o padrão");

//   }
//   else{
//     console.log("Não encontrou o padrão");

//   }

const texto = "sistemas Sistemas SISTEMAS sIsTeMaS";

const er = /sistemas/gi;

let retorno;

console.log(retorno);

// exec retorna null, quando não encontra o padrão
while ((retorno = er.exec(texto)) != null) {
  console.log(`Encontrou ${retorno[0]} no ìndice ${retorno.index}`);
}
