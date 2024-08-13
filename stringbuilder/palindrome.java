import java.util.*;
public class palindrome {
  //tale reverse and check with originsl
    public static void main(String[] args) {
        String str=null;
        System.out.println(isPalindrome(str));
      
    }
    static boolean isPalindrome(String str){
       
        if(str==null||str.length()==0){
            return true;
        }
        str.toLowerCase();
        for(int i=0;i<=str.length()/2;i++){
            char start=str.charAt(i);
            char end=str.charAt(str.length()-1-i);//as we are checking form last and last is also updated
            if(start!=end){
                return false;
            }

        }
        return true;
    }
}
