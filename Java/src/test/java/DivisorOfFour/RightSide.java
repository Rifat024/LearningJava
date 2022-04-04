package DivisorOfFour;

public class RightSide {

    int number, digit, multi = 1, j = 0;
   // int arr[] = new int[3];

    void CovertNumber(int number) {
        while (number > 0) {
//finds the last digit of the given number
            digit = number % 10;
//adds last digit to the variable sum
            multi = multi * digit;
//removes the last digit from the number
            number = number / 10;

        }

    }
}






