import java.out.*;
class Palindrome
  {
    public static void main(String args[])
    {
      Scanner s = new Scanner(System.in);
      String str = new String();
      str = s.nextLine();
      String s1 []=str.split(" ");
      for(int i=0;i<s1.length();i++)
        {
          boolean x = palindrome(s1[i]);
          s1[i] = palindrome(x);
          System.out.println(s1[i],"palindrome");
          
        }
    }
      static boolean palindrome(String d)
        {
       String k = " ";
        for(int i=s.length()-1;i>0;i--)
        {
         k= k+s.charAt(i);
      if(k==str)
      {
        return true;
      }
      else
      {
        return false;
      }
       }
    
  }
  }