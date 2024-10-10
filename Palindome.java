public class Palindome {
    public static void main(String args[]){
        String name="ABCDCBA";
       
        String name2="";
       
        for(int i=name.length()-1;i>=0;i--){
            name2=name2+name.charAt(i);
      
        }
        if(name.compareTo(name2)==0){
            System.out.println("It is a palindrome.");
        }else{
            System.out.println("It is not a palindrome");
        }
    }
}
