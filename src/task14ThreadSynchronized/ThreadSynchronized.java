package task14ThreadSynchronized;

public class ThreadSynchronized extends Thread {
    private Object lock;

    public ThreadSynchronized(Object lock) {
        this.lock=lock;
    }


    public void run () {
        synchronized (lock) {
            try {
                Thread.sleep(2000);
            } catch ( InterruptedException e ) {
                e.printStackTrace();
            }
            System.out.println(getName());
        }
    }

}
