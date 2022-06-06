const checkNumbers = (num1, num2) => {
  let equal = null
  const soma = num1 + num2
  if (num1 === num2) {
    equal = true
  } else {
    equal = false
  }

  console.log(`Os números ${num1} e ${num2} ${equal ? 'são': 'não são'} iguais. Sua soma é ${soma}, que é ${soma > 10 ? 'maior que 10' : 'menor que 10'} e ${soma > 20 ? 'maior que 20' : 'menor que 20'}`)
}

checkNumbers(11, 11)