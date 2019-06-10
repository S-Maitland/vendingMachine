import Coins.Coin;
import Coins.CoinType;
import Product.Drink;
import Product.ProductCode;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class VendingMachineTest {
    private VendingMachine vendingMachine;
    private Coin coin1;
    private Coin coin2;
    private Coin coin3;
    private Drink drink;

    @Before
    public void setUp(){
        vendingMachine = new VendingMachine();
        coin1 = new Coin(CoinType.POUND);
        coin2 = new Coin(CoinType.FIFTY);
        coin3 = new Coin(CoinType.TWENTY);
        drink = new Drink("cola", "coca-cola");
    }

    @Test
    public void checkCoinIsValid(){
        vendingMachine.addCoin(coin1);
        assertEquals(1.00, vendingMachine.getCoinsTotal(),0.01);
    }

    @Test
    public void canAddCoinsToVendingMachine(){
        vendingMachine.addCoin(coin1);
        vendingMachine.addCoin(coin2);
        vendingMachine.addCoin(coin3);
        assertEquals(1.70, vendingMachine.getCoinsTotal(),0.01);
    }

    @Test
    public void canAddProductsToDrawer(){
        vendingMachine.addProduct(ProductCode.A1, drink);
        assertEquals(1, vendingMachine.drawerA1.getProductCount());
    }

    @Test
    public void canBuyProductFromVendingMachine(){
        vendingMachine.addCoin(coin1);
        vendingMachine.addProduct(ProductCode.A1, drink);
        assertEquals(drink, vendingMachine.buyProduct(ProductCode.A1));
    }
}
