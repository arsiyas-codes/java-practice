//import java.util.Scanner;
//import java.util.HashMap;
public class Hello{
        static void Search(int [] arr){
                //HashMap<Character,Integer>map=new HashMap<>();
                int count = 0;
                int n = 1;
                System.out.print("indices: ");
                for(int i = 0;i<arr.length;i++){
                                if(arr[i]==n){
                                        count++;
                                        System.out.print(i+" ");
                                }
                }
                System.out.println();
                System.out.println(n+" occurs "+count);
        } 
     public static void main(String[] args){
      int[]rev = {1,1,2,2,3,4,5};
        Search(rev);
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


        


   




       
        




       
        
   