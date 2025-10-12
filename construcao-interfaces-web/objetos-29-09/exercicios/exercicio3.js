// 3. Dado o objeto pessoa = {nome: "Ana", idade: 25, cidade: "São Paulo"}, use um loop
// for..in para exibir todas as propriedades e seus valores no console.

const pessoa = { nome: "Ana", idade: 25, cidade: "São Paulo" };

for (let chave in pessoa) {
  console.log(`A chave é ${chave} e seu valor é ${pessoa[chave]}`);
}
