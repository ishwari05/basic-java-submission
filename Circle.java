package javaprac;
import java.util.Scanner;

public class Circle {
    public static void main(String[] args){
        double radius;
        Scanner obj1 = new Scanner(System.in);
        System.out.println("enter radius for the circle: ");
        radius = obj1.nextDouble();

        //was throwing error when declaring float
        double area = 3.14*radius*radius;
        System.out.println("area of the circle: " + area);

        double circumference = 3.14*2*radius;
        System.out.println("circumference of the circle: " + circumference);
    }
}
