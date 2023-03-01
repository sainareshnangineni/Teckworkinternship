//Text Analyzer: Create an application that takes a text as input and performs different analysis like counting the number of characters, words, and lines, or finding the most common word
import java.util.Scanner;
class TextAnalyzer
  {
  public static void main(String args[])
    {
     System.out.println("Enter the string as an input:");
     Scanner s = new Scanner(System.in);
      String str = new String();
      str=s.nextLine();
     String S1= countnos(str);
      System.out.println("Enter the Countno of charecters: " + S1);
      String S2 = words(str);
      System.out.println("Enter the count of words in a String:" + S2);
      String S3 = commonword(str);
      System.out.println("Enter the count of common word in a string:" + S3);
    }
    static String countnos(String g)
    {
      for(int i=0;i<g.length;i++)
        {
          int count=0;
          if(str1.charAt(i)==' ')
            count++;
        }
      System.out.println("No of charecter count is:" + count);
    }
    static String words(String k)
    {
       int words=0;
       String arr[]=k.split(" ");
      for(int j=0;j<arr.length;j++)
        {
          words+=1;
        }
      System.out.println("no of count words is: "+words);
    }
    static String commonword(String b)
    {
      int commonword=0;
      for(int i=0;i<b.length()-1;i++)
        {
          if((b.charAt(i)==' ') && (b.charAt(i+1)!=' '))
          {
            commonword++;
          }
          System.out.println("no of commonword count in a string is:" + commonword);
        }
      
    }
  }