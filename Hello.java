//import java.util.Scanner;

public class Hello{
     public static void main(String[] args){
        //Scanner scanner = new Scanner(System.in);
     int[]numbers = {2,5,7,8};
     int largest = Integer.MIN_VALUE;
     for(int i = 0 ; i < numbers.length; i++){
        if(numbers[i]>largest){
                largest = numbers[i];
        }
     } 
     System.out.println("Largest = " + largest);

     int secondLargest = Integer.MIN_VALUE;
     for(int i = 0 ; i < numbers.length; i++){
        if(numbers[i]!=largest &&  numbers[i] > secondLargest){
                secondLargest=numbers[i];
        }
     } 
     System.out.println("second Largest = " + secondLargest);




}
}   


//git add Hello.java .
//git commit -m " program"
//git push


        


   




       
        




       
        
   