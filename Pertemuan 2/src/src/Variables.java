public class Variables {
    /* CONSTANT 1*/
    public static void main(String[] args) {
        final double CM_PER_INCH = 2.54;
        double paperWidth = 8.5;
        double paperHeight = 11;
        System.out.println("Paper size in centimeters: " +
                paperWidth * CM_PER_INCH + " by " + paperHeight *
                CM_PER_INCH);
    }

    /* CONSTANT 2*/
//    public static final double CM_PER_INCH = 2.54;
//        public static void main(String[] args) {
//            double paperWidth = 8.5;
//            double paperHeight = 11;
//            System.out.println("Paper size in centimeters: " + paperWidth *
//                    CM_PER_INCH + " by " + paperHeight * CM_PER_INCH);
//        }
//    }

}

/* Catatan */
// Perbedaan antara keduanya terletak pada deklarasi variabel nya
// untuk CONSTANT 1, deklarasi variabel CM_PER_INCH, terdapat di dalam fungsi (Lokal),sehingga variabel tersebut hanya berlaku di fungsi tersebut
// Untuk Constant 2, deklarasi variabel CM_PER_INCH dilakukan secara di luar fungsi (global), sehingga variable berfungsi untuk seluruh fungsi

