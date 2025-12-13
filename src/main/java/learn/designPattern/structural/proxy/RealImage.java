package learn.designPattern.structural.proxy;

public class RealImage implements Image{

    private String fileName;

    public RealImage(String fileName){
     this.fileName = fileName;
        loadFromDisk();
    }

    @Override
    public void display() {
        System.out.println("Real Image");
    }

    private void loadFromDisk() {
        System.out.println("Loading image : " + fileName);
    }

}
