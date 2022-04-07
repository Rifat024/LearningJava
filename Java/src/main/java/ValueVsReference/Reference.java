package ValueVsReference;

public class Reference {
    public static void main(String[] args) {
        Reference reference=new Reference();
        reference.start();
    }

    public void start(){
        String last="Z";
        Container container= new Container();
        container.setInitial("C");
        another(container,last);
        System.out.println("Container= "+container.getInitial());

    }
    public void another(Container initialHolder, String newInitial){
        newInitial.toLowerCase();
        initialHolder.setInitial("B");
        Container container=new Container();
        initialHolder=container;
        System.out.println("Initial Holder= "+initialHolder.getInitial());
        System.out.println("New Initial= "+newInitial);
    }

}
