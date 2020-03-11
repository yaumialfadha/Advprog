package id.ac.ui.cs.advprog.tutorial4.exercise1;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import id.ac.ui.cs.advprog.tutorial4.exercise1.pizza.Pizza;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

import org.junit.Before;
import org.junit.Test;

public class PizzaStoreTest {

    private Class<?> pizzaStoreClass;

    @Before
    public void setUp() throws Exception {
        pizzaStoreClass = Class.forName(PizzaStore.class.getName());
    }

    @Test
    public void testDuckIsAbstract() {
        int classModifiers = pizzaStoreClass.getModifiers();

        assertTrue(Modifier.isAbstract(classModifiers));
    }

    @Test
    public void testDuckHasOrderPizzaMethod() throws Exception {
        Method order = pizzaStoreClass.getMethod("orderPizza", String.class);
        int methodModifiers = order.getModifiers();

        assertTrue(Modifier.isPublic(methodModifiers));
        assertEquals(Pizza.class.getTypeName(), order.getGenericReturnType().getTypeName());
    }
}