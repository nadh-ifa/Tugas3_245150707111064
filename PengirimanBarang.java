public class PengirimanBarang {
    // Atribut
    private String namaPengirim;
    private String alamatTujuan;
    private double berat;
    private double biayaDasar;

    // Default Constructor
    public PengirimanBarang() {
        this.namaPengirim = "";
        this.alamatTujuan = "";
        this.berat = 0.0;
        this.biayaDasar = 0.0;
    }

    // Overloading Constructor
    public PengirimanBarang(String namaPengirim, String alamatTujuan, double berat, double biayaDasar) {
        this.namaPengirim = namaPengirim;
        this.alamatTujuan = alamatTujuan;
        this.berat = berat;
        this.biayaDasar = biayaDasar;
    }

    // Method untuk menghitung ongkos kirim dengan diskon persentase
    public double hitungOngkir() {
        return biayaDasar;
    }

    // Overloaded Method: menghitung ongkos kirim dengan diskon persentase
    public double hitungOngkir(double diskonPersen) {
        return biayaDasar - (biayaDasar * diskonPersen / 100);
    }

    // Overloaded Method: menghitung ongkos kirim dengan diskon dan biaya tambahan
    public double hitungOngkir(double diskonPersen, double biayaTambahan) {
        double biayaSetelahDiskon = biayaDasar - (biayaDasar * diskonPersen / 100);
        return biayaSetelahDiskon + biayaTambahan;
    }

    // Overloaded Method: menghitung ongkos kirim berdasarkan jarak
    public double hitungOngkir(int jarak) {
        if (jarak > 50) {
            return biayaDasar + (biayaDasar * 0.10); // Surcharge 10%
        } else {
            return biayaDasar - (biayaDasar * 0.05); // Diskon 5%
        }
    }

    // Static Method: menampilkan informasi perusahaan logistik
    public static void displayInfoLogistik() {
        System.out.println("Perusahaan Logistik Kapal Lawd");
        System.out.println("Menawarkan berbagai metode pengiriman barang.");
    }

    // Getter untuk menampilkan informasi pengiriman
    public void displayInfo() {
        System.out.println("Nama Pengirim: " + namaPengirim);
        System.out.println("Alamat Tujuan: " + alamatTujuan);
        System.out.println("Berat: " + berat + " kg");
        System.out.println("Biaya Dasar: " + biayaDasar);
    }
}
