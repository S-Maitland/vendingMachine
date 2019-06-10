import Coins.Coin;
import Coins.CoinReturn;

import java.util.ArrayList;

public class VendingMachine {

    private CoinReturn coinReturn;
    private ArrayList<Drawer> drawerA1;
    private ArrayList<Drawer> drawerB2;
    private ArrayList<Drawer> drawerC3;
    private ArrayList<Coin> credit;

    public VendingMachine() {
        credit = new ArrayList<Coin>();
        drawerA1 = new ArrayList<Drawer>();
        drawerB2 = new ArrayList<Drawer>();
        drawerC3 = new ArrayList<Drawer>();
        coinReturn = new CoinReturn();
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
}
