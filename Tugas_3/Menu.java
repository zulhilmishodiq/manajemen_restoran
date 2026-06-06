import java.util.ArrayList;
import java.io.*;

public class Menu {
    private ArrayList<MenuItem> daftarMenu;

    public Menu() {
        daftarMenu = new ArrayList<>();
    }

    public void tambahItem(MenuItem item) {
        daftarMenu.add(item);
    }

    public ArrayList<MenuItem> getDaftarMenu() {
        return daftarMenu;
    }

    public void tampilkanMenu() {
        for (int i = 0; i < daftarMenu.size(); i++) {
            System.out.print((i + 1) + ". ");
            daftarMenu.get(i).tampilMenu();
        }
    }

    public MenuItem getItem(int index) throws Exception {
        if (index < 0 || index >= daftarMenu.size()) {
            throw new Exception("Item tidak ditemukan!");
        }
        return daftarMenu.get(index);
    }

    public void simpanFile(String namaFile) {
        try (PrintWriter pw = new PrintWriter(new FileWriter(namaFile))) {

            for (MenuItem item : daftarMenu) {
                pw.println(
                        item.getKategori() + "," +
                        item.getNama() + "," +
                        item.getHarga()
                );
            }

            System.out.println("Menu berhasil disimpan.");

        } catch (IOException e) {
            System.out.println("Gagal menyimpan file.");
        }
    }
}