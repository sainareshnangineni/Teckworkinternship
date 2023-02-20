import java.util.*;
class VowelorConsonent
  {
    public static void main(String args[])
    {
      int a = 0;
      Scanner s =new Scanner(System.in);
      System.out.println("Enter a charecter:");
      char ch = s.next().charAt(0);
      if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')
      {
        System.out.println("enter charecter "+ch+" is Vowel");
      }
        else if((ch>='a'||ch<='z')||(ch>='A'||ch<='Z'))
     
        System.out.println("Enter charecter "+ch+" is Consonent");
     
        else
     
        System.out.println("Not an alphabet");
    }
    }
