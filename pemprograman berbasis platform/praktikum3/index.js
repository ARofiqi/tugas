const motoGP = [
  {
    circuit: "Losail",
    location: "Qatar",
    winner: {
      firsname: "Andrea",
      lastname: "Dovizioso",
      country: "Italy",
    },
  },
  {
    circuit: "Autodromo",
    location: "Argentine",
    winner: {
      firsname: "Cal",
      lastname: "Crutchlow",
      country: "UK",
    },
  },
  {
    circuit: "De Jerez",
    location: "Spain",
    winner: {
      firsname: "Valentino",
      lastname: "Rossi",
      country: "Italy",
    },
  },
  {
    circuit: "Mugello",
    location: "Italy",
    winner: {
      firsname: "Andrea",
      lastname: "Dovizioso",
      country: "Italy",
    },
  },
];

let result = {};
let winningCircuits = [];

for (let data in motoGP) {
  let { circuit, location, winner } = motoGP[data];
  let { firsname, lastname, country } = winner;

  result[country] = {
    winningCircuits: [],
    totalWin: 0,
  };
  
  let rider = {
    name: firsname + " " + lastname,
    winLocation: `${circuit}, ${location}`,
  };

  if(country=="")

  winningCircuits.push(rider);
}

console.log(result);
console.log(winningCircuits);

console.log(result.Italy.winningCircuits);
console.log(result.UK.winningCircuits);
