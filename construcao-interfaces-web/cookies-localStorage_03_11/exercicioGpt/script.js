function getCookie(nomeCookie) {
  let nome = nomeCookie + "=";

  let ca = document.cookie.split(";");

  for (let i = 0; i < ca.length; i++) {
    let c = ca[i];

    //retira espaços em branco no inicio da string
    while (c.charAt(0) == " ") {
      c = c.substring(1);
    }

    //encontrou o cookie
    if (c.indexOf(nome) == 0) {
      //corta a string para pegar o valor do cookie
      return c.substring(nome.length, c.length);
    }
  }
  return "";
}

const saudacaoEl = document.getElementById("saudacao");
let usuario = getCookie("usuario");

if (usuario !== "") {
  saudacaoEl.innerHTML = `👋 Bem-vindo de volta, ${decodeURIComponent(
    usuario
  )}!`;
} else {
  const nome = prompt("Digite seu nome:");
  if (nome) {
    criarCookie(nome);
    saudacaoEl.innerHTML = `👋 Bem-vindo, ${nome}!`;
  }
}

function criarCookie(nomeUsuario) {
  const data = new Date();
  data.setDate(data.getDate() + 7); // 7 dias
  document.cookie = `usuario=${encodeURIComponent(
    nomeUsuario
  )}; expires=${data.toUTCString()}; path=/`;
}

// Ler cookies existentes
function lerCookies() {
  alert("Cookies atuais: " + document.cookie);
}

function apagarCookie() {
  document.cookie = "usuario=; expires=Thu, 01 Jan 1970 00:00:00 GMT; path=/";
  const saudacaoEl = document.getElementById("saudacao");
  saudacaoEl.innerHTML = "";
  alert("Cookie apagado!");
}

function aplicarTema(tipo) {
  if (tipo === "escuro") {
    document.body.style.backgroundColor = "#111";
    document.body.style.color = "#fff";
  } else {
    document.body.style.backgroundColor = "#fff";
    document.body.style.color = "#000";
  }
  localStorage.setItem("tema", tipo); // salva escolha
}

window.addEventListener("load", function () {
  const temaSalvo = localStorage.getItem("tema");
  if (temaSalvo) {

    aplicarTema(temaSalvo);
  }
  // também registrar a página atual na sessionStorage
  sessionStorage.setItem("ultimaPagina", "index.html");
  console.log("Última página aberta nesta sessão: index.html");
});
