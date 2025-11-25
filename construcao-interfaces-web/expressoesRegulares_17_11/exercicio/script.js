const inputNome = document.getElementById("username");
const inputErrorName = document.getElementById("erro-username");

const inputTelefone = document.getElementById("telefone");
const spanErrorTelefone = document.getElementById("erro-telefone");
const er = /^[a-z0-9_]+$/;

inputNome.addEventListener("input", () => {
  inputErrorName.textContent = "";

  if (inputNome.value === "") {
    const msgErro = "O nome de usuário é obrigatório.";

    inputErrorName.textContent = msgErro;

    return;
  } else if (inputNome.value.length < 5) {
    const msgErro = "O nome de usuário deve ter pelo menos 5 caracteres.";

    inputErrorName.textContent = msgErro;

    return;
  } else if (!er.test(inputNome.value)) {
    const msgErro = "Use apenas letras minúsculas, números e underscore (_).";

    inputErrorName.textContent = msgErro;

    return;
  }
});

const padraoTelefone = /^\(\d{2}\) 9\d{4}-\d{4}$/;

inputTelefone.addEventListener("input", () => {
  spanErrorTelefone.textContent = "";

  if (inputTelefone.value === "") {
    spanErrorTelefone.textContent = "";
    return;
  } else if (!padraoTelefone.test(inputTelefone.value)) {
    const msgErro = "O formato do celular deve ser (XX) 9XXXX-XXXX.";

    spanErrorTelefone.textContent = msgErro;

    return;
  }
});
