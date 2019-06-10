import Coins.Coin;
import Coins.CoinReturn;
import Product.Product;
import Product.ProductCode;

import java.util.ArrayList;

public class VendingMachine {

    private CoinReturn coinReturn;
    private ArrayList<Coin> credit;
    Drawer drawerA1;
    Drawer drawerB2;
    Drawer drawerC3;

    public VendingMachine() {
        credit = new ArrayList<Coin>();
        coinReturn = new CoinReturn();
        drawerA1 = new Drawer(ProductCode.A1, 1.00);
        drawerA1 = new Drawer(ProductCode.B2, 0.65);
        drawerA1 = new Drawer(ProductCode.C3, 0.50);

    }

    public void addCoin(Coin coin){
        double value = coin.getValue();

        if (value == 0.05 || value == 0.10 || value == 0.20 || value == 0.50 || value == 1.00){
        this.credit.add(coin);
        } else {
            coinReturn.addCoin(coin);
        }
    }

    public double getCoinsTotal(){
        double total = 0;

        for (Coin currentCoin : credit){
            total += currentCoin.getValue();
        }
        return total;
    }

    public void addProduct(Product product){
        this.drawerA1.addProduct(product);
    }

    public Product buyProduct(ProductCode productCode){

        double totalCoins = this.getCoinsTotal();
        Product vendProduct = null;

        if(productCode == ProductCode.A1 && totalCoins >= drawerA1.getPrice()) {
            vendProduct = drawerA1.returnProduct();
        } else {
            if (productCode == ProductCode.B2 && totalCoins >= drawerB2.getPrice()) {
                vendProduct = drawerB2.returnProduct();
            } else {
                if (productCode == ProductCode.C3 && totalCoins >= drawerC3.getPrice()) {
                    vendProduct = drawerC3.returnProduct();
                }
            }
        }
        return vendProduct;
    }

}
