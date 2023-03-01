//Write a Java program to get the index of a pattern in the given string
import java.util.Scanner;
class StingPatern
  {
    public static void main(String p[])
    {
      Scanner s = new Scanner(System.in);
      System.out.println("Enter the string:");
      String s1=new String();
      s1 = s.nextLine();
      int index = s1.indexOf(" ",10);
      System.out.println(index);
    }

  }