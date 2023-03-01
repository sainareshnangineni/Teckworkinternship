//Write a Java program to convert all the characters in a string to uppercase
import java.util.*;
class StringUppercase
  {
    public static void main(String args[])
    {
      Scanner g= new Scanner(System.in);
      System.out.println("Enter the string charecters:");
      String d=new String();
      d = g.nextLine();
      
      String s =d.toUpperCase();
      System.out.println(s+" ");
      
      
    }
  }