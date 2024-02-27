import java.util.*;
public class Consec {
    public static void main(String[] args){
        //TO-DO check wether numbers are consecutive or not
         
        int num1, num2, num3;

        Scanner obj1 = new Scanner(System.in);

        System.out.println("Enter three numbers: ");

        num1 = obj1.nextInt();
        num2 = obj1.nextInt();
        num3 = obj1.nextInt();

        conse(num1, num2, num3);

    }

    static void conse(int a, int b, int c){
        if(b == (a + 1) && c == (a + 2)){
            System.out.println("Are consecutive");
        }
        else{
            System.out.println("arent consecutive");
        }
    }
}
