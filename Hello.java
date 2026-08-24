import java.util.Scanner;

public class Hello{
     public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("enter a 3 number: ");
        long n = scanner.nextLong();
        int a  = 0;
        int b = 1;
        for( long i = 0 ; i<n; i++){
            System.out.print(a + " ");
            int result = a + b;
            a = b;
            b = result;
        }
        scanner.close();
    }

    }

   




       
        




       
        
   