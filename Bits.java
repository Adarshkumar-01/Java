
import java.util.*;

public class Bits {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter position:");
      
        int pos=sc.nextInt();
        int n=5;
        System.out.println("Enter operation:");
        int oper=sc.nextInt();
        sc.close();
        int bitMask=1<<pos;
            /*if oper=1 do set
             if oper=0 do clear
             */

        if(oper==1){
            int number=bitMask|n;
            System.out.println(number);
        }else{
            int newBitMask=~(bitMask);
            int number=newBitMask&n;
            System.out.println(number);
        }

    
    }
    
}

