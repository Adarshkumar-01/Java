package recursion;

public class FirstandLast {
    public static void first(int idx,String str,char c){
        if(idx==str.length()){
            return;
        }
        if(str.charAt(idx)==c){
            System.out.println("Character "+c+" first appeared at position"+(idx+1));
            return;
            
        }
        first(idx+1,str,c);
    }
    public static void last(int index,String str,char c){
        if(index==-1){
            return;
        }
        if(str.charAt(index)==c){
            System.out.println("Character "+c+" last appeared at position"+(index+1));
            /*agar(index+1) nhi karte hen wo concatenation ho jata and output would have said
             "character a found at position 101"as index=10 and 10+1 means conatenation of these.*/
           return;
        }
        last(index-1,str,c);
    }
    public static void main(String args[]){
        String str="bab";
        first(0,str,'a');
        last(str.length()-1,str,'a');

    }
}
