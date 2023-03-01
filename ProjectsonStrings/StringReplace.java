// String Replacer: Create an application that takes a string and a word as input and replaces all occurrences of the word with another word. Use strings to manipulate the input string.
import java.util.*;
class StringReplace
  {
    public static void main(String args[])
    {
      Scanner s = new Scanner(System.in);
      System.out.println("Enter the string:");
      String str=new String();
      str = s.nextLine();
      String v = replaceString(str);
      System.out.println("replaced string:"+v);
    }
    static String repalceString(String str)
    {
     Scanner p = new Scanner(System.in);
      System.out.println("Enter the word1:");
      String word1=new String();
      word1=p.next();
      System.out.println("enter the word2");
      String word2=new String();
      word2 = p.next();
      for(int i=0;i<str.length;i++)
        {
          if(str.charAt(i)!=" ")
          {
            if(str.charAt(i)==word1)
            {
              String N=str.replace(word1,word2);
            }
            else
            {
              System.out.println(word1+"there is nothing in given string");
            }
          }
        }
      System.out.println(N);
      
    }
  }