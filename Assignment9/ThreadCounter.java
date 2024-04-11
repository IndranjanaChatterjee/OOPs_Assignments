class CounterTask implements Runnable {
     private int counter = 0;
        @Override
        public void run() {
            long startTime = System.currentTimeMillis();
            while (System.currentTimeMillis() - startTime < 10) {
                counter++;
                try {
                    Thread.sleep(10); // Simulate some work for 10ms
                } catch (InterruptedException e) {
                    break;
                }
            }
            System.out.println("Counter for " + Thread.currentThread().getName() + " = "+ counter);
        }
    }

public class ThreadCounter{

   

    public static void main(String[] args) throws InterruptedException {
        Thread thread1 = new Thread(new CounterTask(), "Thread-1");
        thread1.setPriority(1); // Priority 1

        Thread thread2 = new Thread(new CounterTask(), "Thread-2");
        thread2.setPriority(3); // Priority 3

        Thread thread3 = new Thread(new CounterTask(), "Thread-3");
        thread3.setPriority(5); // Priority 5 (default)

        Thread thread4 = new Thread(new CounterTask(), "Thread-4");
        thread4.setPriority(7); // Priority 7

        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();

    }

}
