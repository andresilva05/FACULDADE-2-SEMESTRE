// 6. Crie uma classe ContaBancaria com propriedades titular, saldo e métodos
// depositar(valor) e sacar(valor).
// a. Crie um objeto da classe e teste os métodos.
// b. Garanta que não seja possível sacar um valor maior que o saldo.

class ContaBancaria {
  constructor(titular, saldo) {
    this.titular = titular;
    this.saldo = saldo;
  }

  sacar(valor) {
    if (valor > this.saldo) {
      return console.log(
        `Saldo menor que o saque\nValor saldo: R$${this.saldo}`
      );
    } else {
      this.saldo = this.saldo - valor;
    }
  }

  depositar(valor) {
    return (this.saldo = this.saldo + valor);
  }

  infoConta() {
    return `Titular: ${this.titular}\n
    Saldo: R$ ${this.saldo}
    `;
  }
}

const conta1 = new ContaBancaria("André", 2000);

console.log(`Conta criada com sucesso:\n${conta1.infoConta()}`);

conta1.depositar(200);
console.log(`Depósito de R$ 200 realizado. Saldo atual: R$ ${conta1.saldo}`);

conta1.sacar(300);
console.log(`Saque de R$ 300 realizado. Saldo atual: R$ ${conta1.saldo}`);

conta1.sacar(5000); // saque maior que o saldo
