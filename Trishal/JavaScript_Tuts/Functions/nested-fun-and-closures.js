function outside(x) {
    function inside(y) {
        return x + y
    }
    return inside
}

const fnInside = outside(3) // Think of it like: give me a function that adds 3 to whatever you give it
console.log(fnInside)
const result = fnInside(5)
console.log(result) // returns 8
const result1 = outside(3)(7)
console.log(result1) // returns 8
