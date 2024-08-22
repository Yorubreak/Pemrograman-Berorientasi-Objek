public class Soal2 {
    public static void main(String[] args){
        int i = 42;
        String s = (i < 40)?"life":(i>50)?"universe":"everything";
        System.out.println(s);
    }
}

// Catatan:
// line ke 4 menggunakan operator ternary yang berguna untuk mempersingkat pernyataan if-else
// mengambil tiga operator dimana ada kondisi dan 2 ekspresi
// Variabel : Kondisi ? "True" :"False"
// Dari  line tersebut diketahui bahwa, jika nilai i kurang dari 40, system akan mencetak "life"
// bila false maka akan masuk ke kondisi ke 2 yaitu bila nilai i lebih dari 50, system akan mencetak "universe"
// dan bila false lagi atau nilai i ada diantara 39 dan 51 system akan mencetak "everything"

//Referensi:
// https://www-scholarhat-com.translate.goog/tutorial/java/ternary-operator-in-java?_x_tr_sl=en&_x_tr_tl=id&_x_tr_hl=id&_x_tr_pto=wa



