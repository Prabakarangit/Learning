package learn.designPattern.creational.abstractFactory;

public class UIFactoryProvider {

    public static UIFactory getFactory(String theme){
        return switch (theme) {
            case "Light" -> new LightUIFactory();
            case "Dark" -> new DarkUIFactory();
            default -> null;
        };
    }
}
