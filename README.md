# katalon-saucelabs-mobile

## 📌 Deskripsi Proyek
Proyek ini adalah tugas **Final Project - Katalon Studio** bagian **Mobile Automation**. Otomatisasi pengujian dilakukan pada aplikasi Android resmi **Sauce Labs Mobile App** (`sauce-labs.2.7.1.apk`) menggunakan perangkat HP asli (*Real Device*) untuk memastikan fungsi utama antarmuka aplikasi berjalan dengan lancar tanpa kendala.

## 🛠️ Prasyarat & Cara Menjalankan
1. Download dan instal aplikasi **Katalon Studio** serta **Node.js** di laptop Anda.
2. Pastikan **Appium Server** sudah terinstal secara global di sistem komputer Anda.
3. Hubungkan perangkat HP Android asli (*Real Device*) ke laptop menggunakan kabel USB dengan mengaktifkan mode **USB Debugging** dan **Install via USB** pada Opsi Pengembang.
4. Buka aplikasi **Command Prompt (CMD)**, ketik perintah `appium` untuk menyalakan server komunikasi sebelum memulai pengujian.
5. Buka Katalon Studio, lalu pilih **File** > **Open Project** > Arahkan ke folder proyek Mobile ini.
6. Buka folder **Test Suites** pada panel kiri Katalon Studio, lalu klik dua kali file **Suite_Saucelab_Mobile**.
7. Pastikan mode eksekusi di kanan atas diatur ke **Android Devices**, lalu klik tombol **Run** (panah hijau melingkar) untuk menjalankan semua pengujian secara otomatis.

## 📊 Test Suite & Test Coverage
Proyek ini mencakup total **6 Skenario Uji Mobile (Test Cases)** yang dijalankan secara massal, berurutan, dan otomatis melalui satu Test Suite:
1. **TC01_login_berhasil** (Positive Case) - Menguji fungsi masuk utama aplikasi menggunakan kredensial akun yang valid hingga masuk ke halaman katalog produk.
2. **TC02_login_gagal** (Negative Case) - Memastikan sistem keamanan aplikasi menolak akses jika pengguna memasukkan kombinasi kata sandi yang salah.
3. **TC03_login_gagal** (Negative Case) - Memastikan respon aplikasi tetap aman dan menampilkan pesan peringatan yang sesuai ketika form login dikosongkan.
4. **TC04_tambah_keranjang** (Positive Case) - Menguji alur interaksi pengguna saat memilih item produk pada aplikasi dan sukses memasukkannya ke dalam keranjang belanja.
5. **TC05_checkout_berhasil** (Positive Case) - Menguji alur penuh (End-to-End) dari pengisian data pengiriman, metode pembayaran, hingga proses penyelesaian pesanan selesai.
6. **TC06_checkout_gagal** (Negative Case) - Memastikan sistem validasi form belanja mendeteksi kesalahan dan menggagalkan transaksi jika data alamat atau kode pos dikosongkan.
