package task14ThreadSynchronized;

public class ThreadSynchronized extends Thread {
    private Object lock = new Object();

    public void ThreadSleep() {
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
