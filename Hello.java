//import java.util.Scanner;
import java.util.Arrays;

public class Hello{
        static String findSame(String str1, String str2){
                char[]arr1 = str1.toLowerCase().replace(" ","").toCharArray();
                Arrays.sort(arr1);
                char[]arr2 = str2.toLowerCase().replace(" ","").toCharArray();
                Arrays.sort(arr2);
                if(Arrays.equals(arr1,arr2)){
                        return "true";
                }else{
                        return "false";
                } 
        }
                
     public static void main(String[] args){
        String sr = "Listen";
        String sr2 = "vioLEnt";
        String result = findSame(sr,sr2);
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


        


   




       
        




       
        
   