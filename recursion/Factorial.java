package recursion;

public class Factorial {
   public static int printNum(int n){
    if(n==0){
        return 1;
    }
    //int fact=1;
    return n*printNum(n-1);
   }
    public static void main(String args[]){
        int res= printNum(5);
       System.out.println(res);
    }
    
}
