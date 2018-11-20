package Concurrency.java.util;

import java.sql.SQLOutput;
import java.util.concurrent.*;

public class ThreadPoolDemo {
    public static void main(String[] args) {

        //ThreadPool Demo
        threadPoolDemo();

        //ThreadPool Scheduler
        threadPoolScheduler();

    }



    static void threadPoolDemo(){

       //Fixed Size
       ExecutorService executor =  Executors.newFixedThreadPool(2);
       executor.submit(()-> System.out.println("Fixed Thread Pool Demo 1"));
       executor.submit(()-> System.out.println("Fixed Thread Pool Demo 2"));


       //Variable Size
       ExecutorService executor2 =  (ThreadPoolExecutor)Executors.newCachedThreadPool();
       executor2.submit(()-> System.out.println("Unlimited Thread Pool Demo 1"));
       executor2.submit(()-> System.out.println("Unlimited Thread Pool Demo 2"));


    }

    private static void threadPoolScheduler() {
        ScheduledExecutorService executor = Executors.newScheduledThreadPool(2);
        executor.schedule(()->System.out.println("Thread Pool Scheduler Demo"),500, TimeUnit.MILLISECONDS);

    }

}
