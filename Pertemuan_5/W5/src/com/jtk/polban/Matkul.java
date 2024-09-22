package com.jtk.polban;

import java.sql.Time;

public class Matkul extends Jadwal{
    String Kodemk;
    String Namamk;
    String Jenismk;
    int Semester;

    public void setKodemk(String kodemk) {
        Kodemk = kodemk;
    }

    public void setNamamk(String namamk) {
        Namamk = namamk;
    }

    public void setJenismk(String jenismk) {
        Jenismk = jenismk;
    }

    public String getKodemk() {
        return Kodemk;
    }

    public String getNamamk() {
        return Namamk;
    }

    public String getJenismk() {
        return Jenismk;
    }

    public Matkul (String Hari, Time Waktu_mulai, Time Waktu_selesai,String Kodemk, String Namamk, String Jenismk,int Semester){
        super(Hari,Waktu_mulai,Waktu_selesai);
        this.Kodemk = Kodemk;
        this.Namamk = Namamk;
        this.Jenismk = Jenismk;
        this.Semester = Semester;
    }

    public void tampilkanjadwal(){
            System.out.println("Hari: " + Hari +" " +Waktu_mulai + "  " + Waktu_selesai + ""+ Kodemk + " - " + Namamk +  "" + Jenismk + "" + Semester);
        }
    }

