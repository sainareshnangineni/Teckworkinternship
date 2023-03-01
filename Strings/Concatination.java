//Write a Java program to concatenate a given string to the end of another string
import java.util.Scanner;
class Concatination
  {
    public static void main(String args[])
    {
      Scanner d=new Scanner(System.in);
      String s1=new String();
      System.out.println("Enter the 1st String:");
      s1=d.nextLine();
      System.out.println("Enter the 2nd  String:");
      String s2=d.nextLine();
      System.out.println(s1.concat(s2));
    }
  }