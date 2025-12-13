package learn.java;

import java.util.List;
import java.util.concurrent.*;

public class MultiThreading {

    public static void main(String[] args) throws ExecutionException, InterruptedException {

        ExecutorService executor = Executors.newFixedThreadPool(10);
        Employee emp = new Employee("Praba");

        Future<String> result = executor.submit(emp);//for one thread

        List<Callable<String>> callableList = List.of(new Employee("Praba"), new Employee("karan"));

        List<Future<String>> futures = executor.invokeAll(callableList);

        for(Future f : futures){
            System.out.println(System.currentTimeMillis());
            System.out.println(f.get());
        }

        String output = result.get();
        System.out.println(output);



    }
}
