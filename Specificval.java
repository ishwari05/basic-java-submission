package javaprac;
import java.util.Scanner;

public class Specificval {
    public static void main(String[] args){
        
        Scanner obj1 = new Scanner(System.in);
        int[] arr = new int[5];

        System.out.println("enter elements of the array: ");

        for(int i = 0; i < 5; i++){
            arr[i] = obj1.nextInt();
        }

        System.out.println("enter number to be found: ");
        int number = obj1.nextInt();

        Specificval obj2 = new Specificval();
        boolean x = obj2.look(number, arr);
        if(x == true){
            System.out.println("Value found");
        }
        else{
            System.out.println("Value not found");
        }
    }
    boolean look(int n, int a[]){
        boolean flag;
        for(int i = 0; i < 5; i++){
            if(n == a[i]){
                flag = true;
            }
            else{
                flag = false;
            }
        }

        if(flag = true){
            return true;
        }
        else{
            return false;
        }
        
    }
}
