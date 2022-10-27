public class Mobil {
    private String warna;
    private int tahunProduksi;

    // Setter / Menaruh Nilai (Kunci)
    public void setWarna(String warna) {
        this.warna = warna;
    }

    public void setTahunProduksi(int tahun) {
        this.tahunProduksi = tahun;
    }

    // Getter / Menerima Nilai (Mengambil/Mengembalikan Nilai)
    public String getWarna() {
        return this.warna;
    }
    public int getTahunProduksi() {
        return this.tahunProduksi;
    }
}
