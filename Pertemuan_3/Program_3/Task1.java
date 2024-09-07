import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner insert = new Scanner(System.in);

        System.out.println("Masukan Kalimat:");
        String str = insert.nextLine();

        String[] arrOfStr = str.split("[ ']");

        int jumlahKata = arrOfStr.length;
        System.out.println("Jumlah kata: " + jumlahKata);

        ;for (String a : arrOfStr)
            System.out.println(a);
    }
}

