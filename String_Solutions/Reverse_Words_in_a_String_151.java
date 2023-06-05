package String_Solutions;

public class Reverse_Words_in_a_String_151 { 
    public static void main(String[] args) {
    
    //System.out.println(reverseWords("  the sky   is blue   "));
    System.out.println(reverseWords("   the   sky is   blue"));

 }
 public static String reverseWords(String s) {

     String ans = "";
     String str = s.trim();
     int size = str.length()-1; 
     int start = -1;
     int end = size;

     if(str.length()<=1)
     {
         return str;
     }

     for(int i =size-1 ; i>= 0 ;i--)
     {
         if(str.charAt(i) != ' ' && str.charAt(i+1) == ' '){

             end = i;
         }
         if(str.charAt(i) == ' ' && str.charAt(i+1) != ' ')
         {
             start = i+1;
             ans = ans+str.substring(start, end+1)+" ";
             start = -1;
         }
         if(i == 0){
             start = i;
             ans = ans+str.substring(start,end+1);
             start = -1;
         }
     }
     return ans;   
 }

       
}
