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
            int largest;
            if(num[0]> num[1] && num[0]> num[2] ){
                largest = num[0];
                System.out.println("largest number: " + largest);
            }if(num[1]> num[0] && num[1]> num[2] ){
                largest = num[1];
                System.out.println("largest number: " + largest);
            }if(num[2]> num[0] && num[2]> num[1] ){
                largest = num[2];
                System.out.println("largest number: " + largest);
            }
             scanner.close();
        }
    }   


        


   




       
        




       
        
   