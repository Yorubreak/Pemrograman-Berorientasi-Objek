import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner insert = new Scanner(System.in);

        System.out.println("Masukan operasi penjumlahan  contoh (A + B) =");
        String Jumlah = insert.nextLine();

        String[] token = Jumlah.split(" ");

        int A = Integer.parseInt(token[0]);
        char operator = token[1].charAt(0);
        int B = Integer.parseInt(token[2]);

        float hasil = 0;

        switch (operator) {
            case '+':
                hasil = A + B;
                break;
            case '-':
                hasil = A - B;
                break;
            case '*':
                hasil = A * B;
                break;
            case '/':
                hasil = (float) A / B;
                break;
            case '%':
                hasil = A % B;
                break;
            default:
                System.out.println("Input tidak valid");
                break;
        }
        System.out.println("Hasil = " + hasil);
    }
}

