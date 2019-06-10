package Coins;

import java.util.ArrayList;

public class CoinReturn {

    private ArrayList<Coin> coins;

    public CoinReturn() {
        coins = new ArrayList<Coin>();
    }

    public double getTotalCoins(){
        double total = 0;

        for (Coin currentCoin : coins){
            total += currentCoin.getValue();
        }
        return total;
    }

    public void addCoin(Coin coin){
        this.coins.add(coin);
    }

}
