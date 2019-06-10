import Coins.Coin;
import Coins.CoinReturn;
import Product.Product;

import java.util.ArrayList;

public class VendingMachine {

    private CoinReturn coinReturn;
    private ArrayList<Drawer> drawers;
    private ArrayList<Coin> credit;

    public VendingMachine() {
        credit = new ArrayList<Coin>();
        drawers = new ArrayList<Drawer>();
        coinReturn = new CoinReturn();
//        drawer = new Drawer(ProductCode.C3, 1.00);
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
        this.drawers.add(product);
    }
}
