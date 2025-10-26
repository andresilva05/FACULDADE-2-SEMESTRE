//Acessar elementos do DOM

// getElementById: acessa elementos pelo atributo id da tag

const subtitulo = document.getElementById("sub1");

console.log(subtitulo.innerHTML);

// getElementByTagName: acessa elesmentos pelo nome da tag
// Retorna uma HTMLCollecion (funciona parecido com um array)
const paragrafos = document.getElementsByTagName("p");

// console.log(paragrafos[1].innerHTML);

for (let i = 0; i < paragrafos.length; i++) {
  console.log(`Paragrafo ${i}: ${paragrafos[i].innerHTML} `);
}

// getElementsByClassName: acessa todos elementos de uma mesma classe. Também retorna um HTMLCollecion

const destaques = document.getElementsByClassName("destaque");

for (let i = 0; i < destaques.length; i++) {
  destaques[i].style.color = "red";
  destaques[i].style.backgroundColor = "yellow";
}

//querySelector: acessa os elementos pelo seletor CSS
//querySelectorAll
const d = document.querySelectorAll(".destaque");

for (let i = 0; i < destaques.length; i++) {
  d[i].style.color = "green";
}

// Mudar elementos do DOM
const link = document.querySelector("a");

link.href = "httP://www.google.com";
link.innerHTML = "Google";
link.target = "_blank";
link.style.fontFamily = "Arial";

//Adicionar elementos

//1º) Criar o novo nó
const novoLink = document.createElement("a");

novoLink.href = "http://www.ifsp.edu.br";
novoLink.innerHTML = "IFSP";

//2º) Adiciona o novo nó ao nó pai
const secao = document.getElementById("primeira");

//Adiciona o nó filho ao final da seção
secao.appendChild(novoLink);

// insertBefore(): insere nó antes de outro nó

const p = document.getElementsByTagName("p")[1];

secao.insertBefore(novoLink, p);

const h1 = document.querySelector("h1");
h1.remove();

// removeChild()

const pai = document.querySelector("main");
const filho = document.querySelector("#primeira");

//pai.removeChild(filho);

filho.parentElement.removeChild(filho);
