import java.util.*;
public class Arrays2 {
    public static void main(String[] args){
        //TO-DO test if a specific value exists in the array
        Scanner obj1 = new Scanner(System.in);

        //take input for the specific value to be found 
        System.out.println("Enter the number to be found: ");
        int number = obj1.nextInt();

        int[] arr = new int[5];

        System.out.println("enter elements of the array: ");

        for(int i = 0; i < 5; i++){
            arr[i] = obj1.nextInt();            
        }

        find(number, arr);

    }

    static void find(int number, int arr[]){
        for(int i = 0; i < 5; i++){
            if(number == arr[i]){
                System.out.println("found");
            }
        }
    }

}




