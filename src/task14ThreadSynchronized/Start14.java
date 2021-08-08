package task14ThreadSynchronized;

public class Start14 {
    public static void main(String[] args) {
        Object lock =new Object();
        ThreadSynchronized t = new ThreadSynchronized(lock);
        ThreadSynchronized t1 = new ThreadSynchronized(lock);
        ThreadSynchronized t2 = new ThreadSynchronized(lock);
        ThreadSynchronized t3 = new ThreadSynchronized(lock);
        ThreadSynchronized t4 = new ThreadSynchronized(lock);
        ThreadSynchronized t5 = new ThreadSynchronized(lock);
        ThreadSynchronized t6 = new ThreadSynchronized(lock);
        ThreadSynchronized t7= new ThreadSynchronized(lock);
        ThreadSynchronized t8 = new ThreadSynchronized(lock);
        ThreadSynchronized t9 = new ThreadSynchronized(lock);
        t.start();
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
        t6.start();
        t7.start();
        t8.start();
        t9.start();
    }
}
