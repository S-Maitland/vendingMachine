import Coins.Coin;
import Coins.CoinReturn;
import Coins.CoinType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CoinTest {

    Coin coin1;
    Coin coin2;
    Coin coin3;
    Coin coin4;
    Coin coin5;
    CoinReturn coinReturn;

    @Before
    public void setUp(){
        coin1 = new Coin(CoinType.FIVE);
        coin2 = new Coin(CoinType.TEN);
        coin3 = new Coin(CoinType.TWENTY);
        coin4 = new Coin(CoinType.FIFTY);
        coin5 = new Coin(CoinType.POUND);
        coinReturn = new CoinReturn();
    }

    @Test
    public void canReturnCoinValues(){
        assertEquals(0.05, coin1.getValue(), 0.01);
        assertEquals(0.10, coin2.getValue(), 0.01);
        assertEquals(0.20, coin3.getValue(), 0.01);
        assertEquals(0.50, coin4.getValue(), 0.01);
        assertEquals(1.00, coin5.getValue(), 0.01);
    }

    @Test
    public void canReturnCoinsTotalValue(){
        coinReturn.addCoin(coin4);
        coinReturn.addCoin(coin5);
        assertEquals(1.50, coinReturn.getTotalCoins(), 0.01);
    }

}

