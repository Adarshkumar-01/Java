import java.util.*;
public class vote {
    public static int voting(int age){
        if(age>18){
            return 1;
        }
        
            return 2 ;
        
    }
    public static void main(String args[]){
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter the age:");
       int age=sc.nextInt();
       sc.close();
       int result=voting(age);
       if(result==1){
        System.out.println("You are eligible to vote");
       }
       else{
        System.out.println("You are not eligible to vote");
       }
    }
}
    

