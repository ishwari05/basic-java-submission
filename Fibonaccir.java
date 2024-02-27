import java.util.Scanner;

public class Fibonaccir {

    //TO-DO calc nth fibonacci number 

     static int fibo(int n){
        if(n == 0){
            return 0;
        }else if(n == 1){
            return 1;
        }

        return fibo(n - 1) + fibo(n - 2);
    }




    public static void main(String[] args){

        Scanner obj1 = new Scanner(System.in);

        System.out.println("Enter the position to be found: ");
         int number = obj1.nextInt();

        System.out.println(fibo(number));

    }
}
