package recursion;

public class FirstandLast2 {
    public static  int first=-1;
    public static int last=-1;
    public static void findOccurance(String s,int index,char element){
        if(index==s.length()){
            System.out.println(first);
            System.out.println(last);
            return;
        }
        if(s.charAt(index)==element){
            if(first==-1){
                first=index;
                last=first;//if there is only 1 time occurance of that element
           }else{
            last=index;
           }
        }
        findOccurance(s,index+1,element);
    }
    public static void main(String args[]){
        String str="abaabaaab";
        findOccurance(str,0,'a');
    }


    
}
