import hewan.Kambing;
import pedagangkambing.PedagangKambing;

public class Main {
    public static void main(String[] args) {
        PedagangKambing pedagangKambing = new PedagangKambing(5);

        // Beli hewan
        pedagangKambing.beliHewan(new Kambing("Kambing A",7,10,15));
        pedagangKambing.beliHewan(new Kambing("Kambing B",10,13,18));

        // Tampilkan data hewan
        System.out.println("Data setelah pembelian:");
        pedagangKambing.tampilkanDataHewan();

        // Perkembangan bulanan
        pedagangKambing.perkembanganBulanan();

        // Tampilkan data hewan setelah perkembangan bulanan
        System.out.println("Data setelah perkembangan bulanan:");
        pedagangKambing.tampilkanDataHewan();
    }
}