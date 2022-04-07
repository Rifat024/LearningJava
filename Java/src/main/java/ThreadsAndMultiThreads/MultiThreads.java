package ThreadsAndMultiThreads;

public class MultiThreads extends Thread {

    private Integer id;
    public MultiThreads(Integer id){
        this.id=id;
    }
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(id+" no Thread Class id=" + i);
            try {
                Threads.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
