function checkPalindrome(sentence) {
  if (!string) return;
  let reverseSentence = sentence.replace(/ /g, '').split('').reverse().join('')
  let cleanSentence = sentence.replace(/ /g, '')
  return cleanSentence === reverseSentence;
}

const sentence = 'roma me tem amor';

console.log(checkPalindrome(sentence));