import java.util.Scanner;

/**
 * Created by jc321013 on 28/08/16.
 */
public class EvenOdd {
    public static void main(String[] args)
    {
        int number;
        Scanner in = new Scanner(System.in);
        System.out.println("enter integer: ");
        number = in.nextInt();

        if ((number%2)==0)
            System.out.println(" The number you entered is even ");
        else
            if(number % 2 == 1)
                System.out.println(" The number you entered is odd ");

    }

}
