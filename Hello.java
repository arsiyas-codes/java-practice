import java.util.Scanner;

public class Hello{
     public static void main(String[] args){
        int n = 3;
        int[]num =new int [n];
        Scanner scanner = new Scanner(System.in);
        for(int i = 0;i<n;i++){
            System.out.print("enter a number: ");
            num[i] = scanner.nextInt();
        }
            int largest = num[0];
            for(int i = 0 ; i < num.length; i++){
                if(num[i] > largest){
                largest = num[i];
                }
            }
            System.out.println("largest number: " + largest);
             scanner.close();
        }
    }   


        


   




       
        




       
        
   