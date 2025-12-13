package learn.java;

import java.util.concurrent.Callable;

public class Employee implements Callable {

    private String name;

    Employee(String name){
        this.name = name;
    }

    @Override
    public String call() throws Exception {

        if(name.equalsIgnoreCase("karan")){
            Thread.sleep(3000);
        }
        return name;
    }
}
