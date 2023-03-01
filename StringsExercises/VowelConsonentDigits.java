import java.util.*;
class VowelConsonentDigits
{
  public static  void main(String h[])
  {
  Scanner s = new Scanner(System.in);
    System.out.println("Enter the String");
    String str = new String();
    str = s.nextLine();
    int vowels=0,consonents=0;digits=0;spaces=0,symbols=0;
    str=str.toLowerCase();
    for(int i=0;i<str.length;i++)
      {
        char ch = str.charAt(i);
        if(ch==‘a’ || ch==‘e’ || ch==‘i’|| ch==‘o’ || ch==‘u’) 
        {
          ++vowels;
        }
        else if((ch >=‘a’&& ch <=‘z’))
        {
          ++consonents;
        }
      
    else if(ch>='0' && ch<='9')
    {
      ++digits;
    }
    else if(ch==' ')
    {
      ++spaces;
    }
    else 
      ++symbols;
    
  }
  System.out.println("vowels: "+vowels);
   System.out.println("consonents:"+consonents);
   System.out.println("digits:"+digits);
   System.out.println("spaces:"+spaces);
  System.out.println("Symbols:"+Symbols);
}
}