package hewan;

public class Hewan {
    private String nama;
    protected double berat;
    protected double tinggi;
    protected double panjang;

    public Hewan(String nama,double berat,double tinggi,double panjang) {
        this.nama = nama;
        this.berat = berat;
        this.tinggi = tinggi;
        this.panjang = panjang;
    }

    public void tampilkanInfo() {
        System.out.println("Nama Hewan: " + nama);
        System.out.println("Berat: " + berat + " kg");
        System.out.println("Tinggi: " + tinggi + " m");
        System.out.println("Panjang: " + panjang + " m");
        System.out.println("------------------------");
    }

    public void perkembanganBulanan() {
        // Implementasi perkembangan bulanan, misalnya bertambah berat, tinggi, dan panjang setiap bulan
        berat += 1.0;
        tinggi += 0.1;
        panjang += 0.2;
    }
}