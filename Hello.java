//import java.util.Scanner;

public class Hello{
        static int countWord(String sentence,String word ){
                int count =0;
                String[]words = sentence.split(" ");
                for(int i = 0 ; i<words.length; i++){
                        if(words[i].equals(word)){
                                count++;
                        }
                } 
                 return count; 
        }
                
     public static void main(String[] args){
        String sentence = " the cat sat on the mat";
        int result =countWord(sentence,"the");
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


        


   




       
        




       
        
   