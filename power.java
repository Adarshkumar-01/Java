import java.util.*;
public class power {
    public static void Power(int m,int n){
        int res=1;
        for(int i=1;i<=n;i++){
            res=res*m;

        }
        System.out.println(res);
       //3 return;
}
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter base:");
        int m=sc.nextInt();
        System.out.println("Enter exponent:");
        int n=sc.nextInt();
        sc.close();
       // power p=new power();
        Power(m,n);
 }
    
}
