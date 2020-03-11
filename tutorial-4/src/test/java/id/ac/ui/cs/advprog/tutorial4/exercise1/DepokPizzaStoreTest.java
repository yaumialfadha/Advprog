package id.ac.ui.cs.advprog.tutorial4.exercise1;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import id.ac.ui.cs.advprog.tutorial4.exercise1.pizza.Pizza;
import java.lang.reflect.Modifier;

import org.junit.Before;
import org.junit.Test;


public class DepokPizzaStoreTest {

    private Class<?> pizzaStoreClass;

    @Before
    public void setUp() throws Exception {
        pizzaStoreClass = Class.forName(PizzaStore.class.getName());
    }

    @Test
    public void testDepokStoreIsPublic() {
        int classModifiers = pizzaStoreClass.getModifiers();

        assertTrue(Modifier.isPublic(classModifiers));
    }

    @Test
    public void testOrderPizzaReturnPizza() throws Exception {
        Pizza pizza = (new DepokPizzaStore()).orderPizza("clam");

        assertNotNull(pizza);
    }
}