import java.util.*;
class Lexicografically
  {
    public static void main(String args[])
    {
      Scanner s=new Scanne(System.in);
     System.out.println("Enter the Str1:");
      String str1=new String();
      str1=s.nextLine();
      System.out.println("Enter the str2:");
      str2=s.nextLine();
      int result=str1.compareTo(str2);
      if(result<0)
      {
        System.out.println("Str1 comes before str2");
      }
      else if(result>0)
      {
        System.out.println("str2 comes before str1");
      }
      else
      {
        System.out.println("str1 and str2 are equal");
      }
    }
  }