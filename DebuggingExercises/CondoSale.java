import javax.swing.*;
import java.util.Scanner;

/**
 * Created by jc321013 on 28/08/16.
 */
public class CondoSale {
    public static void main(String args[]) throws Exception
    {

        int usersChoice;
        Scanner in = new Scanner(System.in);
        System.out.println("\n1 - park view at $150,000\n2 - golf course view at $170,000\n3 - Lake view at $210,000\n4 - $0");
        System.out.println("enter integer: ");
        usersChoice = in.nextInt();

        if(usersChoice == 1)
            System.out.println(1);
        else
            if(usersChoice == 2)
                System.out.println(2);
        else
            if(usersChoice == 3)
                System.out.println(3);
        else
            System.out.println(4);
    }
}
