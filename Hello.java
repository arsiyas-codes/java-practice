import java.util.Scanner;

public class Hello{
     public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("enter a number: ");
        long n = scanner.nextLong();
        for(long i = 1; i<=10; i++){
            long j = n * i;
            System.out.println( n + " * " + i + " = " + j);
        }
        scanner.close();
    }

}
   




       
        




       
        
   