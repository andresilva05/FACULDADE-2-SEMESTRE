// 1. Crie um objeto literal carro com as propriedades: marca, modelo e ano.
// a. Exiba no console a marca e o modelo do carro.
// b. Adicione uma nova propriedade cor ao objeto e exiba-a no console.
// c. Adicione um método detalhes() ao objeto carro que retorne uma string com
// todas as informações do carro (Ex.: "Marca: Toyota, Modelo: Corolla, Ano:
// 2020, Cor: Prata").
// d. Chame o método e exiba o resultado no console.

const carro = {
  marca: "Chevrolet",
  modelo: "Jetta",
  ano: 2023,

  detalhes() {
    return `======== INFORMAÇÕES SOBRE O CARRO ========\n\nMarca: ${this.marca}\nModelo: ${this.modelo}\nAno: ${this.ano}\nCor: ${this.cor}`;
  },
};

carro.cor = "Preto";

console.log(carro.detalhes());
