package Concurrency.java.util;

import java.util.concurrent.*;

public class FutureDemo {
    public static void main(String[] args) throws ExecutionException, InterruptedException {


         ExecutorService executor = Executors.newCachedThreadPool();
         Future<String> future =  executor.submit(()-> "Future Demo");
         System.out.println(future.get());

    }
}


