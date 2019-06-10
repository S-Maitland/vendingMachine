package Coins;

public class Coin {

    CoinType coin;

    public Coin(CoinType coin) {
        this.coin = coin;
    }

    public double getValue() {
        return this.coin.getCoinValueFromEnum();
    }
}
