import java.util.Scanner;

public class Hello{
     public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("enter your age: ");
        int Age = scanner.nextInt();
        if(Age < 18){
            System.out.println("you're an Minor! ");
        }else if(Age >= 18 && Age <=59){
            System.out.println("you're an Adult!");
        }else if(Age > 60){
            System.out.println("you're an Senior!");
        }
        scanner.close();
            }
}   
       

        


   




       
        




       
        
   