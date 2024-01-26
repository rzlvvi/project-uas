package pedagangkambing;

import hewan.Hewan;

public class PedagangKambing {
    private Hewan[] daftarHewan;
    private int jumlahHewan;

    public PedagangKambing(int kapasitas) {
        this.daftarHewan = new Hewan[kapasitas];
        this.jumlahHewan = 0;
    }

    public void beliHewan(Hewan hewan) {
        if (jumlahHewan < daftarHewan.length) {
            daftarHewan[jumlahHewan] = hewan;
            jumlahHewan++;
            System.out.println("Hewan berhasil dibeli!");
        } else {
            System.out.println("Kapasitas pedagang penuh, tidak dapat membeli hewan lagi.");
        }
    }

    public void tampilkanDataHewan() {
        System.out.println("===== DATA HEWAN =====");
        for (int i = 0; i < jumlahHewan; i++) {
            daftarHewan[i].tampilkanInfo();
        }
        System.out.println("=======================");
    }

    public void perkembanganBulanan() {
        for (int i = 0; i < jumlahHewan; i++) {
            daftarHewan[i].perkembanganBulanan();
        }
        System.out.println("Perkembangan bulanan berhasil diupdate.");
    }
}