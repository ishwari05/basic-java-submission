import java.util.Scanner;

public class Factorialr {

    public static int calc(int n){
        if(n == 0){
            return 1;
        }

        return n * calc(n - 1);
    }




    public static void main(String[] args){
        Scanner obj1 = new Scanner(System.in);

        int number = obj1.nextInt();

        int factorial = calc(number);
        System.out.println(factorial);

    }
}
