//import java.util.Scanner;

public class Hello{
        static int countVowels(String str){
                String vowel = "AEIOUaeiou";
                int count = 0;
                for(int i = 0 ; i<str.length(); i++){
                        char ch = str.charAt(i);
                        if(vowel.contains(String.valueOf(ch))){
                                count++;
                        }
                }
                return count; 
        }
     public static void main(String[] args){
        String word = "arsiya";
        int result =countVowels(word);
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


        


   




       
        




       
        
   