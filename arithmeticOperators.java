import java.util.*;
public class arithmeticOperators {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a:");
        int a=sc.nextInt();
        System.out.println("Enter b:");
        int b=sc.nextInt();
        sc.close();
        int add=a+b;
        int sub=a-b;
        int product=a*b;
        int division=a/b;
        int modulo=a%b;
        System.out.println("The sum of a and b is:"+add);
        System.out.println("The difference of a and b is:"+sub);
        System.out.println("The product of a and b is:"+product);
        System.out.println("The quotient of a and b is:"+division);
        System.out.println("The remainder of a and b is:"+modulo);
    }

}
