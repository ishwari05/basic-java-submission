import java.util.*;

public class Validity {
    public static void main(String[] args){
        //TO-DO check valitdity of password

        Scanner obj1 = new Scanner(System.in);

        System.out.println("enter a string: ");

        String password = obj1.nextLine();

        System.out.println("Should atleast have 8 characters.");
        System.out.println("Should only consist only letters and digits.");
        System.out.println("Sould atleast have two digits");
        System.out.println("Please enter a password: ");

        Validity obj2 = new Validity();
        obj2.validlen(password);
        obj2.validchar(password);
        obj2.validdigs(password);
    }

    void validlen(String password){
        //atleast 8 char 
        //consists only letters and digits 
        //atleast two digits 
        if(password.length() > 8){
            System.out.println("INVALID");
        }
    }

    void validchar(String password){

        for(int i = 0; i < password.length(); i++){
            if(password.charAt(i) < 0 && password.charAt(i) > 9){
                System.out.println("INVALID");
                break;
            }
        }
        
        for(int i = 0; i < password.length(); i++){
            if(password.charAt(i) < 'A' && password.charAt(i) > 'Z'){
               System.out.println("INVALID"); 
               break;
            }
        }        
    }

    void validdigs(String password){
        int digit_num = 0;
        for(int i = 0; i < password.length(); i++){
            if(password.charAt(i) < 0 && password.charAt(i) > 9){
                digit_num++;
            }
        }
        if(digit_num < 2){
            System.out.println("INVALID: should atleast have 2 digits"); 
        }
    }
}

        
