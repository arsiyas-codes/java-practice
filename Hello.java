import java.util.Scanner;

public class Hello{
     public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("enter a number: ");
        long n = scanner.nextLong();
        long fact = 1; 
        for(long i = 1; i<=n; i++){
            fact = fact * i;
        }
        System.out.println("the factorial of " + n + " is " + fact);
        scanner.close();
    }

}
   




       
        




       
        
   