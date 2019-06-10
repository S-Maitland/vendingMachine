package Coins;

public enum CoinType {

    FIVE(0.05),
    TEN(0.10),
    TWENTY(0.20),
    FIFTY(0.50),
    POUND(1.00);

    private final double coinValue;

    CoinType(double coinValue){
        this.coinValue = coinValue;
    }

    public double getCoinValueFromEnum(){
        return this.coinValue;
    }
}
