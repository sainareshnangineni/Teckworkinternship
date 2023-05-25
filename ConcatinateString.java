import java.util.*;
class ConcatinateString
  {
    public static void main(String args[]){
    Scanner s=new Scanner(System.in);
    String str1=new String();
    System.out.println("Enter the String1:");
    str1=s.nextLine();
   String str2=new String();
System.out.println("Enter the String2:");
str2=s.nextLine();
String str3=str1.concat(str2);
System.out.println(str3);
  }
}