const botao = document.getElementById("botao");
botao.addEventListener("click", function (e) {
  let li = document.createElement("li");

  li.innerHTML =
    " Lorem ipsum dolor sit amet consectetur adipisicing elit. Cupiditate dolorum aut quis totam excepturi hic eaque in sed maxime aliquam consequuntur dolore ratione doloremque aperiam, culpa, et illo tempora est.";
  document.querySelector("ul").appendChild(li);
});
