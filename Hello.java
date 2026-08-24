import java.util.Scanner;

public class Hello{
     public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("enter a 3 number: ");
        int n = scanner.nextInt();
        String string = String.valueOf(n);
        if(string.charAt(0) == string.charAt(2)){
            System.out.println(" palindrome");
        }else{
            System.out.println("not palindrome");
        }
        scanner.close();
    }

    }

   




       
        




       
        
   