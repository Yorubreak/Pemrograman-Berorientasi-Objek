public class Operator {
    public static void main(String[] args){
        double x = 92.4;
        int nx = (int) Math.round(x);

        System.out.println("X = " + nx );
    }
}

// Pengamatan


// Catatan
// Math.round merupakan fungsi pembulatan untuk membulatkan suatu nilai float, dimana bila nilai dibelakang koma lebih dari atau sama dengan 5
// akan dibulatkan ke atas, sedangkan bila nilai dibelakang koma kurang dari 5 akan dibulatkan ke bawah
// Math.round harus di casting ke integer supaya dapat berfungsi sesuai dengan tujuannya.
