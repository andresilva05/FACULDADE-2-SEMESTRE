const botoes = document.getElementsByClassName("botao");

for (let i = 0; i < botoes.length; i++) {
  botoes[i].innerHTML = "Clique Aqui!";

  const br = document.createElement("br");

  const pai = botoes[i].parentNode;
  pai.insertBefore(br, botoes[i].nextSibling);
}
