// 1. Crie uma página com um único botão e um parágrafo. Cada vez que o botão for
// clicado, o número no parágrafo deve ser incrementado. Se o usuário fechar a página
// e abri-la novamente, a contagem deve continuar de onde parou. Dica: Ao carregar a
// página, verifique se o valor existe no localStorage. Se não existir, inicialize-o com 0.
// Se existir, leia o valor e continue a contagem.

const paragrafo = document.getElementById("contador");
const botao = document.getElementById("botao");

// Ao carregar a página, verifica se já existe valor salvo
let contador = localStorage.getItem("contador");

if (contador === null) {
  contador = 0; // se não existir, começa em 0
} else {
  contador = Number(contador); // converte pra número
}

paragrafo.textContent = contador; // mostra o valor inicial

// Quando o botão for clicado
botao.addEventListener("click", () => {
  contador++;
  paragrafo.textContent = contador;
  localStorage.setItem("contador", contador);
});
