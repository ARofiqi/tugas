function isPrime(num) {
  if (num <= 1) {
    return false;
  }
  if (num <= 3) {
    return true;
  }
  if (num % 2 === 0 || num % 3 === 0) {
    return false;
  }
  for (let i = 5; i * i <= num; i += 6) {
    if (num % i === 0 || num % (i + 2) === 0) {
      return false;
    }
  }
  return true;
}

function findPrimesAfterN(n, count) {
  const primes = [];
  let num = n + 1;

  while (primes.length < count) {
    if (isPrime(num)) {
      primes.push(num);
    }
    num++;
  }

  return primes;
}

const prompt = require("prompt-sync")();

const n = parseInt(prompt("Masukkan bilangan:"));
const count = 1;

const primesAfterN = findPrimesAfterN(n, count);
console.log(`Bilangan prima setelah ${n}: ${primesAfterN}`);

function sumPrimesInRange(start, end) {
  let sum = 0;

  for (let num = start; num <= end; num++) {
    if (isPrime(num)) {
      sum += num;
    }
  }

  return sum;
}

const start = parseInt(prompt("Masukkan bilangan awal:"));
const end = parseInt(prompt("Masukkan bilangan akhir:"));

const primeSum = sumPrimesInRange(start, end);
console.log(`Jumlah bilangan prima antara ${start} dan ${end} adalah: ${primeSum}`);
