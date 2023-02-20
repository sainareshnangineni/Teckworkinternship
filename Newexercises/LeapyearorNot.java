import java.util.*;
public class LeapyearorNot
  {
    public static void main(String[] K)
    {
      int year;
      Scanner s =new Scanner(System.in);
      System.out.println("Enter the Year:");
      year = s.nextInt();
      if(year%4==0 && year%100!=0){
        if(year%400==0){ 
          System.out.println("leap year");
        }
      else{
        System.out.println("not a leapyear");
      }
    }
  }
  }