const alunos = [
	{
		nome: 'João',
		nota: 5,
		turma: '1B',
	},
	{
		nome: 'Sofia',
		nota: 9,
		turma: '1B',
	},
	{
		nome: 'Paulo',
		nota: 6,
		turma: '2C',
	},
];

const alunosAprovados = function(alunos, media) {
  let alunosAprovados = [];

  for (let aluno in alunos) {
    const {nome, nota} = alunos[aluno];
    if (nota >= media) {
      alunosAprovados.push(nome);
    }
  }
  return alunosAprovados
}


console.log(alunosAprovados(alunos, 7));