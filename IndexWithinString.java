import java.util.*;
class IndexWithinString
  {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the String");
      String str=new String();
      str=sc.nextLine();
      System.out.println("Enter the index no;");
      int index=sc.nextInt();
      if(index>=0&&index<str.length())
      {
        char ch=str.charAt(index);
        System.out.println("charecter at index"+index+":"+charecter);
      }
      else{
        Sytem.out.println("invalid index");
      }
    }
  }