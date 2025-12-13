package learn.designPattern.structural.composite;

public class FileNode implements FileSystemNode{
    @Override
    public void show() {
        System.out.println("Leaf node");
    }
}
