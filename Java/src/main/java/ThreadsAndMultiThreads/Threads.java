package ThreadsAndMultiThreads;

public class Threads extends Thread{
   private Integer id;
   public Threads(Integer id){
       this.id=id;
   }

    @Override
    public void run() {
       try {
           System.out.println("Thread Class object= "+id);
       }catch (Exception e){
           System.out.println("Exception= "+e);
       }
    }
}
