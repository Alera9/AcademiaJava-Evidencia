
class MyThread extends Thread {
    public void run() {
        System.out.println("Thread is running");
    }
}

public class TestMyThread {
    public static void main(String[] args) {
        Thread t1 = new MyThread();
        Thread t2 = new MyThread();
        t1.start();
        t2.start();
    }
}
