import java.util.Scanner;

public class Calcarea {
    static double parameter;

    void input(){
        Scanner obj1 = new Scanner(System.in);
        System.out.println("enter radius/side: ");
        parameter = obj1.nextFloat();
    }


    double area(double radius){
        return 3.14 * radius * radius;
    }


    int area(int side){
        return side * side;
    }

    int area(){
        Scanner obj2 = new Scanner(System.in);
        System.out.println("enter length and breadth: ");
        int len = obj2.nextInt();
        int b = obj2.nextInt();
        return len * b;
    }



    public static void main(String[] args){
        Calcarea obj3 = new Calcarea();
        obj3.input();

        System.out.println("Area of circle is: " + obj3.area(parameter) );
        

        System.out.println("Area of square is: " + obj3.area((int)parameter) );
        

        int x = obj3.area();
        System.out.println("Area of rectangle is: " + x);
       

    }
}
