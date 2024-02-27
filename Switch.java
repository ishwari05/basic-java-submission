package javaprac;

import java.util.*;
import java.io.*;

public class Switch {
    public static void main(String[] agrs)
    {  
        //create a scanner object to read input from user 
        Scanner obj1 = new Scanner(System.in);
        Scanner obj2 = new Scanner(System.in);
        

        System.out.println("Input first number: ");
        int num1 = obj1.nextInt();

        System.out.print("Input another number: ");
        int num2 = obj1.nextInt();

        //take input as string from user 

        System.out.print("Enter operation you wanna perform: ");
        String op = obj2.nextLine();

        switch(op)
        {
            case "sum":
                System.out.println(num1 + "+" + num2 + "=" + (num1 + num2));
                break;
            case "difference":
                 System.out.println(num1 + "-" + num2 + "=" + (num1 - num2));
                 break;
            case "multiply":
                System.out.println(num1 + "x" + num2 + "=" + (num1 * num2));
                break;
            case "divide":   
                 System.out.println(num1 + "/" + num2 + "=" + (num1 / num2));
                 break;
            case "remainder":
                System.out.println(num1 + "%" + num2 + "=" + (num1 % num2));
                break;  
        }
        
    }
}
