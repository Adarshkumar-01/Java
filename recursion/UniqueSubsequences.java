package recursion;
import java.util.HashSet;

public class UniqueSubsequences {
    public static void printSubsequences(String str,int index,String newString, HashSet<String>set){
        if(index==str.length()){
            if(set.contains(newString)){
                return;
            }else{
                System.out.println(newString);
                set.add(newString);
                return;         
            }
        }
            char currChar=str.charAt(index);
        //to be present
        printSubsequences(str, index+1, newString+currChar, set);
        //to not be present
        printSubsequences( str,index+1,newString,set);
    
    }
    public static void main(String args[]){
        String str="aaa";
        HashSet<String> set=new HashSet<String>();
        set.add("");
        printSubsequences(str,0,"",set);
    }
}
