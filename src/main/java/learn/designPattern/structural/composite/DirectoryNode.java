package learn.designPattern.structural.composite;

import java.util.ArrayList;
import java.util.List;

public class DirectoryNode {

    List<FileSystemNode> nodeList = new ArrayList<>();

    public  void addFileSystemNode(FileSystemNode fileSystemNode){
        nodeList.add(fileSystemNode);
    }

    public void show(){
        for(FileSystemNode node : nodeList){
            node.show();
        }
    }

}
