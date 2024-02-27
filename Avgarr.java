import java.util.Scanner;

public class Avgarr {
    public static void main(String[] args){
        Scanner obj1 = new Scanner(System.in);
        int[] arr = new int[5];

        System.out.println("enter elements of the array: ");

        for(int i = 0; i < 5; i++){
            arr[i] = obj1.nextInt();            
        }

        int sum = 0;
        for(int i = 0; i < 5; i++){
            sum = sum + arr[i];           
        }

        int avg = sum / 5;
        System.out.println(avg);
    }
    
}
