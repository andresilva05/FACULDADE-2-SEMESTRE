const nameInput = document.querySelector("#name");
const nameError = document.querySelector("#name-error");
const passwordInput = document.querySelector("#password");
const passwordError = document.querySelector("#passwd-error");
const cpasswd = document.querySelector("#cpasswd");
const cpasswdError = document.querySelector("#cpasswd-error");

nameInput.addEventListener("input", () => {
  //apagar conteúdo da tag span de erro
  nameError.textContent = "";

  //Se houver um erro de padrão (atributo pattern)
  if (nameInput.validity.patternMismatch) {
    //Crio uma mensagem de erro
    const erroMsg = "Invalid name pattern";
    //Coloco a mensagem dentro da tag span de erro
    nameError.textContent = erroMsg;
    // Sinalizo o erro para API Contraint Validation
    nameInput.setCustomValidity(erroMsg);
  } else {
    //A chamada do método com string vazia, significa
    // que não houve erro
    nameInput.setCustomValidity("");
  }
});

cpasswdInput.addEventListener("submit", () => {});
const form = document.querySelector("#myform");

//Submissão do formulário
form.addEventListener("submit", (event) => {
  //Previne o comportamento padrão do evento
  //submit: cancela o evento do formulário
  event.preventDefault();

  //Se todos os campos estiverem válidos
  if (form.checkValidity()) {
    //Submeto o formulário
    form.submit();
  } else {
    console.log("Formulário inválido");
  }
});
