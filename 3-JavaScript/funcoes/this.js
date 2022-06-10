const eddie = {
  nome: 'Eddie',
  idade: 11
}

const Paulo = {
  nome: 'Paulo',
  idade: 21
}



function calculaIdade(anos) {
	return `Daqui a ${anos} anos, ${this.nome} terá ${
		this.idade + anos
	} anos de idade.`;
}

const caculaIdadeEddie = calculaIdade.apply(eddie, [10]);
console.log(caculaIdadeEddie);

const calculaIdadePaulo = calculaIdade.call(Paulo, 10)
console.log(calculaIdadePaulo);