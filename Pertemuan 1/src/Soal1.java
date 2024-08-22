public class Soal1 {
    public static void main(String[] args) {
        byte angka1 = 125;
        byte angka2 = 6;
        int hasil = (int) (angka1 + angka2);

        System.out.println("Hasil:" + hasil);
    }
}
//Catatan :
// Dikarenakan nilai dari variabel angka1 dan variabel angka dua
// bila dijumlahkan nilainya akan melebihi 127, maka yang di print oleh system
// akan menjadi -125 karena bila dalam byte
// 125 + 6 = 127 sisa 4,
// bila ditambahkan 1 dari sisa, menjadi -128 sisa 3
// kenapa menjadi -128? karena bila melebihi 127 akan mulai dari -128,
// -128 + 3 = 5
// Oleh karena itu alternatif nya, tipe data hasil dari byte dirubah menjadi integer

// byte :Tipe data byte dapat menampung numerik dari -128 sampai 127.

// Referensi:
// https://nextgen.co.id/tipe-data-pada-java/
// https://www.geeksforgeeks.org/1s-2s-complement-binary-number/