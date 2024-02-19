const express = require("express");
const app = express();
const PORT = 8000;
const motoGP = require("./motoGP.json");

let country_filter = {};

for (let item of motoGP) {
  let { winner, circuit, location } = item;
  let { firstName, lastName, country } = winner;

  if (!country_filter[country]) country_filter[country] = [];

  country_filter[country].push({
    circuit: circuit,
    location: location,
    winner: {
      firstName: firstName,
      lastName: lastName,
    },
  });
}

const name_filter = {};
for (let item of motoGP) {
  let { winner, circuit, location } = item;
  let { firstName, lastName, country } = winner;

  let fullName = firstName + " " + lastName;

  if (!name_filter[fullName]) name_filter[fullName] = [];

  name_filter[fullName].push({
    circuit: circuit,
    location: location,
    country: country,
  });
}

app.get("/", (req, res) => {
  res.send(motoGP);
});

app.get("/country", (req, res) => {
  res.send(country_filter);
});

app.get("/name", (req, res) => {
  res.send(name_filter);
});

app.get("*", (req, res) => {
  res.send("<h1>Bad request</h1>");
});

app.listen(PORT, () => {
  console.log(`Server Berjalan Di http://localhost:${PORT}`);
});
