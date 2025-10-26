const input = document.getElementById("digita");

const botao = document.getElementById("botao");

botao.onclick = function (e) {
  const texto = input.value;
  const li = document.createElement("li");
  const lista = document.querySelector("ul");

  li.textContent = texto;

  lista.appendChild(li);
  input.value = "";

  li.addEventListener("click", function () {
    li.remove();
    input.value = "";
  });
};
