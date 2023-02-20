import java.util.*;
public class Max3nos
  {
  public static void main(String[] args)
    {
    int a,b,c,max,temp;
    Scanner s=new Scanner(System.in);
    System.out.println("Enter the 1st no:");
      a = s.nextInt();
    System.out.println("Enter the 2nd no:");
      b = s.nextInt();
    System.out.println("Enter the 3rd no:");
      c = s.nextInt();
      temp = a>b?a:b;
      max=c>temp?c:temp;
      System.out.println("The maxno is : "+  (max));
    }
  }