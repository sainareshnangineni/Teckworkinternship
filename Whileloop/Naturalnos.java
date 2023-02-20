import java.util.Scanner;
class Naturalnos
  {
    public static void main(String args[])
    {
     int i=1;
      Scanner s=new Scanner(System.in);
      System.out.println("Enter the n value:");
      int n=s.nextInt();
      System.out.println("Numbers are:");
      while(i<=n)
        {
          System.out.println(i);
         i++;
        }
    
    }
  }