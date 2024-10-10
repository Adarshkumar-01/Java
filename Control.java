import java.util.*;
public class Control {
    public static void main(String args[]){

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a:");
        int a=sc.nextInt();
        System.out.println("Enter b:");
        int b=sc.nextInt();
        sc.close();
        if(a>b){
            System.out.println( a + " is greater than"+ b);
        }else if(b>a){
            System.out.println(b +" is greater than "+ a);
        }else{
            System.out.println("both "+a + "and" +b +"are equal");
        }
    }
    
}
