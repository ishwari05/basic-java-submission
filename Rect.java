import java.util.*;

public class Rect {

    double l, b;
    double area, cir;

    void input(){
        Scanner obj1 = new Scanner(System.in);
        System.out.println("Enter the length and breadth: ");
        l = obj1.nextDouble();
        b = obj1.nextDouble();
    }
    
    void area(){
        area = l * b;
        System.out.println(area);
    }

    void circumference(){
        cir = 2 * (l) + b;
        System.out.println(cir);
    }

    public static void main(String[] args){
        Rect obj2 = new Rect();
        obj2.input();
        obj2.area();
        obj2.circumference();
    }
}
