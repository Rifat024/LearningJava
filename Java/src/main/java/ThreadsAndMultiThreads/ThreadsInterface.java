package ThreadsAndMultiThreads;

public class ThreadsInterface implements Runnable{
    @Override
    public void run() {
        try {
            System.out.println("Thread Interface Id= "+Threads.currentThread().getId());
        }catch (Exception e){
            System.out.println("Exception= "+e);
        }
    }
}
