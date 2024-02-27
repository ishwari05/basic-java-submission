package javaprac;

import java.util.*;
public class Swap {
    public static void main(String[] args){
        int num1;
        int num2;
        Scanner obj1 = new Scanner(System.in);
        System.out.println("enter two numbers: ");
        num1 = obj1.nextInt();
        num2 = obj1.nextInt();

        System.out.println("numbers before swapping: " + num1 + "," + num2);

        int temp = num1;
        num1 = num2;
        num2 = temp;

        System.out.println("numbers after swapping: " + num1 + "," + num2);
        
    }
}
