const num1 = 20
const num2 = 3
const name = "Chamakh"

function multiply() {
    return num1 * num2
}

console.log(multiply) // prints func name
console.log(multiply()) // prints value returned by func

// Nested func
function getScore() {
    // const num1 = 2;
    // const num2 = 3;

    function add() {
        return `${name} scored ${num1 + num2}`
    }

    return add()
}

console.log(getScore())