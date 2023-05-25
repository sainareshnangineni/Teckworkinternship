import java.util.*;
class StringLength
  {
    public static void main(String args[])
    {
      Scanner s=new Scanner(System.in);
      System.out.println("Enter the String:");
      String str=new String();
      str=s.nextLine();
      int length=str.length();
      System.out.println("the length of the string is:"+length);
    }
  }