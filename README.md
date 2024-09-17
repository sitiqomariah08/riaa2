## Deskripsi Tugas
Pada tugas Pemrograman Berbasis Objek (PBO) pertemuan 2 ini yaitu mengimplementasikan `constructor`, `casting`, `super`, `this`, dan `interface`. Pada proyek ini saya mengimplementasikan mereka dalam satu package yang terhubung, baik dengan extends maupun interface. Berikut penjelasan struktur dari program saya :
1. Class KendaraanPribadi (parent) memiliki atribut merek dan tahun.
2. Class Mobil dan Motor (child) extends Class KendaraanPribadi.
3. Class Mobil memiliki Subclass yaitu sport, mini, dan elektrik yang masing-masing class memiliki interface sebanyak 3.
4. Class Motor juga sama memiliki Subclass dan interface dengan Class Motor.

# Constructor
`Constructor` adalah metode khusus yang digunakan untuk menginisialisasi objek ketika sebuah class diinstansiasi. Constructor memiliki nama yang sama dengan class dan tidak memiliki tipe return (bahkan `void`). Constructor berguna untuk memberikan nilai awal pada atribut objek.

## Contoh Source Code Constructor
<pre>
  public KendaraanPribadi(){
        System.out.println("halo dari konstruktor kendaraan pribadi");
        }
</pre>
Constructor `KendaraanPribadi()` adalah **default constructor** tanpa parameter yang secara otomatis dipanggil saat objek dari class `KendaraanPribadi` dibuat. Constructor ini mencetak pesan `"halo dari konstruktor kendaraan pribadi"`, menandakan eksekusinya. Meskipun sederhana, constructor ini biasanya digunakan untuk menginisialisasi objek ketika objek tersebut diciptakan, meskipun dalam contoh ini hanya berfungsi untuk menampilkan pesan.

# Casting
`Casting` adalah proses mengonversi suatu objek atau tipe data ke tipe yang lain. Dalam OOP, casting digunakan untuk mengubah tipe objek dari satu class ke class lain dalam hirarki class.

## Contoh Source Code Casting
<pre>
  KendaraanPribadi car = (KendaraanPribadi) sedan;
</pre>
Baris ini menunjukkan proses downcasting, di mana objek sedan yang merupakan instance dari MiniMobil `(subclass)` dikonversi ke tipe KendaraanPribadi `(superclass)`. Ini memungkinkan objek sedan untuk diakses dengan referensi bertipe KendaraanPribadi, meskipun objek tersebut pada dasarnya adalah MiniMobil. Jika sedan bukan instance dari KendaraanPribadi, proses casting ini akan menghasilkan ClassCastException.

# Super 
Super adalah keyword yang digunakan dalam Java untuk merujuk ke superclass atau class induk dari objek saat ini. Keyword ini dapat digunakan untuk:
1. Memanggil constructor superclass.
2. Mengakses metode atau atribut yang diwarisi dari superclass yang mungkin dibayangi oleh subclass.

## Contoh Source Code Super
<pre>
  super.bahanBakar();
</pre>
`super.bahanBakar();` : Baris ini digunakan di dalam subclass untuk memanggil metode `bahanBakar()` yang didefinisikan di `superclass`. Ini berguna jika metode `bahanBakar()` telah di-override di subclass dan kita ingin mengakses implementasi yang ada di superclass, bukan implementasi subclass.

# This
This adalah keyword yang merujuk pada objek saat ini (objek tempat metode dipanggil). this digunakan untuk:
1. Mengakses variabel instance yang dibayangi oleh parameter metode.
2. Memanggil constructor lain dari class yang sama `(constructor chaining)`.

## Contoh Source Code This
<pre>
   this.bahanBakar();
</pre>
baris ini memanggil metode `bahanBakar()` yang didefinisikan di dalam class saat ini yaitu class MiniMobil. Ini memastikan bahwa Anda memanggil metode atau akses atribut yang milik objek saat ini.

# Interface
Interface adalah sebuah kontrak dalam OOP yang hanya mendeklarasikan metode tanpa implementasi. Class yang mengimplementasikan interface harus mengimplementasikan semua metode yang ada dalam interface. Interface biasanya digunakan untuk mencapai multiple inheritance.

## Contoh Source Code Interface
<pre>
  public interface Affordable {
    public void terjangkau();
}
  public interface Spacious {
    public void lapang();
}
  public interface Maneuverable {
    public void mudahDikendalikan();
}
</pre>

<pre>
  public class MiniMobil extends Mobil implements Affordable, Spacious, Maneuverable {
</pre>
Pada contoh kode tersebut, terdapat tiga interface yang didefinisikan: `Affordable`, `Spacious`, dan `Maneuverable`. Masing-masing interface mendeklarasikan satu metode abstrak: `terjangkau()`, `lapang()`, dan `mudahDikendalikan()`, yang harus diimplementasikan oleh class yang mengimplementasikan interface tersebut. Class `MiniMobil` kemudian mengimplementasikan ketiga interface ini, yaitu `Affordable`, `Spacious`, dan `Maneuverable`, serta mewarisi dari class `Mobil`. Ini berarti `MiniMobil` harus menyediakan implementasi konkret untuk ketiga metode dari interface tersebut, yaitu `terjangkau()`, `lapang()`, dan `mudahDikendalikan()`, yang memungkinkan objek `MiniMobil` untuk memiliki fitur-fitur yang didefinisikan oleh interface-interface tersebut.

## Ringkasan
1. Constructor: Metode khusus yang digunakan untuk menginisialisasi objek saat class diinstansiasi.
2. Casting: Proses mengonversi objek dari satu tipe ke tipe lain dalam hirarki class.
3. Super: Keyword yang merujuk ke superclass dan digunakan untuk memanggil constructor atau metode superclass.
4. This: Keyword yang merujuk pada objek saat ini, sering digunakan untuk mengatasi kebingungan antara variabel instance dan parameter.
5. Interface: Sebuah kontrak yang mendeklarasikan metode tanpa implementasi, memungkinkan class untuk mengimplementasikan perilaku yang didefinisikan dalam interface.
