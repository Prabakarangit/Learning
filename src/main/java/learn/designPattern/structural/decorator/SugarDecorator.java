package learn.designPattern.structural.decorator;

public class SugarDecorator extends CoffeeDecorator{

    public SugarDecorator(Coffee coffee){
        super(coffee);
    }

    @Override
    public int cost() {
        return super.cost() + 10;
    }

    @Override
    public String description() {
        return super.description() + "added sugar";
    }

}
