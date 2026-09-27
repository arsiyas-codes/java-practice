//import java.util.Scanner;
//import java.util.HashMap;
 public class Hello{
        private static void Selectionsort(int [] arr){
                for(int i = 0; i <arr.length-1;i++){
                        for(int j = 0; j < arr.length-i-1;j++){
                                if(arr[j]>arr[j+1]){
                                int temp = arr[j];
                                arr[j]=arr[j+1];
                                arr[j+1]=temp;
                                }
                        }
                }
        }
public static void main(String[] args){
      int arr[] = {5,2,9,1,5,6};
      Selectionsort(arr);
      for(int i : arr){
        System.out.println(i);
      }
}        
}
 //HashMap<Character,Integer>map=new HashMap<>();

// System.out.println();
    // public static void main(String[] args){
      //int[]rev = {1,1,2,2,3,4,5};
        //Search(rev);
       
        //Scanner scanner = new Scanner(System.in);
        //System.out.print("enter an number: ");
        //int n = scanner.nextInt();
                //scanner.close();
   

//git add Hello.java .
//git commit -m " program"
//git push


        


   




       
        




       
        
   