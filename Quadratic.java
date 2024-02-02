import java.util.*;
public class Quadratic {
    public static void main(String[] args){
        Scanner obj1 = new Scanner(System.in);
        System.out.println("Enter coefficient of x^2");
        double a = obj1.nextInt();
        System.out.println("Enter coefficient of x");
        double b = obj1.nextInt();
        System.out.println("Enter value for c");
        double c = obj1.nextInt();

        //calc discriminant 
        double dis = (b * b) - (4*a*c);
        if(dis < 0){
            System.out.println("Roots arent real");
            //calc roots 
            double r1 = (-b + Math.pow(dis, 0.5)) / (2 * a);
            double r2 = (-b - Math.pow(dis, 0.5)) / (2 * a);

            System.out.println("roots are: " + r1 + "'" + r2);
        }
        else{
            System.out.println("Roots are real and exist");
        }       

    }
}
