import java.util.Scanner;

public class Delete {
    public static void main(String[] args){
        //TO-DO delete an element from the array 
        Scanner obj1 = new Scanner(System.in);

        int[] arr = new int[5];

        System.out.println("enter elements of the array: ");

        for(int i = 0; i < 5; i++){
            arr[i] = obj1.nextInt();            
        }

        System.out.println("Enter the element to be deleted: ");

        int num = obj1.nextInt();
    }



}

