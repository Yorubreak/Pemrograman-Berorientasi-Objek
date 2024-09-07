import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner insert = new Scanner(System.in);

        // Membaca input berupa plat nomor untuk 4 mobil
        System.out.println("Masukan 4 digit plat dari setiap mobil");
        String input = insert.nextLine();
        insert.close();

        // Menggabungkan semua angka plat nomor menjadi satu string
        String[] platNumbers = input.split(" ");
        StringBuilder combinedNumber = new StringBuilder();
        for (String plat : platNumbers) {
            combinedNumber.append(plat);
        }

        // Mengubah string gabungan menjadi angka dan kurangi dengan 999999
        long number = Long.parseLong(combinedNumber.toString());
        long result = number - 999999;

        // Memeriksa apakah hasil mod 5 sama dengan 0
        if (result % 5 == 0) {
            System.out.println("berhenti");
        } else {
            System.out.println("jalan");
        }
    }
}
