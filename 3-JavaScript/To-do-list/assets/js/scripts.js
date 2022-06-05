const taskWrapper = document.querySelector('.tasks-list');
const addButton = document.querySelector('.button');
const inputText = document.querySelector('.input')
// console.log(taskWrapper)
// taskWrapper.appendChild(document.createElement('div'));
// taskWrapper.childNodes[0].innerHTML = 'teste'

inputText.addEventListener('onChangeText', function(e) {
  inputText.value = e.event.target
})

addButton.addEventListener('click', function(e) {
  // creating a wrapper for the checkbox and task
  const newWrapper = document.createElement('div');
  // adding a class name
  newWrapper.className = 'task-wrapper';
  // creating a div for the task
  const newDiv = document.createElement('div');
  newDiv.className = 'task';
  // setting the text as the content of the input
  const newText = document.createTextNode(inputText.value);
  console.log(newDiv)
  // creating a checkbox
  const checkBox = document.createElement('input');
  checkBox.type = 'checkbox';
  checkBox.className = 'task-checkbox'
  newDiv.appendChild(newText);
  newWrapper.appendChild(checkBox);
  newWrapper.appendChild(newDiv);
  taskWrapper.appendChild(newWrapper);
})