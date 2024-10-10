package recursion;

public class Power {
    public static int printPower(int x,int n){
        if(x==0){
            return 0;
        }
        if(n==0){
            return 1;
        }
       // pro=pro*x;
        return x* printPower(x,n-1);
    }
    public static void main(String args[]){
             int x=2,n=3;
             int res=printPower(x,n);
             System.out.println(res);
    }
    
}
