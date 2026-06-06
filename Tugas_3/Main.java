import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        Menu menu = new Menu();
        Pesanan pesanan = new Pesanan();

        int pilih;

        do {

            System.out.println("\n===== RESTORAN =====");
            System.out.println("1. Tambah Menu");
            System.out.println("2. Tampilkan Menu");
            System.out.println("3. Pesan");
            System.out.println("4. Hitung Total");
            System.out.println("5. Cetak Struk");
            System.out.println("6. Simpan Menu");
            System.out.println("7. Simpan Struk");
            System.out.println("0. Keluar");

            System.out.print("Pilih : ");
            pilih = input.nextInt();
            input.nextLine();

            switch (pilih) {

                case 1:

                    System.out.println("1. Makanan");
                    System.out.println("2. Minuman");
                    System.out.println("3. Diskon");

                    int jenis = input.nextInt();
                    input.nextLine();

                    System.out.print("Nama : ");
                    String nama = input.nextLine();

                    if (jenis == 1) {

                        System.out.print("Harga : ");
                        double harga = input.nextDouble();
                        input.nextLine();

                        System.out.print("Jenis Makanan : ");
                        String jm = input.nextLine();

                        menu.tambahItem(
                            new Makanan(nama, harga, jm));

                    } else if (jenis == 2) {

                        System.out.print("Harga : ");
                        double harga = input.nextDouble();
                        input.nextLine();

                        System.out.print("Jenis Minuman : ");
                        String jn = input.nextLine();

                        menu.tambahItem(
                            new Minuman(nama, harga, jn));

                    } else {

                        System.out.print("Persen Diskon : ");
                        double d = input.nextDouble();

                        menu.tambahItem(
                            new Diskon(nama, d));
                    }

                    break;

                case 2:
                    menu.tampilkanMenu();
                    break;

                case 3:

                    try {

                        menu.tampilkanMenu();

                        System.out.print(
                            "Pilih nomor menu: ");

                        int no = input.nextInt();

                        pesanan.tambahPesanan(
                            menu.getItem(no - 1));

                    } catch (Exception e) {

                        System.out.println(
                            e.getMessage());

                    }

                    break;

                case 4:
                    System.out.println(
                        "Total = Rp" +
                        pesanan.hitungTotal());
                    break;

                case 5:
                    pesanan.cetakStruk();
                    break;

                case 6:
                    menu.simpanFile("menu.txt");
                    break;

                case 7:
                    pesanan.simpanStruk("struk.txt");
                    break;

                case 0:
                    System.out.println("Terima kasih");
                    break;

                default:
                    System.out.println("Pilihan salah");
            }

        } while (pilih != 0);

        input.close();
    }
}