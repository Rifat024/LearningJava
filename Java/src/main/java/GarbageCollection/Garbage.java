package GarbageCollection;

public class Garbage {
    public void finalize(){
        System.out.println("Garbage value is cleared now");
    }
    public static void main(String[] args) {
        Garbage demo1=new Garbage();
        Garbage demo2=new Garbage();
        demo1=null;
        demo2=null;
        System.gc();

    }
}
