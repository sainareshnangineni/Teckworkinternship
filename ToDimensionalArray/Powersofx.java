import java.util.*;
class Powersofx
  { 
    static int sum(int x,int n)
    {
      int i,total=1,multi=x;
      System.out.println("Enter the value:");
      for(i=1;i<n;i++)
        {
          total=total+multi;
          System.out.println(multi);
          System.out.println(" ");
          multi = multi * x;
        }
      System.out.println();
      return total;
    }
      public static void main(String args[])
    {
    Scanner s = new Scanner(System.in);
      System.out.println("Enter the x value:");
      int x = s.nextInt();
      System.out.println("Enter the n value:");
      int n= s.nextInt();
      sum(x,n);
      
    }
  }