import java.util.*;
class UpperandLowerCase
  {
    public static void main(String d[])
    {
      Scanner s = new Scanner(System.in);
      String str = new String();
      str = s.nextLine();
      int Uppercase = 0;
      int Lowercase = 0;
      for(int i=0;i<str.length;i++)
        {
          char ch = str.charAt(i);
          if(str.isUpperCase(ch))
          {
            Uppercase++;
          }
          else if(str.isLowerCase(ch))
          {
            Lowercase++;
          }
        }
      System.out.println("Uppercase letters are"+Uppercase);
      System.out.println("lowercase letters are"+lowercase);
    }
  }