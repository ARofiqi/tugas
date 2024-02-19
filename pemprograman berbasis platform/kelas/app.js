const express = require("express");
const app = express();
const PORT = 8000;
const motoGP = require("./motoGP.json");

const data_siswa = [
  {
    nim: "20220040159",
    nama: "rofiqi",
    alamat: "Sukabumi",
  },
  {
    nim: "20220040160",
    nama: "andika",
    alamat: "Cirebon",
  },
  {
    nim: "20220040161",
    nama: "alif",
    alamat: "Surabaya",
  },
];

app.get("/", (req, res) => {
  res.send("Halaman Utama");
});

app.get("/siswa/:nama", (req, res) => {
  let nama = req.params.nama;
  res.send(data_siswa.filter((data) => data.nama == nama));
});

app.get("/nama-siswa", (req, res) => {
  res.send(data_siswa.map((data) => data.nama));
});

app.get("/dosen/:nama", (req, res) => {
  let nama = req.params.nama;
  res.send(`Selamat Datang, Pak ${nama}`);
});

app.get("/motoGP", (req, res) => {
  res.json(motoGP);
});

app.listen(PORT, () => {
  console.log(`Server berjalan di http://localhost:${PORT}`);
});
