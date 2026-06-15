# Tugas Praktik 3 - Manajemen Restoran Berbasis Objek (Java)

## Identitas

- Tugas : Tugas Praktik 3
- Nama : Zulhilmi Shodiq
- NIM : 053343025
- Mata Kuliah : Pemrograman Berbasis Objek

---

# Deskripsi Program

Program Manajemen Restoran merupakan aplikasi berbasis console yang dibuat menggunakan bahasa pemrograman Java. Program ini digunakan untuk mengelola menu restoran, menerima pesanan pelanggan, menghitung total pembayaran, menerapkan diskon, menampilkan struk pesanan, serta menyimpan data ke dalam file teks.

Program ini dibuat untuk mengimplementasikan konsep-konsep Pemrograman Berbasis Objek (PBO) yang telah dipelajari pada aktivitas belajar 8-12.

---

# Fitur Program

1. Menambahkan menu baru:
   - Makanan
   - Minuman
   - Diskon

2. Menampilkan seluruh menu restoran.

3. Mencatat pesanan pelanggan.

4. Menghitung total pembayaran.

5. Menerapkan diskon pada pesanan.

6. Menampilkan struk pesanan.

7. Menyimpan daftar menu ke file teks.

8. Menyimpan struk pesanan ke file teks.

9. Menangani kesalahan input menggunakan Exception Handling.

---

# Struktur Class

## 1. MenuItem (Abstract Class)

Class induk untuk seluruh item menu.

### Atribut

- nama
- harga
- kategori

### Method

- tampilMenu()

---

## 2. Makanan

Turunan dari MenuItem yang digunakan untuk menyimpan data makanan.

### Atribut Tambahan

- jenisMakanan

---

## 3. Minuman

Turunan dari MenuItem yang digunakan untuk menyimpan data minuman.

### Atribut Tambahan

- jenisMinuman

---

## 4. Diskon

Turunan dari MenuItem yang digunakan untuk menyimpan informasi diskon.

### Atribut Tambahan

- diskon

---

## 5. Menu

Class yang digunakan untuk mengelola seluruh daftar menu restoran.

### Method

- tambahItem()
- tampilkanMenu()
- getItem()
- simpanFile()

---

## 6. Pesanan

Class yang digunakan untuk mengelola pesanan pelanggan.

### Method

- tambahPesanan()
- hitungTotal()
- cetakStruk()
- simpanStruk()

---

## 7. Main

Class utama yang berisi menu program dan interaksi pengguna.

---

# Konsep PBO yang Diimplementasikan

## 1. Abstraction

Menggunakan abstract class MenuItem sebagai class dasar seluruh item menu.

## 2. Inheritance

Class Makanan, Minuman, dan Diskon mewarisi class MenuItem.

## 3. Encapsulation

Seluruh atribut dibuat private dan diakses menggunakan getter dan setter.

## 4. Polymorphism

Method tampilMenu() diimplementasikan berbeda pada masing-masing subclass.

## 5. Exception Handling

Menggunakan try-catch untuk menangani kesalahan input dan akses data menu yang tidak tersedia.

---

# Materi Dasar Java yang Digunakan

- Struktur keputusan (if-else dan switch-case)
- Struktur pengulangan (for dan do-while)
- ArrayList
- String
- Input menggunakan Scanner
- File Handling (FileWriter dan PrintWriter)

---

# Cara Menjalankan Program

1. Buka project menggunakan Visual Studio Code atau IDE Java lainnya.
2. Compile seluruh file Java.

```bash
javac *.java
```

3. Jalankan program.

```bash
java Main
```

4. Pilih menu yang tersedia sesuai kebutuhan.

---

# File Output

Program akan menghasilkan file:

## menu.txt

Berisi daftar menu restoran yang telah disimpan.

## struk.txt

Berisi rincian pesanan pelanggan dan total pembayaran.

---

# Tampilan Menu Utama

```text
===== RESTORAN =====
1. Tambah Menu
2. Tampilkan Menu
3. Pesan
4. Hitung Total
5. Cetak Struk
6. Simpan Menu
7. Simpan Struk
0. Keluar
```

---

# Kesimpulan

Program Manajemen Restoran berhasil mengimplementasikan konsep Pemrograman Berbasis Objek yang meliputi Abstraction, Inheritance, Encapsulation, Polymorphism, serta Exception Handling. Selain itu, program juga menerapkan penggunaan ArrayList, struktur keputusan, struktur pengulangan, operasi input/output, dan operasi file sesuai dengan ketentuan Tugas Praktik 3.
