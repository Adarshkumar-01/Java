package java_class;
import java.util.*;
public class Switch {
    public static void main(String args[]){
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter a:");
     int a=sc.nextInt();
     System.out.println("Enter b:");
     int b=sc.nextInt();
    char op=sc.next().charAt(0);
    sc.close();
    float res=0;
    switch(op){
    case'+':res=a+b;
            break;
    case'-':res=a-b;
            break;
    case'*':res=a*b;
            break;
    case'/':if(b!=0){
        res=a/b;
        break;
    }else{
        System.out.println("Denominator is zero.");
    }
    default:System.out.println("Invalid operator.");
    }
    System.out.println(res);
    }

}