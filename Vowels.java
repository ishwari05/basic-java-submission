import java.util.*;
public class Vowels {
    public static void main(String[] args){
        Scanner obj1 = new Scanner(System.in);

        String my_string;

        System.out.println("Enter a string: ");

        my_string = obj1.nextLine();
        
        Vowels obj2 = new Vowels();
        
        System.out.println(obj2.nov(my_string));

    }

    int nov(String s) {
        int count = 0;//why does it throw error when not initialised???
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == 'a' || s.charAt(i) == 'e' ||
             s.charAt(i) == 'i' || s.charAt(i) == 'o' || s.charAt(i) == 'u' ){
                count++;
            }
        }

        return count;
    }
}
