const aritmatika = require("./aritmatika");

let x = 10;
let y = 4;

let add = aritmatika.add(x, y);
console.log(`${x} + ${y} = ${add}`);

let reduce = aritmatika.reduce(x, y);
console.log(`${x} - ${y} = ${reduce}`);

let multiple = aritmatika.multiple(x, y);
console.log(`${x} * ${y} = ${multiple}`);

let devide = aritmatika.devide(x, y);
console.log(`${x} / ${y} = ${devide}`);
