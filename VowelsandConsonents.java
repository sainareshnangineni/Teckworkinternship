import java.util.*;
class VowelsandConsonents
  {
    public static void main(String args[])
    {
      Scanner s=new Scanner(System.in);
      System.out.println("enter the String");
      String str=new String();
      str=s.nextInt();
      int vowels=0;
      int consonents=0;
      str=str.toLowerCase();
      for(int i=0;i<str.length;i++)
        {
          char ch=str.charAt(i);
          if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
          {
            ++vowels;
          }
          else if((ch>='a'&&ch<='z'))
          {
            ++consonents;
          }
        }
      System.out.println("vowels:"+vowels);
      System.out.println("consonents:"+consonents);
    }
  }