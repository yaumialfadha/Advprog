package id.ac.ui.cs.advprog.tutorial4.exercise1.factory;

import id.ac.ui.cs.advprog.tutorial4.exercise1.factory.cheese.Cheese;
import id.ac.ui.cs.advprog.tutorial4.exercise1.factory.cheese.MimiCheese;
import id.ac.ui.cs.advprog.tutorial4.exercise1.factory.clam.Clams;
import id.ac.ui.cs.advprog.tutorial4.exercise1.factory.clam.SmokedClams;
import id.ac.ui.cs.advprog.tutorial4.exercise1.factory.dough.Dough;
import id.ac.ui.cs.advprog.tutorial4.exercise1.factory.dough.ThiccCrustDough;
import id.ac.ui.cs.advprog.tutorial4.exercise1.factory.sauce.MicinSauce;
import id.ac.ui.cs.advprog.tutorial4.exercise1.factory.sauce.Sauce;
import id.ac.ui.cs.advprog.tutorial4.exercise1.factory.veggies.BlackOlives;
import id.ac.ui.cs.advprog.tutorial4.exercise1.factory.veggies.Mushroom;
import id.ac.ui.cs.advprog.tutorial4.exercise1.factory.veggies.RedPepper;
import id.ac.ui.cs.advprog.tutorial4.exercise1.factory.veggies.Salak;
import id.ac.ui.cs.advprog.tutorial4.exercise1.factory.veggies.Veggies;

public class DepokPizzaIngredientFactory implements PizzaIngredientFactory {

    public Dough createDough() {
        return new ThiccCrustDough();
    }

    public Sauce createSauce() {
        return new MicinSauce();
    }

    public Cheese createCheese() {
        return new MimiCheese();
    }

    public Veggies[] createVeggies() {
        Veggies[] veggies = {new BlackOlives(), new Mushroom(), new RedPepper(), new
                Salak()};
        return veggies;
    }

    public Clams createClam() {
        return new SmokedClams();
    }
}
