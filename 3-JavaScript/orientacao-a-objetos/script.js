class ContaBancaria {
  constructor(agencia, numero, tipo) {
    this.agencia = agencia;
    this.numero = numero;
    this.tipo = tipo;
    this._saldo = 0;
  }

  get saldo() {
    return this._saldo;
  }

	set saldo(valor) {
		this._saldo = valor;
	}

  sacar(valor) {
    if (valor > this._saldo) {
      return console.log("Saldo insuficiente");
    }

    this._saldo -= valor;
    return this._saldo
  }

  depositar(valor) {
    this._saldo += valor;
    return this._saldo
  }
}

class ContaCorrente extends ContaBancaria {
  constructor(cartaoCredito) {
    super(...arguments);
    this._cartaoCredito = cartaoCredito;
    this.tipo = "conta corrente";
  }
    
  get cartaoCredito() {
    return this._cartaoCredito;
  }

  set cartaoCredito(valor) {
    this._cartaoCredito = valor
  }
  
}

class ContaPoupanca extends ContaBancaria {
  constructor() {
    super(...arguments);

    this.tipo = "conta poupança";
  }

}


class ContaUniversitaria extends ContaBancaria {
  constructor() {
    super(...arguments);
    this.tipo = "conta universitaria";
  }

  sacar(valor) {
    if (valor >= 500) {
      console.log("Não é possível sacar mais de 500 reais");
    } else {
      this.valor -= valor;
    }
  }
}

const minhaConta = new ContaCorrente(1, 211, true);
const contaUni = new ContaUniversitaria(2, 333);

minhaConta.depositar(1000);
contaUni.depositar(500);
contaUni.sacar(400)
