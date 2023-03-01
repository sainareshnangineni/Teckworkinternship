//Write a Java program to compare two strings lexicographically
import java.util.Scanner;
class Lexicographcally
  {
    public static void main(String k[])
    {
      Scanner d=new Scanner(System.in);
      System.out.println("Enter the String s1:");
      String s1=new String();
      s1=d.nextLine();
      System.out.println("Enter the String s2:");
      String s2=new String();
      s2=d.nextLine();
      int b=s1.compareTo(s2);
      System.out.println(b);
      if(b<0)
      {
        System.out.println("s1 is grater than s2");
      }
      else if(b==0)
      {
         System.out.println("s1 is equalto s2");
      }
      else 
      {
        System.out.println("s1 is Less than to s2");
      }
        
    }
  }