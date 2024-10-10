import java.util.*;
public class search {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no of elements:");
        int size=sc.nextInt();
        int arr[]=new int[size];
        //input
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter the elt to be searched");
        int x=sc.nextInt();
        sc.close();

        //output
        for(int i=0;i<size;i++){
            if(arr[i]==x){
                System.out.println("Element "+x+" found at index:"+i);
                break;
            }  
            
                //System.out.println("Enter valid element to be searched");
            
        
       //
    }
    }
    
}
