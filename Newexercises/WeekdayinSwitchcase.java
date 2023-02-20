import java.util.*;
class WeekdayinSwitchcase
  {
    public static void mai(String[] args)
    {
      int day;
      Scanner s=new Scanner(System.in);
      day = s.nextInt();
    switch(day)
      {
        case 0:
        System.out.println("sunday");
          break;
        case 1:
         System.out.println("monday");
          break;
        case 2:
        System.out.println("tuesday");
          break;
        case 3:
      System.out.println("Wednesday");
          break;
        case 4:
        System.out.println("thursday");
          break;
        case 5:
          System.out.println("Friday");
          break;
        case 6:
       System.out.println("saturday");
          break;
        default:
        System.out.println("invalid");
          break;
      }
      }
   }
  