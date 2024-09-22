package com.polban.jtk.inventory;

public class Barang {
    private String kode_barang;
    private String nama_barang;
    private int stok;

    public Barang(String kode, String nama, int stk) {
        this.kode_barang = kode;
        this.nama_barang = nama;
        this.stok = stk;
    }

    // Getter untuk stok
    public int getStok() {
        return stok;
    }

    // Setter untuk stok, hanya memperbolehkan penambahan
    public void addStok(int jumlah) {
        if (jumlah > 0) {
            this.stok += jumlah;
        } else {
            System.out.println(STR."Operasi selain penambahan tidak diizinkan. Stok tetap \{stok}");
        }
    }

    // Getter untuk nama barang
    public String getNamaBarang() {
        return nama_barang;
    }
}
