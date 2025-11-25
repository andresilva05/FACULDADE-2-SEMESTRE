// ======================
// 🍪 COOKIES
// ======================

// Criar cookie com expiração
function criarCookie() {
  const data = new Date();
  data.setDate(data.getDate() + 7); // 7 dias de validade
  document.cookie = `usuario=Andre; expires=${data.toUTCString()}; path=/`;
  alert("Cookie criado com sucesso!");
}

// Ler cookies existentes
function lerCookies() {
  alert("Cookies atuais: " + document.cookie);
}

// Apagar cookie
function apagarCookie() {
  document.cookie = "usuario=; expires=Thu, 01 Jan 1970 00:00:00 GMT; path=/";
  alert("Cookie apagado!");
}

// ======================
// 💾 LOCAL STORAGE
// ======================


function salvarLocal() {
  localStorage.setItem("tema", "escuro");
  const usuario = { nome: "André", idade: 21 };
  localStorage.setItem("usuario", JSON.stringify(usuario));
  alert("Itens salvos no localStorage!");
}

function lerLocal() {
  const tema = localStorage.getItem("tema");
  const usuario = JSON.parse(localStorage.getItem("usuario"));
  alert(`Tema: ${tema}\nUsuário: ${usuario.nome}, ${usuario.idade} anos`);
}

function removerLocal() {
  localStorage.removeItem("tema");
  alert("Item 'tema' removido!");
}

function limparLocal() {
  localStorage.clear();
  alert("localStorage limpo!");
}

// ======================
// 🕓 SESSION STORAGE
// ======================

function salvarSession() {
  sessionStorage.setItem("paginaAtual", "home");
  alert("SessionStorage salvo!");
}

function lerSession() {
  alert("Página salva: " + sessionStorage.getItem("paginaAtual"));
}

function removerSession() {
  sessionStorage.removeItem("paginaAtual");
  alert("Item 'paginaAtual' removido!");
}

function limparSession() {
  sessionStorage.clear();
  alert("sessionStorage limpo!");
}
