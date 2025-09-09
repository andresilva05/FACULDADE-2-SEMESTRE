function imprimeConsole(msg){

    console.log(msg);
}

function imprimeAlert(msg){

    alert(msg);
}

function imprimeHTML(msg){

    document.querySelector('#demo').innerHTML = msg;
}

function imprimeMensagem (nome, imprime){

   let mensagem = 'Olá, ' + nome + '!';
   
   imprime(mensagem);
}

imprimeMensagem('João', imprimeConsole);
imprimeMensagem('Maria', imprimeAlert);
imprimeMensagem('Antonio', imprimeHTML);