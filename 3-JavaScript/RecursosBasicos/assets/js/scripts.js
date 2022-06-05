const currentNumberWrapper = document.getElementById("currentNumber");
let currentNumber = currentNumberWrapper.innerHTML;
const incrementButton = document.getElementById("increment");
const decrementButton = document.getElementById("decrement");

console.log(decrementButton);

incrementButton.addEventListener("click", function () {
  if (currentNumber < 10) {
    currentNumber++;
    currentNumberWrapper.innerHTML = currentNumber;
  }
  if (currentNumber < 0) {
    currentNumberWrapper.style.color = "red";
  } else {
    currentNumberWrapper.style.color = "white";
  }
});

decrementButton.addEventListener("click", function () {
  if (currentNumber > -10) {
    currentNumber--;
    currentNumberWrapper.innerHTML = currentNumber;
  }
  if (currentNumber < 0) {
    currentNumberWrapper.style.color = "red";
  } else {
    currentNumberWrapper.style.color = "white";
  }
});
