const novo = document.createElement("p");

novo.innerHTML = "Sou Novo Aqui!";

const divRemovida = document.getElementById("pai");

const botao = document
  .getElementById("botao")
  .addEventListener("click", function () {
    divRemovida.parentNode.replaceChild(novo, divRemovida);
  });
