import java.util.Scanner;

public class Reverse {
    public static void main(String[] args){

        //TO-DO reverse an elements of the array

        Scanner obj1 = new Scanner(System.in);

        int[] arr = new int[5];

        System.out.println("enter elements of the array: ");

        for(int i = 0; i < 5; i++){
            arr[i] = obj1.nextInt();            
        }

        Reverse obj2 = new Reverse();

        obj2.rev(arr);
    }

    void rev(int[] arr){
        int temp = arr[0];

        int t;

        for(int i = 0; i < 5; i++){
              t = arr[i];
              arr[i] = arr[i + 1];
              arr[i + 1] = t;
        }

        System.out.println(temp);
        System.out.println(arr);


    }
}


