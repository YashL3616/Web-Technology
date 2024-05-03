//Class 1
package MultiThreading;

public class MultiThreading {
    public static void main(String[] args) {
        Mythread thread1 = new Mythread();
        Mythread thread2 = new Mythread();
        thread1.start();
        thread2.start();
    }
}



//Class 2
package MultiThreading;

public class Mythread extends Thread {
    public void run() {
        for(int i = 0 ; i < 5 ; i ++) {
            System.out.println("Thread " + i);
            try {
                Thread.sleep(1000);
            } catch(InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
