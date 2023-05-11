function myFunc(theObject) {
    theObject.make = "Toyota"
}

const mycar = {
    make: "Honda",
    model: "Accord",
    year: 1998,
}

const x = mycar.make;
console.log(mycar)
myFunc(mycar)
console.log(mycar)
