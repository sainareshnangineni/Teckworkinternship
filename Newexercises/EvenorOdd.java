import java.util.*;
class EvenorOdd
  {
    public static void main(String args[])
    {
      int Number;
      Scanner s=new Scanner(System.in);
      System.out.println("Enter the Number :");
      Number = s.nextInt();
      if(Number%2==0)
     System.out.print("Even Number\n");
      else
    System.out.print("odd number\n");
      
    }
  }