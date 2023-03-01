import java.util.*;
class StringLength
{
  public static void main(String h[])
  {
    Scanner S = new Scanner(System.in);
    System.out.println("Enter the String:");
    String str = new String();
    str = S.nextLine();
    int length = str.length();
    System.out.println("the length of the string is  "+  length);
  }
}