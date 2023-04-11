import java.util.*;
class Main
  {
    public static void main(String args[])
    {
      char studentgrade;
      double avg;
      void read()
        {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter grade");
        try
          {
            grade=sc.next.charAt(0);
          }
        catch(Exception e)
          {
            System.out.println("enter studentdata:");
            read();
          //student grade input exception
        System.out.println("enter avg");
        try
          {
            avg=sc.nextDouble();
          }
        catch(Exception e1)
          {
            System.out.println("enter correcet data ");
            read();
          }
        }
      System.out.println(grade+" "+avg);
        //average input Exception
    }
  }