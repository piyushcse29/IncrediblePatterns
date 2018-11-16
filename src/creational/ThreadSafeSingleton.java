package creational;

public class ThreadSafeSingleton {

   private static volatile ThreadSafeSingleton obj = null;

    private ThreadSafeSingleton(){}

    public static ThreadSafeSingleton getInstance(){
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
