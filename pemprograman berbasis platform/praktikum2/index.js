const findNextPrime = (num) => {
  while (++num) if ([...Array(num).keys()].slice(2).every((i) => num % i)) return num;
};

const isPrime = (num) => num > 1 && ![...Array(num - 1).keys()].slice(2).some((i) => num % i === 0);

const prompt = require("prompt-sync")();
console.log("1. program untuk menampilkan output bilangan prima setelah input bilangan tertentu");
let angka = prompt("Masukan Angka : ");
console.log(`Hasilnya ${findNextPrime(angka)}`);

console.log("2. program untuk menghitung jumlah bilangan prima pada rentang input awal sampai input akhir");
let awal = prompt("Masukan awal : ");
let akhir = prompt("Masukan akhir : ");
let hasil = 0;

for (let i = awal; i < akhir; i++) {
  hasil += isPrime(i) ? i : 0;
}
console.log(`Hasilnya ${hasil}`);
