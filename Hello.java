import java.util.Scanner;
public class Hello{
    public static void main(String[] args){
       Scanner scanner = new Scanner(System.in);
       System.out.print("enter a n number: ");
       long n = scanner.nextLong();
       System.out.print("enter a m number: ");
       long m = scanner.nextLong();
       System.out.print("enter a l number: ");
       long l = scanner.nextLong();
       if(n > m && n > l){
        System.out.println("n is greater number "  + n );
       } else if ( m > n && m > l) {
        System.out.println("m is greater number " + m);
       } else if( l > m && l > n) {
        System.out.println("l is greater number " + l);
       }
    }
}


       
        
   