package ExceptionHandling;

public class Exception  {
    public static void main(String[] args) {

       /* try {
            int a = 10;
            int b = 0;
            int result=a / b;
            System.out.println(result);
        }catch (ArithmeticException e) {
            System.out.println(e);
        }
        finally {
            System.out.println("last line");
        }*/

        try {
          int result = Integer.parseInt("Rifat");
            System.out.println(result);
        }catch (NumberFormatException nfe) {
            System.out.println("Exception= "+nfe);
        }
        finally {
            System.out.println("last line");
        }
        //  int number = Integer.parseInt("pants");
    }

}