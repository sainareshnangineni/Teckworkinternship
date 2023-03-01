import java.util.*;
class Capitalize
  {
    public static void main(String g[])
    {
      Scanner s = new Scanner(System.in);
      String str = new String();
      System.out.println("Enter the string:");
      str = s.nextLine();
      String f = str.toUpperCase();
      System.out.println("Capitalization of string is:"+ f);
    }
  }