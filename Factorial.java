package javaprac;
import java.util.*;

public class Factorial {
    public static void main(String argv[]){
        //find factorial of a number 
        int number;
        Scanner obj2 = new Scanner(System.in);
        number = obj2.nextInt();
        int fact = 1;

        for(int i = 0; i <= number; i++)
        {
            fact *= i;
        }

        System.out.println(fact);

    }
}
