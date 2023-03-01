//Write a Java program to compare a given string to another string, ignoring case considerations
import java.util.Scanner;
class IgnoreCase
  {
    public static void main(String k[])
    {
      Scanner s = new Scanner(System.in);
      System.out.println("Enter the f string");
      String f=new String();
      f=s.nextLine();
      System.out.println("Enter the v string:");
      String v=new String();
      v=s.nextLine();
      System.out.println(f.equalsIgnoreCase(v));
      
    }
  }