import Product.Product;
import Product.ProductCode;

import java.util.ArrayList;

public class Drawer {

    private ProductCode productCode;
    double price;
    private ArrayList<Product> products;

    public Drawer(ProductCode productCode, double price) {
        this.productCode = productCode;
        this.price = price;
        this.products = new ArrayList<Product>();
    }

    public ProductCode getProductCode() {
        return productCode;
    }

    public void setProductCode(ProductCode productCode) {
        this.productCode = productCode;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void addProduct(Product product) {
        this.products.add(product);
    }

    public Product returnProduct() {
        return this.products.remove(0);
    }

    public int getProductCount() {
        return this.products.size();
    }

}
