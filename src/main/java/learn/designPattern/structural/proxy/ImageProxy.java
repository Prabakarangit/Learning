package learn.designPattern.structural.proxy;

public class ImageProxy implements Image{

    private String fileName;

    public ImageProxy(String fileName){
        this.fileName = fileName;
    }

    @Override
    public void display() {
        Image image = new RealImage(fileName);
        image.display();
    }
}
