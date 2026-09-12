//import java.util.Scanner;
//import java.util.HashMap;
public class Hello{
        static void Frequency(String str){
                //HashMap<Character,Integer>map=new HashMap<>();
                for(int i = 0;i <str.length();i++){
                        char ch = str.charAt(i);
                               if(str.indexOf(ch)!=i){
                                continue;
                }
                int count = 0;
                for(int j = 0; j < str.length();j++){
                        if(str.charAt(j) == ch){
                                count++;
                        }
                }
                System.out.println(ch + "= " + count);
        } 
}
     public static void main(String[] args){
        String str = "Programming";
        Frequency(str);
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


        


   




       
        




       
        
   