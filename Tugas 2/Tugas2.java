import java.util.HashMap;
import java.util.Scanner;
import java.util.Map;

public class MahasiswaApp {
    private static Map<String, String> mahasiswaMap = new HashMap<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int menu;

        do {
            System.out.println("-------------------");
            System.out.println("Kedataan Mahasiswa");
            System.out.println("-------------------");
            System.out.println("1. Tambah Mahasiswa");
            System.out.println("2. Daftar Mahasiswa");
            System.out.println("3. Edit Mahasiswa");
            System.out.println("4. Hapus Mahasiswa");
            System.out.println("5. Exit");
            System.out.print("Pilih menu: ");
            menu = scanner.nextInt();
            scanner.nextLine();

            switch (menu) {
                case 1:
                    tambahMahasiswa();
                    break;
                case 2:
                    daftarMahasiswa();
                    break;
                case 3:
                    editMahasiswa();
                    break;
                case 4:
                    hapusMahasiswa();
                    break;
                case 5:
                    System.out.println("Thankiess, Bismillah Glory");
                    break;
                default:
                    System.out.println("Pilih yang bener bes");
            }
        } while (menu != 5);
    }

    private static void tambahMahasiswa() {
        System.out.print("Masukkan NIM: ");
        String nim = scanner.nextLine();

        if (mahasiswaMap.containsKey(nim)) {
            System.out.println("NIM sudah terdaftar bes");
            return;
        }

        System.out.print("Masukkan Nama: ");
        String nama = scanner.nextLine();

        mahasiswaMap.put(nim, nama);
        System.out.println("Cha ching, Mahasiswa berhasil ditambahkan");
    }

    private static void daftarMahasiswa() {
        if (mahasiswaMap.isEmpty()) {
            System.out.println("Data Mahasiswanya gaada nich");
            return;
        }

        System.out.println("Daftar Mahasiswa:");
        for (Map.Entry<String, String> entry : mahasiswaMap.entrySet()) {
            System.out.println("NIM: " + entry.getKey() + ", Nama: " + entry.getValue());
        }
    }

    private static void editMahasiswa() {
        System.out.print("Masukkan NIM yang ingin diedit: ");
        String nim = scanner.nextLine();

        if (!mahasiswaMap.containsKey(nim)) {
            System.out.println("NIM-nya gaada nich");
            return;
        }

        System.out.print("Masukkan Nama baru: ");
        String namaBaru = scanner.nextLine();

        mahasiswaMap.put(nim, namaBaru);
        System.out.println("Cha ching, Mahasiswa berhasil diedit");
    }

    private static void hapusMahasiswa() {
        System.out.print("Masukkan NIM yang ingin dihapus: ");
        String nim = scanner.nextLine();

        if (mahasiswaMap.remove(nim) != null) {
            System.out.println("Huhuhuhu, babay");
        } else {
            System.out.println("NIM-nya gaada nich");
        }
    }
}
