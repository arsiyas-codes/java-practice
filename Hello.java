//import java.util.Scanner;
//import java.util.HashMap;
public class Hello{
        static void Frequencyint(int [] arr){
                //HashMap<Character,Integer>map=new HashMap<>();
                for(int i = 0;i<arr.length;i++){
                        int count = 0;
                        for(int j = 0 ; j<arr.length;j++){
                                if(arr[i]==arr[j]){
                                        count++;
                                }
                        }
                        System.out.println(arr[i]+" -- "+ count);
                }
        } 
     public static void main(String[] args){
      int[]rev = {1,1,2,2,3,4,5};
        Frequencyint(rev);
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


        


   




       
        




       
        
   