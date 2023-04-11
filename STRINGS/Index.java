//Write a Java program to get the character at the given index within the String
import java.util.*;
class Index
  {
    public static void main(String args[])
    {
      Scanner s = new Scanner(System.in);
      System.out.println("Enter the string:");
      String s1=new String();
      s1=s.nextLine();
      System.out.println("Enter the index value:");
   
      int i=s.nextInt();
      System.out.println(s1.charAt(i));
    }
  }