package Concurrency;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class MultipleProducerConsumer {

    static LinkedBlockingQueue<Integer> messages = new LinkedBlockingQueue<Integer>();

    public static void main(String[] args) {

        for(int i = 0; i < 100; i++)
        new Thread(()-> {
            try {
                new Producer().produce(messages);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }).start();
        for(int i = 0; i < 100; i++)
        new Thread(()-> {
            try {
                new Consumer().consumer(messages);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }).start();
    }
}

class Producer{


     void produce(LinkedBlockingQueue<Integer> messages) throws InterruptedException {
        messages.add(1);
        //if(messages.size() > 10)
           // wait();

       // notify();
        System.out.println(messages);
    }
}

class Consumer{
    void consumer(LinkedBlockingQueue<Integer> messages) throws InterruptedException {
//        if(messages.isEmpty()){
//            wait();
//        }
        messages.remove();
        System.out.println(messages);
    }
}