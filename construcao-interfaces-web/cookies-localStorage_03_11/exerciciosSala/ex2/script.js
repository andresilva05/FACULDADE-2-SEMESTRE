// 2. Crie uma página que, na primeira visita do usuário, exibe um prompt pedindo seu
// nome. Após o usuário inserir o nome, salve-o em um cookie que expira em 30 dias.
// Nas visitas seguintes, a página deve exibir uma mensagem "Olá, [Nome do
// Usuário]!" sem perguntar o nome novamente.

const nome = document.cookie;

if (nome === "") {
  nome = prompt("Digite seu nome:");
} 
else{
    
}

// Criar cookie com expiração
function criarCookie() {
  const data = new Date();
  data.setDate(data.getDate() + 30); // 7 dias de validade
  document.cookie = `usuario= ; expires=${data.toUTCString()}; path=/`;
  alert("Cookie criado com sucesso!");
}

// Ler cookies existentes
function lerCookies() {
  alert("Cookies atuais: " + document.cookie);
}

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
