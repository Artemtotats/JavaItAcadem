package task15;

import java.util.concurrent.*;

public class Start {
    public static void main(String[] args) throws ExecutionException, InterruptedException {

        ExecutorService executorService = Executors.newFixedThreadPool(3);

        for (int i = 0; i < 10; i++) {
            System.out.println(executorService.submit(new MyCallable()).get());
        }
        executorService.shutdown();
    }


}
