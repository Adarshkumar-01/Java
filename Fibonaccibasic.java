public class Fibonaccibasic {
    public static void printNum(int n){
        int sum[]=new int[n];
        sum[0]=0;
        sum[1]=1;
        System.out.print(sum[0]+" ");
        System.out.print(sum[1]+" ");
        for(int i=2;i<n;i++){
           sum[i]=sum[i-1]+sum[i-2];
            
            System.out.print(sum[i]+" ");
        }
        
    }
    public static void main(String args[]){
        printNum(10);
    }
    
}
