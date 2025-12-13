package learn.designPattern.structural.decorator;

public class BasicCoffee implements Coffee{

    @Override
    public String description() {
        return "Base Coffee";
    }

    @Override
    public int cost() {
        return 10;
    }

}
