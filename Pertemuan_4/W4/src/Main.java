import com.polban.jtk.sales.Product;
import com.polban.jtk.sales.Sales;

public class Main {
    public static void main(String[]args) {
        Product produk = new Product("Laptop ", 10000, 10);

        Sales sales = new Sales(produk);
        sales.sellProduct(3);
        sales.restockProduct(5);
        sales.updateProductPrice(1929219291);
        sales.updateProductPrice(-1234134141);
        sales.updateProductPrice(1499999);
    }
}