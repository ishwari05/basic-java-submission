package javaprac;

import java.util.*;

public class Triangle {
    public static void main(String args[]){
            //check if triangle is constructible 
        int side_a;
        int side_b;
        int side_c;
        Scanner obj1 = new Scanner(System.in);
        System.out.println("enter sides: ");

        side_a = obj1.nextInt();
        side_b = obj1.nextInt();
        side_c = obj1.nextInt();

        if(side_a + side_b > side_c || side_a + side_b > side_c){
            System.out.println("Triangle is constructible");

            //check type of the triangle
            if(side_a == side_b && side_b == side_c){
                System.out.println("is Equilateral");
            }
            else if(side_a == side_b || side_b == side_c || side_a == side_c){
                System.out.println("is isosceles");
            }
            else{
                System.out.println("is scalene");
            }
        }
        else{
            System.out.println("Triangle is not constructible");
        }

    }




}
