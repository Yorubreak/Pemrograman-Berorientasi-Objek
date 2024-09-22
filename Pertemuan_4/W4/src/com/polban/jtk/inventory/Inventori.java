package com.polban.jtk.inventory;

import com.polban.jtk.inventory.Barang;

public class Inventori {
    Barang[] barangs;

    void initBarang() {
        barangs = new Barang[2];
        barangs[0] = new Barang("001", "Baju", 10);
        barangs[1] = new Barang("002", "Celana", 20);
    }

    void showBarang() {
        System.out.println(barangs[0].getNamaBarang() + " (" + barangs[0].getStok() + ")");
        System.out.println(barangs[1].getNamaBarang() + " (" + barangs[1].getStok() + ")");
    }

    void pengadaan() {
        initBarang();

        barangs[0].addStok(20); // Menambah stok sebanyak 20
        barangs[0].addStok(-30); // Tes mengurangi stok

        showBarang();
    }

    public static void main(String[] args) {
        Inventori beli = new Inventori();
        beli.pengadaan();
    }
}