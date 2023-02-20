import java.util.*;
class AlphabetsAtoZ
  {
    public static void main(String args[])
    {
      Scanner s=new Scanner(System.in);
      System.out.println("Enter the charecters:");
      char a = s.next().charAt(0);
      while(a='A')
        {
          while(a<='Z')
        {
          System.out.println(a+ " ");
          ++a;
        }
        }
    }
  }