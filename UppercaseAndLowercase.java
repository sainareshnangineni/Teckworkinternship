import java.util.*;
class UppercaseAndLowercase
  {
    public static void main(String args[])
    {
      Scanner s=new Scanner(System.in);
      String str=new String();
      str=s.nextInt();
      int uppercase=0;
      int lowercase=0;
      for(int i=0;i<str.length;i++)
        {
          char ch=str.charAt(i);
          if(str.isUpperCase(ch))
          {
            uppercase++;
          }
          else if(str.isLowerCase(ch))
          {
            lowercase++;
            
          }
        }
      System.out.println("uppercase letters are:"+uppercase);
      System.out.println("lowercase letters are:"+lowercase);
    }
  }