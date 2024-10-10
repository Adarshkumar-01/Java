package recursion;

public class Subsequences {
    public static void printSubsequences(String str,int index,String newString){
        if(index==str.length()){
            System.out.println(newString);
            return;
        }
        char currChar=str.charAt(index);
        //to be present in String
        printSubsequences(str,index+1,newString+currChar);
        //to not be present
        printSubsequences(str, index+1, newString);
    }
    public static void main(String args[]){
        printSubsequences("ab",0,"");
    }
}
