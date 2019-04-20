import service.*;
import entity.*;
import java.util.*;

public class Aplikasi {

    private static SuratkeluarService service;
    private static Scanner scanner;

    public static void main(String[] args) {
        service = new SuratkeluarService();
        scanner = new Scanner(System.in);

        int opsi = 5;
        do {
            tampilkanMenu();
            opsi = scanner.nextInt();
            seleksi(opsi);
        } while(opsi != 5);
    }

    private static void seleksi(int opsi) {
        switch(opsi) {
            case 1:
                callFormTambahData();
                break;
            case 2:
                callFormUbahData();
                break;
            case 3:
                callFormHapusData();
                break;
            case 4:
                service.tampilkanData();
                break;
        }
    }

    private static void callFormHapusData() {
        scanner = new Scanner(System.in);

        System.out.print("penerima : ");
        String penerima = scanner.nextLine();
        service.hapusData(penerima);
    }

    private static void callFormUbahData() {
        scanner = new Scanner(System.in);
        String penerima, alamatpenerima, diterima;

        System.out.println("\n-= Form Ubah Data =-");
        System.out.print("penerima : ");
        penerima = scanner.nextLine();
        System.out.print("alamatpenerima : ");
        alamatpenerima = scanner.nextLine();
        System.out.print("diterima : ");
        diterima = scanner.nextLine();
        service.ubahData(new Suratkeluar(penerima, alamatpenerima, diterima));
    }

    private static void callFormTambahData() {
        scanner = new Scanner(System.in);
        String penerima, alamatpenerima, diterima;

        System.out.println("\n-= Form Tambah Data =-");
        System.out.print("penerima : ");
        penerima = scanner.nextLine();
        System.out.print("alamatpenerima : ");
        alamatpenerima = scanner.nextLine();
        System.out.print("diterima : ");
        diterima = scanner.nextLine();
        service.tambahData(new Suratkeluar(penerima, alamatpenerima, diterima));
    }

    private static void tampilkanMenu() {
        System.out.println("\n--== Aplikasi Suratkeluar ==--");
        System.out.println("1. Tambah Data");
        System.out.println("2. Ubah Data");
        System.out.println("3. Hapus Data");
        System.out.println("4. Tampilkan Data");
        System.out.println("5. KELUAR");
        System.out.println("----------------");
        System.out.print  ("opsi > ");
    }

}