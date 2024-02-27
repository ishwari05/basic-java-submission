package javaprac;
import java.util.Scanner;

public class Common {
    public static void main(String[] args){
        //TO-DO find common elements
        //not working 
        Scanner obj1 = new Scanner(System.in);
        int[] arr = new int[5];
        int[] arr2 = new int[5];

        System.out.println("enter elements of the array: ");

        for(int i = 0; i < 5; i++){
            arr[i] = obj1.nextInt();
        }

        System.out.println("enter elements of the array: ");
        for(int i = 0; i < 5; i++){
            arr2[i] = obj1.nextInt();
        }

        Common obj2 = new Common();
        obj2.look(arr, arr2);
        
    }

    void look(int a[], int a2[]){
        
        for(int i = 0; i < 5; i++){
            for(int j = 0; j < i; j++){
                if(a[i] == a2[j]){
                    System.out.println(a[i]);
                }
            }
        }            
    }
}

