import java.util.*;
public class Fact3{
    public static void main(String[] args){
        Scanner obj1 = new Scanner(System.in);
        int number;

        System.out.println("Enter an integer: ");

        number = obj1.nextInt();

        test(number);        

    }

    static void test(int n){
        System.out.print(n + " =");
        int result = n;
        while (result % 3 == 0){
            System.out.print("3 * ");
            result = result / 3;
        }
        System.out.print(result);
    }

}