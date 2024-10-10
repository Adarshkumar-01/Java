public class pattern14_2 {
    public static void main(String args[]){
        int n=5;
        //UPPER HALF
        for(int i=1;i<=n;i++){
            //spaces
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            //stars on left
           for(int j=1;j<=2*i-1;j++){
               System.out.print("*");
           }
            //stars on right 
          // for(int j=1;j<=i;j++){
          //  System.out.print("*");
          // }
            System.out.println();
        }
        //LOWER HALF
        for(int i=n-1;i>=1;i--){
            //spaces
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            //stars on left
            for(int j=1;j<=2*i-1;j++){
                System.out.print("*");
            }
            //stars on right 
           //for(int j=2;j<=i;j++){
              //System.out.print("*");
           // }
            System.out.println();
        }
    }
    
}
