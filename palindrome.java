import java.util.*;
public class Palindrome{
   public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      Palindrome p = new Palindrome();
      System.out.println("Enter element : ");
      String str = sc.nextLine();
      if(p.isPalindrome(str)==1){
         System.out.println("Paindrome");
      }
      else
         System.out.println("not a palindrome");
   }
   
   public int isPalindrome(String str){
      char[] ch = str.toCharArray();
      String rev = "";
      for(int i=ch.length-1;i>=0;i--){
          rev = rev + ch[i];
      }
      if(str.equals(rev))
         return 1;
      else
         return 0;
   }

}
