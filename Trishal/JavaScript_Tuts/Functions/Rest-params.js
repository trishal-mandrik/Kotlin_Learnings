function multiply(multiplier, ...theArgs) {
    return theArgs.map((x) => multiplier * x)
}

const arr = multiply(2, 1, 2, 3, 4, 5)
console.log(arr)