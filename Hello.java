
public class Hello{

       static long Addition(long N){
        long Add = 0; 
        for(int i = 0 ; i <= N ; i++){
            Add = Add + i;
        }
        return Add;
    }
    public static void main(String[] args){
        long result = Addition(10);
        System.out.println("the added number is " + result);
    }        
}



       
        
   