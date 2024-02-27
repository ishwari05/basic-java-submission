import java.util.Scanner;

public class Maxmin {
    public static void main(String[] args){
        Scanner obj1 = new Scanner(System.in);

        int[] arr = new int[5];

        System.out.println("enter elements of the array: ");

        for(int i = 0; i < 5; i++){
            arr[i] = obj1.nextInt();            
        }

        int max = arr[0];
        int min = arr[0];

        for(int i = 1; i < 5; i++){
            if(max < arr[i]) {
                max = arr[i];
            }           
        }

        System.out.println("Max term is: " + max);

        for(int i = 1; i < 5; i++){
            if(min > arr[i]) {
                min = arr[i];
            }           
        }

        System.out.println("Min Term is: " + min);
    }
}
