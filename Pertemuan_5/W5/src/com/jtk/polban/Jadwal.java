package com.jtk.polban;

import java.sql.Time;

public abstract class Jadwal {
    String Hari;
    Time Waktu_mulai;
    Time Waktu_selesai;
    String Koderuangan;
    String Namaruangan;
    private Dosen dosen;

    public Jadwal(String Hari, Time Waktu_mulai, Time Waktu_selesai){
        this.Hari  = Hari;
        this.Waktu_mulai = Waktu_mulai;
        this.Waktu_selesai = Waktu_selesai;
    }

    public void setRuangan (String Koderuangan, String Namaruangan){
        this.Koderuangan = Koderuangan;
        this.Namaruangan = Namaruangan;
    }

    // Getter and Setter untuk dosen
    public Dosen getDosen() {
        return dosen;
    }

    public void setDosen(Dosen dosen) {
        this.dosen = dosen;
    }

    public void setHari(String hari) {
        Hari = hari;
    }

    public void setWaktu_mulai(Time waktu_mulai) {
        Waktu_mulai = waktu_mulai;
    }

    public void setWaktu_selesai(Time waktu_selesai) {
        Waktu_selesai = waktu_selesai;
    }

    public String getHari() {
        return Hari;
    }

    public Time getWaktu_mulai() {
        return Waktu_mulai;
    }

    public Time getWaktu_selesai() {
        return Waktu_selesai;
    }

    public void setKoderuangan(String koderuangan) {
        Koderuangan = koderuangan;
    }

    public void setNamaruangan(String namaruangan) {
        Namaruangan = namaruangan;
    }

    public String getKoderuangan() {
        return Koderuangan;
    }

    public String getNamaruangan() {
        return Namaruangan;
    }

    public abstract void tampilkanjadwal();
}

