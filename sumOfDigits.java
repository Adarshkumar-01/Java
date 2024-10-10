import java.util.*;
public class sumOfDigits {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String  str=sc.next();
        sc.close();
        int sum=0;
        for(int i=0;i<str.length();i++){
            int  digit=Integer.parseInt(str.charAt(i)+"");

             sum=sum+digit;
        }
        System.out.println(sum);
    }
    
}
