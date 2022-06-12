const body = document.querySelector("body");
const h1 = document.querySelector("#page-title");
const footer = document.querySelector("footer");
const button = document.querySelector("#mode-selector");

// console.log(typeof button.classList);
// console.log(button.classList.values());
// console.log(footer);
// console.log(h1);

button.addEventListener("click", () => {
  body.classList.toggle("dark-mode");
  // console.log(h1)
  footer.classList.toggle("dark-mode");
  button.classList.toggle('dark-mode');
  // console.log(button.classList);
  button.innerHTML = button.classList.contains('dark-mode') ? 'Light Mode' : 'Dark Mode';
  h1.innerHTML = body.classList.contains('dark-mode') ? 'Dark Mode On': 'Light Mode On'

});
