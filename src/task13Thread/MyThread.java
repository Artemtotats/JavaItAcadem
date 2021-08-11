package task13Thread;

public class MyThread extends Thread {
    public void run() {
        int[] array = new int[10];
        int max = 0;
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 100);
            if (array[i] > max) {
                max = array[i];
            }
        }
        System.out.println(getName() + " " + "max = " + max);
    }
}