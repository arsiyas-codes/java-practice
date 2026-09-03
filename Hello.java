import java.util.Scanner;

public class Hello{
     public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("enter an number: ");
        int n = scanner.nextInt();
        int sum = 0;
        for(int i = 1 ; i <= n-1; i++){
                if (n % i == 0){
                        System.out.println("the number divisible by: " + i);
                        sum = sum + i;
                }
        }
        System.out.println("the sum : "+ sum);
        if(sum == n){
                System.out.println(n + " perfect number ");
        }else{
                System.out.println(n + " not perfect number ");
        }
        
                scanner.close();

}
}   


//git add Hello.java .
//git commit -m " program"
//git push


        


   




       
        




       
        
   