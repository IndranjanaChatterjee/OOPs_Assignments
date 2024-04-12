class MyThread implements Runnable {
    Thread thread;
    boolean suspended;

    MyThread(String name) {
        thread = new Thread(this, name);
        suspended = false;
        thread.start();
    }

    public void run() {
        try {
            for (int i = 1; i <= 10; i++) {
                System.out.println(Thread.currentThread().getName() + ": " + i);
                Thread.sleep(200); // Sleep for 200 milliseconds
                synchronized (this) {
                    while (suspended) {
                        wait();
                    }
                }
            }
        } catch (InterruptedException e) {
            System.out.println(Thread.currentThread().getName() + " interrupted.");
        }
        System.out.println(Thread.currentThread().getName() + " exiting.");
    }

    synchronized void suspendThread() {
        suspended = true;
    }

    synchronized void resumeThread() {
        suspended = false;
        notify();
    }
}

public class Main {
    public static void main(String[] args) {
        MyThread thread1 = new MyThread("Thread 1");
        MyThread thread2 = new MyThread("Thread 2");

        try {
            Thread.sleep(1000); // Sleep for 1 second
            thread1.suspendThread();
            System.out.println("Thread 1 suspended.");
            Thread.sleep(2000); // Sleep for 2 seconds
            thread1.resumeThread();
            System.out.println("Thread 1 resumed.");
        } catch (InterruptedException e) {
            System.out.println("Main thread interrupted.");
        }

        try {
            thread1.thread.join();
            thread2.thread.join();
        } catch (InterruptedException e) {
            System.out.println("Main thread interrupted.");
        }

        System.out.println("Main thread exiting.");
    }
}
