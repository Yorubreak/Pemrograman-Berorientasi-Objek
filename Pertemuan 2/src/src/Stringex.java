import java.util.Scanner;

public class Stringex {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Membaca dua string dari input
        System.out.println("Kata 1 = ");
        String A = scanner.nextLine();
        System.out.println("Kata 2 = ");
        String B = scanner.nextLine();

        // 1. Menjumlahkan panjang kedua string
        int lengthSum = A.length() + B.length();
        System.out.println(lengthSum);

        // 2. Menentukan apakah A lebih besar secara leksikografis dibanding B
        if (A.compareTo(B) > 0) {
            System.out.println("Yes"); //
        } else {
            System.out.println("No"); //
        }

        // 3. Kapitalisasi huruf pertama pada kedua string dan mencetaknya
        String capitalizedA = A.substring(0, 1).toUpperCase() + A.substring(1);
        String capitalizedB = B.substring(0, 1).toUpperCase() + B.substring(1);
        System.out.println(capitalizedA + " " + capitalizedB);

        scanner.close();
    }
}