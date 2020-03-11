package id.ac.ui.cs.advprog.tutorial4.exercise1;

import id.ac.ui.cs.advprog.tutorial4.exercise1.pizza.Pizza;

public class PizzaTestDrive {

    public static void main(String[] args) {
        PizzaStore nyStore = new NewYorkPizzaStore();

        Pizza pizza = nyStore.orderPizza("cheese");
        System.out.println("Ethan ordered a " + pizza + "\n");

        pizza = nyStore.orderPizza("clam");
        System.out.println("Ethan ordered a " + pizza + "\n");

        pizza = nyStore.orderPizza("veggie");
        System.out.println("Ethan ordered a " + pizza + "\n");

        PizzaStore depokStore = new DepokPizzaStore();

        pizza = depokStore.orderPizza("cheese");
        System.out.println("Joko ordered a " + pizza + "\n");

        pizza = depokStore.orderPizza("clam");
        System.out.println("Joko ordered a " + pizza + "\n");

        pizza = depokStore.orderPizza("veggie");
        System.out.println("Joko ordered a " + pizza + "\n");
    }
}
