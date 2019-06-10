import Product.Crisps;
import Product.Drink;
import Product.ProductCode;
import Product.Sweets;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DrawerTest {

    Drawer drawer;
    Drink drink;
    Crisps crisps;
    Sweets sweet;

    @Before
    public void setUp(){
        drink = new Drink("Cola", "coca-cola");
        crisps = new Crisps("Salt n Vinegar", "walkers");
        sweet = new Sweets("Milkyway", "nestle");
        drawer = new Drawer(ProductCode.A1,1.00);
    }

    @Test
    public void canAddProductToDrawer(){
        drawer.addProduct(drink);
        assertEquals(1, drawer.getProductCount());
    }

    @Test
    public void canReturnProductFromDrawer(){
        drawer.addProduct(drink);
        drawer.returnProduct();
        assertEquals(0, drawer.getProductCount());
    }

    @Test
    public void canGetDrawerPrice(){
        assertEquals(1.00, drawer.getPrice(), 0.01);
    }
    @Test
    public void canSetDrawerPrice(){
        drawer.setPrice(0.65);
        assertEquals(0.65 ,drawer.getPrice(), 0.01);
    }

    @Test
    public void canGetDrawerProductCode(){
        assertEquals(ProductCode.A1 ,drawer.getProductCode());
    }

    @Test
    public void canSetDrawerProductCode(){
        drawer.setProductCode(ProductCode.B2);
        assertEquals(ProductCode.B2, drawer.getProductCode());
    }

}
