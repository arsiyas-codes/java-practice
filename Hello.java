import java.util.Scanner;

public class Hello{
     public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("enter numbers: ");
        int n = scanner.nextInt();
        System.out.print("enter a digit to be checked: ");
        char digit = scanner.next().charAt(0);
        String string = String.valueOf(n);
        int count = 0;
        for(int i = 0; i < string.length();i++){
            if(string.charAt(i) == digit){
                count++;
            }
        }   
        System.out.println("the frequint number occurs " + count + " times");
        scanner.close();
    }

    }

   




       
        




       
        
   