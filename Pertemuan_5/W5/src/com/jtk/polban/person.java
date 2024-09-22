package com.jtk.polban;

public abstract class person {
    String Nama;

    public person(String Nama){
        this.Nama = Nama;
    }

    public void setNama(String Nama) {
        this.Nama =  Nama;
    }

    public String getNama() {
        return Nama;
    }

    public abstract void tampilkanperson();
}
