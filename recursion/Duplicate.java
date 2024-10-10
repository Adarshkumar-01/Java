package recursion;

public class Duplicate {
    public static boolean map[]=new boolean[26];
    public static String removeDuplicates(String s,int index,String newString){
        if(index==s.length()){
            return newString;
        }
        char currChar=s.charAt(index);
        if(!Character.isLetter(currChar)){//skip non-letter characters
           return removeDuplicates(s,index+1,newString);
            
        }
        int mapIndex;
        if(currChar>='a'&&currChar<='z'){
            mapIndex=currChar-'a';
        }else{//UPPER CASE
            mapIndex=currChar -'A';
        }
        if(map[mapIndex]){
           return removeDuplicates(s,index+1,newString);
        }else{
            newString+=currChar;
            map[mapIndex]=true;
           return removeDuplicates(s,index+1,newString);
        }
     
    }
    public static void main(String args[]){
        String str="a#@aa";
        String res=removeDuplicates(str,0,"");
        System.out.println(res);
    }
    
}
