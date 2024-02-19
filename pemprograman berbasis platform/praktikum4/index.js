let studentScore = [
  {
    name: "Andi",
    score: 90,
  },
  {
    name: "Rudi",
    score: 80,
  },
  {
    name: "Dira",
    score: 100,
  },
];

console.log(`Murid dengan nilai tertinggi`);
console.log(`Nama \t: ${studentScore[2].name}`);
console.log(`Score \t: ${studentScore[2].score}`);

let motoGP = [
  {
    circuit: "Losail",
    location: "Qatar",
    winner: {
      firstName: "Andrea",
      lastName: "Dovizioso",
      country: "Italy",
    },
  },
  {
    circuit: "Autodromo",
    location: "Argentine",
    winner: {
      firstName: "Cal",
      lastName: "Crutchlow",
      country: "UK",
    },
  },
  {
    circuit: "De Jerez",
    location: "Spain",
    winner: {
      firstName: "Valentino",
      lastName: "Rossi",
      country: "Italy",
    },
  },
  {
    circuit: "Mugello",
    location: "Italy",
    winner: {
      firstName: "Andrea",
      lastName: "Dovizioso",
      country: "Italy",
    },
  },
];

let result = {};

for (let i = 0; i < motoGP.length; i++) {
  let race = motoGP[i];
  let winner = race.winner;
  let country = winner.country;

  if (!result[country]) {
    result[country] = [];
  }

  result[country].push({
    circuit: race.circuit,
    location: race.location,
    winner: {
      firstName: winner.firstName,
      lastName: winner.lastName,
    },
  });
}

console.log(result);
