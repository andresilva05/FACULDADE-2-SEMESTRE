// const texto = "O Corinthians tem 20 mundiais";

// const er = /\d+/;

// const res = er.exec(texto);
// console.log(`O texto diz que o Corinthians tem ${res[0]} titulos mundiais`);

// const t = "O cep da minha residência é 14867-345";

// const er = /\d{5}-\d{3}$/;

// const cep = er.exec(t);

// console.log(`Seu cep é ${cep}`);

let t = "O CPF do cidadão é 123.321.123-56";

const er = /\d{3}.\d{3}.\d{3}-\d{2}$/;

const cpf = er.exec(t);

console.log(`Seu CPF é ${cpf}`);
