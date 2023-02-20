import java.util.*;
class UppercaseorLowercase
{
public static void main(String[] l)
  {
  int v;
  Scanner s =new Scanner(System.in);
    System.out.println("Enter the s value:");
    v = s.nextInt();
    if(v>='a'&& v<='z')
    
    {
      System.out.println(s +" lower case letters");
    }
    else if(v>='A'&v<='Z')
    {
      System.out.println(s +" Upper case letters");
    }
    else {
      System.out.println("nothing");
    }
   }
}