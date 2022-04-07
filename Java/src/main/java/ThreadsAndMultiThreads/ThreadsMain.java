package ThreadsAndMultiThreads;

public class ThreadsMain {
    public static void main(String[] args) {

        for (int i = 0; i < 10; i++) {
            Threads thread1 = new Threads(i);
            Thread thread2= new Thread(new ThreadsInterface());
            thread1.start();
            thread2.start();
        }

    }
}
