class ConvertDataType
{
    static short methodOne(long l)
    {
        int i = (int) l;    // konversi long ke integer
        return (short)i;    // mengembalikan nilai konversi dari integer menjadi short
                            // long -> integer -> short
    }
    public static void main(String[] args)
    {
        double d = 10.25131212412;
        float f = (float) d;
        byte b = (byte) methodOne((long) f);
        System.out.println(b);
    }
}

// Hasil pengamatan
// tipe data awal variabel d yang awalnya bertipe double di konversi ke float dan di assign ke variabel f, variabel f dikonversi menjadi long,
// dan masuk ke fungsi methodOne, long menjadi integer, dan integer dikembalikan dengan tipe short
// dari short yang ditampung di variabel i, nilai dikonversi kembali menjadi tipe data byte yang di assign pada variabel b
// sehingga nilai yang awalnya 10.25, akan kehilangan nilai dibelakang koma nya