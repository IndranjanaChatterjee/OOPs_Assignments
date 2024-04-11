// Java program to suspend and 
// resume a thread

class MyThread implements Runnable {
  public void run() {
    try {
      Thread.sleep(500);
      System.out.println(Thread.currentThread().getName());
    } catch (Exception e) {

    }
  }
}

public class Main {
  public static void main(String[] args) {
    Thread t1 = new Thread(new MyThread());
    Thread t2 = new Thread(new MyThread());
    Thread t3 = new Thread(new MyThread());

    t1.start();
    t2.start();
    t2.suspend();
    t3.start();
    t2.resume();
  }
}
