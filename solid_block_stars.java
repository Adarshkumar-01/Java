 import java.util.*;




 public class solid_block_stars{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        
        System.out.println("enter n:");
        int n=sc.nextInt();
        System.out.println("Enter m ");
        int m=sc.nextInt();
        sc.close();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=m;j++){
                System.out.print("*");  
            }
            System.out.println();
        }
    }
 }
    
