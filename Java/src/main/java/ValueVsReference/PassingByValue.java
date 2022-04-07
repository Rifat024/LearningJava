package ValueVsReference;

import java.util.Scanner;

public class PassingByValue {
    public static void calculate(int value){
       value = value * 100;
    }

    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter Number=");
        int number=scanner.nextInt();
        calculate(number);
        System.out.println("Local Variable= "+number);

    }
}
