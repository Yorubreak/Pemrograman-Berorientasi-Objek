package com.jtk.polban;

public class Dosen extends person {
    String kode_dosen;
    String jabatan;

    public Dosen (String Nama, String kode_dosen, String jabatan){
        super(Nama);
        this.kode_dosen = kode_dosen;
        this.jabatan = jabatan;
    }

    public void setKode_dosen(String kode_dosen) {
        this.kode_dosen = kode_dosen;
    }

    public void setJabatan(String jabatan) {
        this.jabatan = jabatan;
    }

    public String getKode_dosen() {
        return kode_dosen;
    }

    public String getJabatan() {
        return jabatan;
    }

    public void tampilkanperson(){
        System.out.println("       "+ Nama +"                          " +kode_dosen+ "                    "+jabatan);
    }
}

