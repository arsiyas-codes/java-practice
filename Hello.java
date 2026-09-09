//import java.util.Scanner;
//import java.util.Arrays;
public class Hello{
        static String removeDuplicate(String str){
                String result = "";
                for(int i = 0;i <str.length();i++){
                        char ch = str.charAt(i);
                               if(!result.contains(String.valueOf(ch))){
                                        result = result + ch;
                }//else{
                     //   return "false";
                } 
                return result;
 }               
     public static void main(String[] args){
        String str = "Programming";
        String result1 = removeDuplicate(str);
        System.out.println(result1);
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


        


   




       
        




       
        
   