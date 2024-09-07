import java.util.Scanner;

public class Task4 {
    public static void main(String[] args){
        Scanner insert = new Scanner(System.in);
        int gaji_pokok = 500000;
        int item = 50000;
        int banyak_penjualan;
        int bonus;

        System.out.println("BONUS PENJUALAN AGEN");
        System.out.println("Masukan berapa banyak produk yang berhasil di jual");
        banyak_penjualan = insert.nextInt();
        insert.nextLine();

        if(banyak_penjualan >= 80)
        {
            bonus = gaji_pokok + ((banyak_penjualan * 50000 * 35)/100);
        } else if (banyak_penjualan >= 40 & banyak_penjualan < 80)
        {
            bonus = gaji_pokok + ((banyak_penjualan * 50000 * 25)/100);
        } else if (banyak_penjualan >= 15 & banyak_penjualan < 40) {
            bonus = gaji_pokok + ((banyak_penjualan * 50000 *10)/100);
        }else{
            bonus = gaji_pokok + ((banyak_penjualan * item) * 10/100) - (gaji_pokok * 15/100);
        }

        System.out.println("Penghasilan Agen =" + bonus);


    }
}
