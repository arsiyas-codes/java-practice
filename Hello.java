//import java.util.Scanner;

public class Hello{
        static  String Builderreverse(String str){
                //String vowel = "AEIOUaeiou";
                String reverse = "";
                for(int i = 0 ; i<str.length(); i++){
                        char ch = str.charAt(str.length()-1-i);
                        reverse=reverse+ch;
                        //char ch = str.charAt(i);
                        //System.out.println(str.charAt(str.length()-1));

                                //reverse++;      
                                //return reverse; 
                } 
                return reverse;
        }
                //return reverse; 
     public static void main(String[] args){
        String word = "arsiya";
        String result =Builderreverse(word);
        System.out.println(result);
     
        //System.out.println("the positive numbers are : " + result);
                

        //Scanner scanner = new Scanner(System.in);
        //System.out.print("enter an number: ");
        //int n = scanner.nextInt();
        
        
        
                //scanner.close();

}
}   


//git add Hello.java .
//git commit -m " program"
//git push


        


   




       
        




       
        
   