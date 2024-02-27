import java.util.Scanner;

public class Pentagon {
    public static void main(String[] args){
        Scanner obj1 = new Scanner(System.in);

        Pentagon obj2 = new Pentagon();
        obj2.calc();
    }

    void calc(){
        for(int i = 1; i < 10; i++){
            int number = (i * ((3 * i) - 1)) / 2;
            System.out.println(number + "\t");
        }
    }
}
