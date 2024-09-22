package com.polban.jtk.sales;

// Kelas Sales untuk mengelola transaksi penjualan
public class Sales {
    private Product produk;
    // Constructor
    public Sales( Product produk ) {
        this.produk = produk;
    }
    // Metode untuk melakukan penjualan
    public void sellProduct(int quantity) {
        System.out.println("Memproses penjualan...");
        produk.sellProduct(quantity);
        System.out.println("Stok setelah penjualan: " +
                produk.getStock());
    }
    // Metode untuk menambah stok produk
    public void restockProduct(int quantity) {
        System.out.println("Menambah stok...");
        produk.addStock(quantity);
        System.out.println("Stok setelah penambahan: " +
                produk.getStock());
    }
    // Metode untuk memperbarui harga produk
    public void updateProductPrice(double newPrice) {
        System.out.println("Memperbarui harga produk...");
        produk.setPrice(newPrice);

        System.out.println(" Harga baru " + String.format("%2f",produk.getPrice()));

    }
}

