public class PushToLast {
    
    public static void printNew(String s,int index,int counter,char c,String newString){
        if(index==s.length()){/*-1 kroge to >lagao otherwise  it will not print till the last index
                               else -1 nhi lagana hai tab  == rehne do */

            for(int i=0;i<counter;i++){
                newString+=c;
            }
            System.out.println(newString);
            return;
        }
       // String new="";
        if(s.charAt(index)==c){
            counter++;
        }else{
            newString=newString+s.charAt(index);
        }
        printNew(s,index+1,counter,c,newString);
    }
    public static void main(String args[]){
        printNew("abasaaca",0,0,'a',"");
    }

    
}
