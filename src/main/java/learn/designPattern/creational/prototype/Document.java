package learn.designPattern.creational.prototype;

public class Document implements Cloneable{

    private String name;

    public Document(String name){
        this.name = name;
    }

    @Override
    public Document clone() {
        return new Document(this.name);
    }
}
