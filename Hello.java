//import java.util.Scanner;
//import java.util.HashMap;
 public class Hello{
        private static void Selectionsort(int [] arr){
                for(int i = 0; i <arr.length-1;i++){
                        int min = i;
                        for(int j = i+1; j < arr.length;j++){
                                if(arr[min]>arr[j]){
                                        min = j;
                                }
                        }
                        int temp = arr[i];
                        arr[i]=arr[min];
                        arr[min]=temp;
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


        


   




       
        




       
        
   