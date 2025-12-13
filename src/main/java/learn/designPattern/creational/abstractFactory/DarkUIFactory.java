package learn.designPattern.creational.abstractFactory;

public class DarkUIFactory implements UIFactory{

    public Button getButton(){
        return new DarkButton();
    }
    public Checkbox getCheckbox(){
        return new DarkCheckbox();
    }

}
