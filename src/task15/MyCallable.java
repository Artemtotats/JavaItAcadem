package task15;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;

class MyCallable implements Callable<String> {
    public String call() throws Exception {
        List<Integer> random = new ArrayList<>();
        int listSize = 10;
        for (int i = 0; i < listSize; i++) {
            int value = (int) (Math.random() * 100);
            random.add(value);
        }
        int minSleep = 1000;
        int maxSleep = 10000;
        int sleep = (int) (Math.random() * (maxSleep - minSleep) + minSleep);
        Thread.sleep(sleep);
        int summ = 0;
        for (int i = 0; i < random.size(); i++) {
            summ += random.get(i);
        }
        String stringSumm = String.valueOf(summ);
        return Thread.currentThread().getName()+" :"+summ;
    }

}