const validaArray = function (arr, num) {
  try {
    if ((!arr && !num)) {
      throw new ReferenceError("Array ou numero não foram passados");
    }
    if (arr.length !== num) {
      throw new RangeError("Array com tamanho diferente do numero");
    }
    if (typeof arr !== 'object') {
      throw new TypeError("Array não é um objeto");
    }
    if (typeof num !== 'number') {
      throw new TypeError("Numero não é um numero");
    }
    return arr;
  } catch (e) {
    if (e instanceof RangeError) {
      console.log("RangeError");
      console.log(e.stack);
    }
    if (e instanceof ReferenceError) {
      console.log("ReferenceError");
      console.log(e.stack);
    }
    if (e instanceof TypeError) {
      console.log("TypeError");
      console.log(e.stack);
    }
  }
};


console.log(validaArray());