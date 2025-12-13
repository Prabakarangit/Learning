package learn.designPattern.structural.decorator;

public class AppService {

    public static void main(String[] args) {
        Coffee coffee = new SugarDecorator(new MilkDecorator(new BasicCoffee()));
    }
}
