import java.util.*;
public class TwoDArray {
    public static void main(String args[]){
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter the no of rows :");
       int rows=sc.nextInt();
       System.out.println("Enter the no of cols :");
       int cols=sc.nextInt();
      
       int[][] numbers=new int[rows][cols];
       //input
       //rows
       for(int i=0;i<rows;i++){
        //cols
        for(int j=0;j<cols;j++){
            numbers[i][j]=sc.nextInt();
        }
       }
       System.out.println("Enter the element to be searched:");
       int x=sc.nextInt();
       //output
       for(int i=0;i<rows;i++){
        for(int j=0;j<cols;j++){
            if(numbers[i][j]==x)
            System.out.println("Element found at index:"+i+ "," + j);
        }
       
        sc.close();
       }
    }
}
