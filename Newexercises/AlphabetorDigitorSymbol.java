import java.util.*;
class AlphabetorDigitorSymbol
  {
    public static void main(String[] l)
    {
      char ch;
      Scanner s = new Scanner(System.in);
      System.out.println("Enter the char:");
      ch =s.next().charAt(0);
       if((ch>='a'&&ch<='z')||(ch>='A'&&ch<='Z'))
       {
         System.out.println(ch+"is alphabet");
      }
      else if(ch>='0'&& ch<='9')
      {
        System.out.println(ch+ "is Digit");
      
      }else 
      {
        System.out.println(ch+"is Special symbol");
      }
      }
   }
  