//import java.util.Scanner;

public class Hello{
        static int findLargest(int[]arr){
                int largest =arr[0];
                for(int i = 0; i <arr.length;i++){
                        if(arr[i]>largest){
                                largest = arr[i];
                        }
                } 
                 return largest; 
        }
                
     public static void main(String[] args){
        int[]lar = {3,10,5,9,8};
        int result = findLargest(lar);
        System.out.println(result);
}
}     
        //System.out.println("the positive numbers are : " + result);
                

        //Scanner scanner = new Scanner(System.in);
        //System.out.print("enter an number: ");
        //int n = scanner.nextInt();
        
        
        
                //scanner.close();
   

//git add Hello.java .
//git commit -m " program"
//git push


        


   




       
        




       
        
   