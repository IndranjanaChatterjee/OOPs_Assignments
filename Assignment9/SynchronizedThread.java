class Counter implements Runnable {
  int count = 0;
  @Override
  synchronized public void run() {
    for(int i = 0; i < 1000; i++)
        count++;
    System.out.println("Count for " + Thread.currentThread().getName() + " = " + count);
  }
}

public class SynchronizedCounter {
  public static void main(String[] args) throws InterruptedException {
    Thread thread1 = new Thread(new Counter());
    Thread thread2 = new Thread(new Counter());
    thread1.start();
    thread2.start();
  }
}
