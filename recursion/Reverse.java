package recursion;

public class Reverse {
    public static void printReverse(int i,String s ){
        if(i==-1){
            return ;
        }
        System.out.print(s.substring(i,i+1)+" ");
        printReverse(i-1, s);
    }
    public static void main(String args[]){
        printReverse(4,"Hello");
    }
}
