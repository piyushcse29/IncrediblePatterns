package creational;

public class ThreadSafeSingleton {

    volatile ThreadSafeSingleton obj = null;

    private ThreadSafeSingleton(){}

    public ThreadSafeSingleton getInstance(){
        if(obj == null) {
            synchronized (ThreadSafeSingleton.class) {
                if (obj == null) {
                    obj = new ThreadSafeSingleton();
                }
            }
        }
        return obj;
    }
}
