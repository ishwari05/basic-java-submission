import java.util.*;
public class Arrays {
    public static void main(String[] argvs){
        //array used to store multiple values in a single var
        Scanner obj1 = new Scanner(System.in);
        int[] arr = new int[5];

        System.out.println("enter elements of the array: ");

        for(int i = 0; i < 5; i++){
            arr[i] = obj1.nextInt();            
        }

        //find sum 
        int sum = 0;
        for(int i = 0; i < 5; i++){
            sum = sum + arr[i];           
        }

        System.out.println(sum);
    }
}
