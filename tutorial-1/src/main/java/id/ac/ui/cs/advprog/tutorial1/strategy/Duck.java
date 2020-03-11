package id.ac.ui.cs.advprog.tutorial1.strategy;

public abstract class Duck {

    private FlyBehavior flyBehavior;
    private QuackBehavior quackBehavior;

    public void performFly() {
        flyBehavior.fly();
    }

    public void performQuack() {
        quackBehavior.quack();
    }

    // TODO Complete me!
    public abstract void display();

    public void swim(){
    	System.out.println("All ducks float, even decoys!");

    }
    public void setFlyBehavior (FlyBehavior flyBehavior){
    	this.flyBehavior = flyBehavior;
    }
    public void setQuackBehavior(QuackBehavior quackBehavior){
    	this.quackBehavior = quackBehavior;
    }


}
