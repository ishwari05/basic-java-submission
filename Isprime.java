import java.util.*;

public class Isprime {
    public static void main(String args[]){
        int i, n ,m = 0; 
        Scanner obj1 = new Scanner(System.in);
        System.out.println("enter a number: ");
        n = obj1.nextInt();     
        m=n/2;      
        if(n==0||n==1){  
        System.out.println(n + " is not prime number");      
        }
        else{  
            for(i=2;i<=m;i++){      
                if(n%i==0){      
                    System.out.println(n +" is not prime number");      
                }
            }         
        }

    }
    
}
