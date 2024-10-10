package recursion;

public class Fibonacci {
    public static void calcFib(int x,int y,int n){
        if(n==0){
            return;
        }
        int z=x+y;
        System.out.print(z+" ");
        calcFib(y,z,n-1);

    }
    public static void main(String args[]){
        int a=0;
        int b=1;
        System.out.print(a+" ");
        System.out.print(b+" ");
        int n=10;
        calcFib(a, b, n-2);//kyonki 2 already  print hio chuka hai.
    }
    
}
