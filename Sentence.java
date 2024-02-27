import java.util.*;
public class Sentence {
    public static void main(String[] args){
        //TO-DO read characters until a period is received

        Scanner obj1 = new Scanner(System.in);
        int ctr = 0;
        String my_string;

        do{
            System.out.println("input a sentence: ");
            my_string = obj1.nextLine();
            break;
        }while(my_string != ".");

         

        while(my_string != "/0"){
            if(my_string == " "){
                ctr++;
            }

        }
        
        System.out.println(ctr);



        



    }
}
