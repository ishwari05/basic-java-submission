import java.util.Scanner;

public class Iterate {
    public static void main(String[] args){
        //TO-DO iterate array 

        Scanner obj1 = new Scanner(System.in);

        int[] arr = new int[5];

        System.out.println("enter elements of the array: ");

        for(int i = 0; i < 5; i++){
            arr[i] = obj1.nextInt();            
        }

        int[] new_arr = new int[5];

        for(int i = 0; i < 5; i++){
            new_arr[i] = arr[i];            
        }

        for(int i = 0; i < 5; i++){
            System.out.println(new_arr[i]);           
        }


    }
}
