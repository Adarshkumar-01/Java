import java.util.*;

public class no_entry_user {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int count=0;
        int sum=0;
        int input;
        do{
            System.out.println("Enter the no to be added in list:");

            int num=sc.nextInt();
            sum=sum+num;
            count++;
            System.out.println("Do you want to continue?? yes(1),no(0)");
            input=sc.nextInt();
          

        }while(input==1);
        sc.close();
        System.out.println("The no of inputs given are:"+count);
        System.out.println("The sum of inputs given is:"+sum);
    }
    
}
