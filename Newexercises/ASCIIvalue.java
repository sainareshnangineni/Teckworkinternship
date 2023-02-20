import java.util.*;
class ASCIIvalue
  {
    public static void main(String args[])
    {
     char s1;
     char s2;
    Scanner s=new Scanner(System.in);
      System.out.println("Enter the s1 charecter:");
      s1 = s.next().charAt(0);
      System.out.println("Enter the s2 charecter:");
      s2 = s.next().charAt(0);
    int asciivalue1=s1;
    int asciivalue2=s2;
      System.out.println("Ascii value of "+s1+" is:"+asciivalue1);
      System.out.println("Ascii value of "+s2+" is:"+asciivalue2);
      
    }
  }