package Concurrency.java.util;

import java.util.concurrent.ThreadFactory;

public class ThreadFactoryDemo implements ThreadFactory {
    public Thread newThread(Runnable r) {
        return new Thread(r);
    }

    public static void main(String[] args) {
        new ThreadFactoryDemo().newThread(()-> System.out.println("hello")).start();
        new Thread(()-> System.out.println("hello")).start();
    }

}