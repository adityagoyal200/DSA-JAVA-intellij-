import java.util.Random;

public class TwoThreadsDemo {

    public static void main(String[] args) {
        Thread thread1 = new Thread(new Task1());
        Thread thread2 = new Thread(new Task2());
        thread1.start();
        System.out.println();
        thread2.start();
    }

    static class Task1 implements Runnable {
        @Override
        public void run() {
            for (int i = 0; i < 100; i++) {
                System.out.println("Hello World");
            }
        }
    }

    static class Task2 implements Runnable {
        @Override
        public void run() {
            Random rand = new Random();
            for (int i = 0; i < 100; i++) {
                int randomNum = rand.nextInt(140) + 110;
                System.out.println(randomNum);
            }
        }
    }
}

