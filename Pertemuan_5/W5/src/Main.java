import com.jtk.polban.*;
import java.util.List;
import java.sql.Time;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Mahasiswa> daftarMahasiswa = new ArrayList<>();
        daftarMahasiswa.add(new Mahasiswa("Budi", "231511049", "Teknik Informatika", 3));
        daftarMahasiswa.add(new Mahasiswa("Andi", "231511050", "Teknik Informatika", 2));
        daftarMahasiswa.add(new Mahasiswa("Siti", "231511051", "Teknik Informatika", 4));
        daftarMahasiswa.add(new Mahasiswa("Agus", "231511052", "Sistem Informasi", 3));
        daftarMahasiswa.add(new Mahasiswa("Dewi", "231511053", "Sistem Informasi", 2));
        daftarMahasiswa.add(new Mahasiswa("Rina", "231511054", "Teknik Komputer", 4));
        daftarMahasiswa.add(new Mahasiswa("Tono", "231511055", "Teknik Komputer", 1));
        daftarMahasiswa.add(new Mahasiswa("Rudi", "231511056", "Teknik Informatika", 3));
        daftarMahasiswa.add(new Mahasiswa("Mira", "231511057", "Sistem Informasi", 1));
        daftarMahasiswa.add(new Mahasiswa("Tanti", "231511058", "Teknik Informatika", 2));

        List<Dosen> daftarDosen = new ArrayList<>();
        daftarDosen.add(new Dosen("Bambang", "K001", "Pengajar"));
        daftarDosen.add(new Dosen("Sulastri", "K002", "Koordinator Mata Kuliah"));
        daftarDosen.add(new Dosen("Sutrisno", "K003", "Pengajar"));
        daftarDosen.add(new Dosen("Rahayu", "K004", "Kepala Laboratorium"));
        daftarDosen.add(new Dosen("Agung", "K005", "Pengajar"));
        daftarDosen.add(new Dosen("Hartono", "K006", "Dekan Fakultas"));
        daftarDosen.add(new Dosen("Ratna", "K007", "Pengajar"));
        daftarDosen.add(new Dosen("Surya", "K008", "Koordinator Program Studi"));
        daftarDosen.add(new Dosen("Wahyu", "K009", "Pengajar"));
        daftarDosen.add(new Dosen("Lina", "K010", "Pengajar"));

        List<Matkul> daftarJadwal = new ArrayList<>();

        daftarJadwal.add(new Matkul("Senin", Time.valueOf("08:00:00"), Time.valueOf("10:00:00"), "IF101", "Pemrograman 1", "Teori", 1));
        daftarJadwal.add(new Matkul("Senin", Time.valueOf("10:00:00"), Time.valueOf("12:00:00"), "IF102", "Algoritma", "Praktik", 2));
        daftarJadwal.add(new Matkul("Selasa", Time.valueOf("08:00:00"), Time.valueOf("10:00:00"), "IF103", "Struktur Data", "Teori", 3));
        daftarJadwal.add(new Matkul("Selasa", Time.valueOf("10:00:00"), Time.valueOf("12:00:00"), "IF104", "Basis Data", "Teori", 4));
        daftarJadwal.add(new Matkul("Rabu", Time.valueOf("08:00:00"), Time.valueOf("10:00:00"), "IF105", "Matematika Diskrit", "Teori", 3));
        daftarJadwal.add(new Matkul("Rabu", Time.valueOf("10:00:00"), Time.valueOf("12:00:00"), "IF106", "Pemrograman Lanjut", "Praktik", 5));
        daftarJadwal.add(new Matkul("Kamis", Time.valueOf("08:00:00"), Time.valueOf("10:00:00"), "IF107", "Jaringan Komputer", "Teori", 6));
        daftarJadwal.add(new Matkul("Kamis", Time.valueOf("10:00:00"), Time.valueOf("12:00:00"), "IF108", "Sistem Operasi", "Praktik", 4));
        daftarJadwal.add(new Matkul("Jumat", Time.valueOf("08:00:00"), Time.valueOf("10:00:00"), "IF109", "Kecerdasan Buatan", "Teori", 7));
        daftarJadwal.add(new Matkul("Jumat", Time.valueOf("10:00:00"), Time.valueOf("12:00:00"), "IF110", "Rekayasa Perangkat Lunak", "Teori", 8));

        daftarJadwal.get(0).setRuangan("R101", "Laboratorium Komputer");
        daftarJadwal.get(1).setRuangan("R102", "Ruang Kuliah A");
        daftarJadwal.get(2).setRuangan("R103", "Ruang Kuliah B");
        daftarJadwal.get(3).setRuangan("R104", "Ruang Kuliah C");
        daftarJadwal.get(4).setRuangan("R105", "Laboratorium Jaringan");
        daftarJadwal.get(5).setRuangan("R106", "Laboratorium Komputer");
        daftarJadwal.get(6).setRuangan("R107", "Ruang Kuliah D");
        daftarJadwal.get(7).setRuangan("R108", "Laboratorium Sistem Operasi");
        daftarJadwal.get(8).setRuangan("R109", "Ruang Kuliah E");
        daftarJadwal.get(9).setRuangan("R110", "Ruang Kuliah F");

        daftarJadwal.get(0).setDosen(daftarDosen.get(0)); // Bambang
        daftarJadwal.get(1).setDosen(daftarDosen.get(1)); // Sulastri
        daftarJadwal.get(2).setDosen(daftarDosen.get(2)); // Sutrisno
        daftarJadwal.get(3).setDosen(daftarDosen.get(3)); // Rahayu
        daftarJadwal.get(4).setDosen(daftarDosen.get(4)); // Agung
        daftarJadwal.get(5).setDosen(daftarDosen.get(5)); // Hartono
        daftarJadwal.get(6).setDosen(daftarDosen.get(6)); // Ratna
        daftarJadwal.get(7).setDosen(daftarDosen.get(7)); // Surya
        daftarJadwal.get(8).setDosen(daftarDosen.get(8)); // Wahyu
        daftarJadwal.get(9).setDosen(daftarDosen.get(9)); // Lina

        int pilihan = 0;
        while (pilihan != 4) {
            System.out.println("\n=== Menu Pilihan ===");
            System.out.println("1. Tampilkan Daftar Mahasiswa");
            System.out.println("2. Tampilkan Daftar Dosen");
            System.out.println("3. Tampilkan Jadwal Kuliah");
            System.out.println("4. Keluar");
            System.out.print("Pilih opsi (1-4): ");

            // Cek apakah input adalah integer
            if (scanner.hasNextInt()) {
                pilihan = scanner.nextInt();
                scanner.nextLine(); // Mengkonsumsi newline

                switch (pilihan) {
                    case 1:
                        tampilkanDaftarMahasiswa(daftarMahasiswa);
                        break;
                    case 2:
                        tampilkanDaftarDosen(daftarDosen);
                        break;
                    case 3:
                        tampilkanJadwalKuliah(daftarJadwal);
                        break;
                    case 4:
                        System.out.println("Terima kasih! Program selesai.");
                        break;
                    default:
                        System.out.println("Pilihan tidak valid. Silakan coba lagi.");
                }
            } else {
                System.out.println("Input tidak valid. Silakan masukkan angka antara 1-4.");
                scanner.nextLine();
            }
        }

        scanner.close();
    }

    private static void tampilkanDaftarMahasiswa(List<Mahasiswa> daftarMahasiswa) {
        System.out.println("\nDaftar Mahasiswa:");
        System.out.println("==================================================================================");
        System.out.printf("| %-15s | %-12s | %-20s | %-10s |\n", "Nama", "NIM", "Jurusan", "Semester");
        System.out.println("----------------------------------------------------------------------------------");
        for (Mahasiswa mhs : daftarMahasiswa) {
            System.out.printf("| %-15s | %-12s | %-20s | %-10d |\n",
                    mhs.getNama(),
                    mhs.getNIM(),
                    mhs.getJurusan(),
                    mhs.getSemester());
        }
        System.out.println("==================================================================================");
    }

    private static void tampilkanDaftarDosen(List<Dosen> daftarDosen) {
        System.out.println("\nDaftar Dosen:");
        System.out.println("==========================================================================================");
        System.out.printf("| %-20s | %-10s | %-30s |\n", "Nama", "Kode", "Jabatan");
        System.out.println("------------------------------------------------------------------------------------------");
        for (Dosen dsn : daftarDosen) {
            System.out.printf("| %-20s | %-10s | %-30s |\n",
                    dsn.getNama(),
                    dsn.getKode_dosen(),
                    dsn.getJabatan());
        }
        System.out.println("==========================================================================================");
    }

    private static void tampilkanJadwalKuliah(List<Matkul> daftarJadwal) {
        System.out.println("\nJadwal Mata Kuliah:");
        System.out.println("=============================================================================================================================================================");
        System.out.printf("| %-6s | %-13s | %-14s | %-9s | %-15s | %-10s | %-20s | %-18s | %-25s |\n",
                "Hari", "Waktu Mulai", "Waktu Selesai", "Kode MK", "Nama MK", "Jenis MK", "Ruangan", "Kode Dosen", "Nama Dosen");
        System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------------------------");
        for (Matkul jadwal : daftarJadwal) {
            System.out.printf("| %-6s | %-13s | %-14s | %-9s | %-15s | %-10s | %-20s | %-18s | %-25s |\n",
                    jadwal.getHari(),
                    jadwal.getWaktu_mulai(),
                    jadwal.getWaktu_selesai(),
                    jadwal.getKodemk(),
                    jadwal.getNamamk(),
                    jadwal.getJenismk(),
                    jadwal.getNamaruangan(),
                    jadwal.getDosen().getKode_dosen(),
                    jadwal.getDosen().getNama());
        }
        System.out.println("===============================================================================================================================================================");
    }
}
