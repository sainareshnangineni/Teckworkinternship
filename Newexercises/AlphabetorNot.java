import java.util.*;
class AlphabetorNot
  {
    public static void main(String[] v)
    {
      char ch;
      Scanner s=new Scanner(System.in);
      System.out.println("Enter the charecter:");
      ch = s.next().charAt(0);
      if((ch>='A'&& ch<='Z')||(ch>'a' && ch<'z'))
      {
        System.out.println(ch+"is an alphabet");
      
      }else{
        System.out.println(ch +"is not a alphabet");
      }
    }
  }