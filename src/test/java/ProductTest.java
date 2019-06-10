import Product.Crisps;
import Product.Drink;
import Product.Sweets;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ProductTest {

    Drink drink;

    @Before
    public void setUp(){
        drink = new Drink("Cola", "coca-cola");
    }

    @Test
    public void canGetDrinkNameAndBrand(){
        assertEquals("Cola", drink.getName());
        assertEquals("coca-cola", drink.getBrand());
    }

    @Test
    public void canSetDrinkNameAndBrand(){
        drink.setName("Fanta Lemon");
        drink.setBrand("Fanta");
        assertEquals("Fanta Lemon", drink.getName());
        assertEquals("Fanta", drink.getBrand());
    }

}
