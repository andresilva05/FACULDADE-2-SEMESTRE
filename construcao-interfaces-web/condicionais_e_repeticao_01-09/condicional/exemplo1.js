let texto;

if (Math.random() < 0.5) {
  texto = '<a href="http://ifsp.edu.br">IFSP Reitoral</a>';
} else {
  texto = '<a href="http://www.arq.ifsp.edu.br/">IFSP Araraquara</a>';
}

document.querySelector("#acesso").innerHTML = texto;
