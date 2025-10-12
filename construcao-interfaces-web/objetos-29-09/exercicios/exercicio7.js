// <!-- 7. Utilizando a classe ContaBancaria do exercício anterior, crie:
// a. Um getter chamado informacoes que retorna uma string com o titular e saldo.
// b. Um setter chamado alterarTitular que permite alterar o nome do titular. -->

class ContaBancaria {
  constructor(titular, saldo) {
    this.titular = titular;
    this.saldo = saldo;
  }

  // Getter: retorna informações como string
  get informacoes() {
    return `Titular: ${this.titular}\nSaldo: R$ ${this.saldo}`;
  }

  // Setter: altera o titular, se for diferente do atual
  set alterarTitular(novoTitular) {
    if (novoTitular !== this.titular) {
      this.titular = novoTitular;
    } else {
      console.log("Novo titular não deve ser igual ao atual");
    }
  }
}

// Criando objeto
const conta1 = new ContaBancaria("André", 2000);

// Usando getter
console.log(conta1.informacoes);

// Usando setter
conta1.alterarTitular = "Ana";

// Conferindo a alteração
console.log(conta1.informacoes);
