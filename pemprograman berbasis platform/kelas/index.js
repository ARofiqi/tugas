let http = require("http");
const PORT = 8000;

const server = http.createServer((req, res) => {
  res.writeHead(200);
  let path = req.url;
  switch (path) {
    case "/":
      res.write("Halaman Utama");
      break;
    case "/siswa":
      res.write("Halaman Siswa");
      break;
    case "/dosen":
      res.write("Halaman Dosen");
      break;
    default:
      res.writeHead(404);
      res.write("Halaman Tidak Ditemukan");
  }
  res.end();
});

server.listen(PORT, () => {
  console.log(`Server berjalan di http://localhost:${PORT}`);
});
