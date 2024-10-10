package recursion;

public class Recursion {
    public static int printNumber(int n){
        if (n==0) {
           return 1;
        }
        System.out.println(n);
        return printNumber(n-1);
    }
    public static void main(String args[]){
       int res= printNumber(5);
       System.out.println(res+"\n");
    }
    
}
