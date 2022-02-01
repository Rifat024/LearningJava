package DivisorOfFour;

public class Main {
    public static void main(String[]args)
    {
        int resultLeft,resultRight;
       // LeftSide left=new LeftSide();
        RightSide right=new RightSide();
        for(int i=100;i<1000;i++)
        {
            resultLeft=i/4;
            right.CovertNumber(i);
            resultRight=right.multi;

            if(resultLeft==resultRight)
            System.out.println(resultLeft);
        }
    }
}
