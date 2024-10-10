package recursion;

public class PowerLogn {
    public static int calcPower(int x,int n){
        if(n==0){
            return 1;
        }
        if(x==0){
            return 0;
        }
        //if n is even
        if(n%2==0){
            return calcPower(x, n/2)*calcPower(x, n/2);
        }else{                               //if n is odd
          return calcPower(x, n/2)*calcPower(x, n/2)*x;
        
        }
    }
    public static void main(String args[]){
        int x=2;
        int n=3;
        int res=calcPower(x,n);
        System.out.println(res);

    }
}
