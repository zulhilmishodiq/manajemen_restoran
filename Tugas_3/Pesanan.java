import java.io.*;
import java.util.ArrayList;

public class Pesanan {

    private ArrayList<MenuItem> daftarPesanan;

    public Pesanan() {
        daftarPesanan = new ArrayList<>();
    }

    public void tambahPesanan(MenuItem item) {
        daftarPesanan.add(item);
    }

    public double hitungTotal() {

        double total = 0;
        double diskon = 0;

        for (MenuItem item : daftarPesanan) {

            if (item instanceof Diskon) {
                diskon = ((Diskon) item).getDiskon();
            } else {
                total += item.getHarga();
            }
        }

        total = total - (total * diskon / 100);

        return total;
    }

    public void cetakStruk() {

        System.out.println("\n===== STRUK =====");

        for (MenuItem item : daftarPesanan) {
            item.tampilMenu();
        }

        System.out.println("----------------");
        System.out.println("Total : Rp" + hitungTotal());
    }

    public void simpanStruk(String file) {

        try (PrintWriter pw = new PrintWriter(new FileWriter(file))) {

            pw.println("===== STRUK =====");

            for (MenuItem item : daftarPesanan) {
                pw.println(item.getNama() + " - Rp" + item.getHarga());
            }

            pw.println("Total : Rp" + hitungTotal());

            System.out.println("Struk berhasil disimpan.");

        } catch (IOException e) {
            System.out.println("Gagal menyimpan struk.");
        }
    }
}