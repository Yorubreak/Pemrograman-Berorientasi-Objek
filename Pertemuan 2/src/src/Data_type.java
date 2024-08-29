import java.math.BigInteger;
import java.util.Scanner;

public class Data_type {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Masukkan nilai: ");
        int T = in.nextInt();
        BigInteger[] arr = new BigInteger[T];

        // Menginput nilai dan menyimpannya dalam array
        for (int i = 0; i <T; i++) {
            System.out.print("Masukkan Angka ke-" + (i + 1) + ": ");
            String input = in.next();  // Membaca input sebagai String
            try {
                arr[i] = new BigInteger(input);  // Mengonversi String ke BigInteger
            } catch (NumberFormatException e) {
                System.out.println("Input tidak valid. Harap masukkan angka yang valid.");
                i--; // Mengulang input untuk indeks yang sama
            }
        }

        // Menampilkan dan memeriksa setiap nilai
        for (int i = 0; i <T; i++) {
            System.out.println("Nilai ke-" + (i + 1) + ": " + arr[i]);
            checkValueRange(arr[i]);
        }

        in.close();
    }

    private static void checkValueRange(BigInteger value) {
        System.out.println("Bisa masuk ke dalam:");

        // Periksa apakah value dapat masuk ke dalam tipe data byte
        try {
            value.byteValueExact();
            System.out.println("- byte");
        } catch (ArithmeticException e) {
            // Tidak dapat dimasukkan dalam byte
        }

        // Periksa apakah value dapat masuk ke dalam tipe data short
        try {
            value.shortValueExact();
            System.out.println("- short");
        } catch (ArithmeticException e) {
            // Tidak dapat dimasukkan dalam short
        }

        // Periksa apakah value dapat masuk ke dalam tipe data int
        try {
            value.intValueExact();
            System.out.println("- int");
        } catch (ArithmeticException e) {
            // Tidak dapat dimasukkan dalam int
        }

        // Periksa apakah value dapat masuk ke dalam tipe data long
        try {
            value.longValueExact();
            System.out.println("- long");
        } catch (ArithmeticException e) {
            System.out.println("- can't be fitted anywhere. ");
        }
    }
}