public class pattern10 {
    public static void main(String args[]){
        int n=8;   //if n=4,then i<=n&(2n-2i)
        //UPPER HALF
        for(int i=1;i<=n/2;i++){
            //LEFT SIDE STARS
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }//SPACES
            for(int k=1;k<=(n-2*i);k++){
                    System.out.print(" ");
             }
             //RIGHT SIDE STARS
             for(int j=1;j<=i;j++){
                System.out.print("*");
             }
            System.out.println();
        }
        //LOWER HALF
        for(int i=4;i>=1;i--){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }for(int k=1;k<=(n-2*i);k++){
                    System.out.print(" ");
             }
             for(int j=1;j<=i;j++){
                System.out.print("*");
             }
            System.out.println();
        }
    }
    
}
