import java.util.*;
public class Weekday
  {
    public static void main(String[] k)
    {
      
      Scanner s = new Scanner(System.in);
      System.out.println("Enter the Weekno: ");
      int  weekno = s.nextInt();
      if(weekno>=1 && weekno<=7)
      {
        if(weekno==1)
        {
          System.out.println("monday");
        }
        else if(weekno==2)
        {
        System.out.println("tuesday");
        }
        else if(weekno==3)
        {
        System.out.println("wednsday");
        }
        else if(weekno==4)
        {
        System.out.println("thursday");
        }
        else if(weekno==5)
        {
          System.out.println("friday");
        }
        else if(weekno==6)
        {
      System.out.println("sauterday");
        }
        else if(weekno==7)
        {
          System.out.println("sunday");
        }
        else 
        {
         System.out.println("nothing");
        }
      }
    }
  }