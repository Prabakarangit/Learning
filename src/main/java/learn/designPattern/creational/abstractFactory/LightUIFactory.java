package learn.designPattern.creational.abstractFactory;

public class LightUIFactory implements UIFactory{

    public Button getButton(){
        return new LightButton();
    }
    public Checkbox getCheckbox(){
        return new LightCheckbox();
    }

}
