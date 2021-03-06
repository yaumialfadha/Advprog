package id.ac.ui.cs.advprog.tutorial4.exercise1;

import id.ac.ui.cs.advprog.tutorial4.exercise1.factory.DepokPizzaIngredientFactory;
import id.ac.ui.cs.advprog.tutorial4.exercise1.factory.PizzaIngredientFactory;
import id.ac.ui.cs.advprog.tutorial4.exercise1.pizza.CheesePizza;
import id.ac.ui.cs.advprog.tutorial4.exercise1.pizza.ClamPizza;
import id.ac.ui.cs.advprog.tutorial4.exercise1.pizza.Pizza;
import id.ac.ui.cs.advprog.tutorial4.exercise1.pizza.VeggiePizza;

public class DepokPizzaStore extends PizzaStore {

    @Override
    protected Pizza createPizza(String item) {
        Pizza pizza = null;
        PizzaIngredientFactory ingredientFactory =
                new DepokPizzaIngredientFactory();

        if (item.equals("cheese")) {
            pizza = new CheesePizza(ingredientFactory);
            pizza.setName("Depok Style Cheese Pizza");
        } else if (item.equals("veggie")) {
            pizza = new VeggiePizza(ingredientFactory);
            pizza.setName("Depok Style Veggie Pizza");

        } else if (item.equals("clam")) {
            pizza = new ClamPizza(ingredientFactory);
            pizza.setName("Depok Style Clam Pizza");
        }

        return pizza;
    }
}
