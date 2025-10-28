function exibirPessoa(pessoa) {
  const divUser = document.querySelector(".user");
  divUser.innerHTML = "";
  //imagem
  let img = document.createElement("img");
  img.src = pessoa.picture.large;

  let nome = ` ${pessoa.name.first} ${pessoa.name.last}`;

  let par = document.createElement("p");
  par.innerHTML = `Nome: ${nome}`;

  const genderFormatted = pessoa.gender === "female" ? "Feminino" : "Masculino";
  let parGenero = document.createElement("p");
  parGenero.innerHTML = `Gênero: ${genderFormatted}`;

  let idade = pessoa.dob.age;

  let parIdade = document.createElement("p");
  parIdade.innerHTML = `Idade: ${idade} `;

  let dataFormatada = new Date(pessoa.dob.date).toLocaleDateString("pt-BR");

  let parNascimento = document.createElement("p");
  parNascimento.innerHTML = `Data Nascimento: ${dataFormatada}`;

  //adiciona os elementos à div user
  divUser.appendChild(img);
  divUser.appendChild(par);
  divUser.appendChild(parGenero);
  divUser.appendChild(parIdade);
  divUser.appendChild(parNascimento);
}

async function obterNovaPessoa() {
  let url = "https://randomuser.me/api/?nat=br";
  let resposta = await fetch(url);

  if (resposta.ok) {
    let json = await resposta.json();

    // envio o primeiro elemento do array results
    exibirPessoa(json.results[0]);
  } else {
    console.log("Falhou em buscar pessoa.");
  }
}

window.onload = obterNovaPessoa;
const botao = document.querySelector("#botao");

botao.onclick = obterNovaPessoa;
