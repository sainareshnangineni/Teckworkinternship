import java.util.*;
class CheckMobileNo
  {
     public static void main(String args[])
    {
    Scanner s = new Scanner(System.in);
    System.out.println("Enter the mobile no:");
    String str = new String();
      str = s.nextLine();
     String d = Mobileno(str);
      System.out.println(d);
      
    }
    static String Mobileno(String str)
    {
      int count=0;
      for(int i=0;i<str.length()-1;i++)
        {
          if(str.charAt(i)>='0' && str.charAt(i)<='9')
          {
            count++;
          }
        }
      if(count==10)
      {
        System.out.println("it is a valid number");
      }
      else{
        System.out.println("It is not a valid number");
      }
      return str;
    }
  }
      
  
     