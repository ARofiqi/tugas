const request = require("supertest");
const app = require("../index");
const conn = require("../config/connection");

describe("siswaController", () => {
  describe("GET /siswa", () => {
    test("should get list of siswa", async () => {
      const response = await request(app).get("/siswa");
      expect(response.statusCode).toBe(200);
      expect(response.body).toHaveProperty("status", true);
    });
  });
});

describe("POST /siswa", () => {
  test("Should insert new siswa", async () => {
    const response = await request(app).post("/siswa").query({
      nama: "Ahmad",
      umur: 20,
      alamat: "Caringin",
    });
    expect(response.statusCode).toBe(200);
    expect(response.body).toHaveProperty("status", true);
  });
});

describe("Update Endpoint", () => {
  let insertedId;

  //sebelum pengujian tambahkan data siswa ke database untuk diubah
  beforeAll(async () => {
    const insertQuery = `INSERT INTO siswa (nama, umur, alamat) VALUES ('Samsul', 30, 'solo')`;
    const insertResult = await new Promise((resolve) => {
      conn.query(insertQuery, (err, result) => {
        if (err) {
          console.error("Insert error : ", err);
        }
        resolve(result);
      });
    });

    insertedId = insertResult.insertId;
  });

  //setelah pengujian, hapus data siswa yang telah diubah
  afterAll(async () => {
    const deleteQuery = `DELETE FROM siswa WHERE id = ${insertedId}`;
    await new Promise((resolve) => {
      conn.query(deleteQuery, () => {
        resolve();
      });
    });
    conn.end(); //tutup koneksi database setelah semua pengujian selesai
  });

  //Pengujian untuk updateSiswa
  it("Should update a student", async () => {
    const updatedData = {
      nama: "Alun",
      umur: 20,
      alamat: "Malang",
    };

    const response = await request(app).put(`/siswa/${insertedId}`).send(updatedData);
    expect(response.statusCode).toBe(200);
    expect(response.body).toHaveProperty("status", true);

    //cek apakah data telah diubah didatabase
    const selectQuery = `SELECT * FROM siswa WHERE id = ${insertedId}`;
    const selectResult = await new Promise((resolve) => {
      conn.query(selectQuery, (err, result) => {
        resolve(result);
      });
    });

    expect(selectResult.length).toBe(1);
    expect(Array.isArray(selectResult)).toBe(true);
    expect(selectResult.length).toBeGreaterThan(0);
    expect(selectResult[0].nama == updatedData.nama);
    expect(selectResult[0].umur == updatedData.umur);
    expect(selectResult[0].alamat == updatedData.alamat);
  });
});

// describe("siswaController - Delete", () => {
//   let insertedId;

//   //sebelum pengujian, tambahkan datasiswa kedalam database untuk dihapus
//   beforeAll(async () => {
//     const insertQuery = `INSERT INTO siswa (nama, umur, alamat) VALUES ('Test', 20, 'Jl. test')`;
//     const insertResult = await new Promise((resolve) => {
//       conn.query(insertQuery, (err, result) => {
//         if (err) {
//           console.error("Insert error : ", err);
//         }
//         insertedId = result.id;
//         resolve();
//       });
//     });

//     insertedId = insertResult.id;
//   });

//   // pengujian untuk delete mahasiswa
//   it("should delete a student", async () => {
//     const response = await request(app).delete(`/siswa/${insertedId}`);

//     // periksa response body sesuai dengan response yang diharapkan
//     if (response.body.status) {
//       // jika status true maka response harus berhasil
//       expect(response.body).toHaveProperty("status", true);
//       expect(response.body).toHaveProperty("msg", "Delete Successfull");
//     } else {
//       // jika status false, maka response harus gagal
//       expect(response.body).toHaveProperty("status", false);
//       expect(response.body).toHaveProperty("msg", "Delete Failed");
//     }

//     //pastikan data sudah dihapus didatabase
//     const selectQuery = `SELECT * FROM siswa WHERE id = ${insertedId}`;
//     const selectResult = await new Promise((resolve) => {
//       conn.query(selectQuery, (err, result) => {
//         resolve(result);
//       });
//     });
//     expect(selectResult.length).toBe(0);
//   });

//   afterAll(() => {
//     conn.end();
//   });
// });
