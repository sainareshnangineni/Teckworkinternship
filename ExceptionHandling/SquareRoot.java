import java.util.*;
class SquareRoot
  {
    public static void main(String args[])
    {
      Scanner s = new Scanner(System.in);
      System.out.println("enter the no:");
      int a = s.nextInt();
     
      try{
         for(int i=0;i>a;i++)
        {
          System.out.println("i value is:"+i);
        }
        System.out.println(Math.sqrt(a));
      }
      catch(Exception d)
        {
          System.out.println(d);
          System.out.println("the code will execute successfully");
        }
    }
  }