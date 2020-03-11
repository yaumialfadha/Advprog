package id.ac.ui.cs.advprog.tutorial1.strategy;

public class ModelDuck extends Duck {
    // TODO Complete me!
    public ModelDuck(){
    	this.setFlyBehavior(new FlyNoWay());
    	this.setQuackBehavior(new Squeak());
    }

    @Override
    public void display(){
    	System.out.println("I'm a model duck.");
    }
}
