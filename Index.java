import java.util.Scanner;

public class Index{
    public static void main(String[] args){
        //TO-DO find index of an array element
        Scanner obj1 = new Scanner(System.in);

        int[] arr = new int[5];

        System.out.println("enter elements of the array: ");

        for(int i = 0; i < 5; i++){
            arr[i] = obj1.nextInt();            
        }

        System.out.println("Enter the number whose index is to be found: ");
        int number = obj1.nextInt();

        findi(number, arr);

    }

    static void findi(int number, int arr[]){
        for(int i = 0; i < 5; i++){
            if(number == arr[i]){
                System.out.println(i);
            }
        }

    }
}
