package ThreadsAndMultiThreads;

public class MultiThreadMain {
    public static void main(String[] args) throws InterruptedException {
       for(int i=0;i<5;i++){
           MultiThreads multiThreads=new MultiThreads(i);
           multiThreads.start();
           System.out.println(i+" no thread is alive? Answer= "+multiThreads.isAlive());
           Thread.sleep(10000);
       }

    }
}
