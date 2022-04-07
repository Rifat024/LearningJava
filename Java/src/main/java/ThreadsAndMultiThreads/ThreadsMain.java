package ThreadsAndMultiThreads;

public class ThreadsMain {
    public static void main(String[] args) throws InterruptedException {

        for (int i = 0; i < 10; i++) {
            Threads thread1 = new Threads(i);
            Thread thread2= new Thread(new ThreadsInterface());
            thread1.run();
            thread2.run();
            Thread.sleep(1000);
        }

    }
}
