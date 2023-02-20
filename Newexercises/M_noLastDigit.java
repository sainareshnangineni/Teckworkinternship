import java.util.*;
class M_noLastDigit
  {
    public static void main(String args[])
    {
      int a;
      Scanner s= new Scanner(System.in);
      System.out.println("Enter the mobile no:");
      a =s.nextInt();
      if((a+"").length()==10||(a+"").length()==12)
      System.out.println("last 4 digits:"+a%10000);
      else
      System.out.println("not a valid no:");
    }
  }