public class MobilBeraksi{
    public static void main(String[] args ){
        // Membuat Object
        Mobil mobilku = new Mobil();

        /* memanggil atribut dan memberi nilai */
        mobilku.setWarna("Hitam");
        mobilku.setTahunProduksi(2006);
        System.out.println("Warna: " + mobilku.getWarna());
        System.out.println("Tahun: " + mobilku.getTahunProduksi());
    }
}
