package com.jtk.polban;

public class Mahasiswa extends person {
    String NIM;
    String jurusan;
    int semester;

    public Mahasiswa(String Nama, String NIM, String jurusan, int semester){
        super(Nama);
        this.NIM = NIM;
        this.jurusan = jurusan;
        this.semester = semester;
    }

    public void setNIM(String NIM) {
        this.NIM = NIM;
    }

    public void setJurusan(String jurusan) {
        this.jurusan = jurusan;
    }

    public void setSemester(int semester) {
        this.semester = semester;
    }

    public String getNIM() {
        return NIM;
    }

    public String getJurusan() {
        return jurusan;
    }

    public int getSemester() {
        return semester;
    }

    @Override
    public void tampilkanperson(){
        System.out.println("    "+Nama+"            "+NIM+"     "+"     "+jurusan+"     "+"          "+semester);
    }
}