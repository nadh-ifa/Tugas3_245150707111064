public class Main {
    public static void main(String[] args) {
        // Menampilkan informasi perusahaan logistik
        PengirimanBarang.displayInfoLogistik();

        // Menggunakan Default Constructor
        PengirimanBarang pengiriman1 = new PengirimanBarang();
        pengiriman1.displayInfo();

        // Menggunakan Overloading Constructor
        PengirimanBarang pengiriman2 = new PengirimanBarang("Budi Siregar", "Malang", 10.0, 100000);
        pengiriman2.displayInfo();

        // Menguji semua overloaded method
        System.out.println("Ongkos Kirim (Tanpa Diskon): " + pengiriman2.hitungOngkir());
        System.out.println("Ongkos Kirim (Diskon 10%): " + pengiriman2.hitungOngkir(10));
        System.out.println("Ongkos Kirim (Diskon 10% + Biaya Tambahan 20000): " + pengiriman2.hitungOngkir(10, 20000));
        System.out.println("Ongkos Kirim (Jarak 60 km): " + pengiriman2.hitungOngkir(60));
        System.out.println("Ongkos Kirim (Jarak 40 km): " + pengiriman2.hitungOngkir(40));
    }
}
