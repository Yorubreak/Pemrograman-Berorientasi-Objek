import java.util.Scanner;

public class Task2{
    public static void main(String[] args) {
        Scanner insert = new Scanner(System.in);
        String[] s = new String[3];
        int[] x = new int[3];

        for (int i = 0; i < 3; i++) {
            System.out.println("Masukan kata : ");
            s[i] = insert.nextLine();
            System.out.println("Masukan angka: ");
            x[i]= insert.nextInt();

            insert.nextLine();
        }

        System.out.println("================================");
        for (int i = 0; i < 3; i++){
            System.out.printf("%-15s %03d %n", s[i], x[i]);
        }
        System.out.println("================================");

        insert.close();
    }
}