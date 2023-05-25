import java.util.*;
class ConcatinateString
  {
    public static void main(String args[]){
    Scanner s=new Scanner(System.in);
    String str1=new String();
    System.out.println("Enter the String1:");
    str1=s.nextLine();
     int count=0;
      char arr[]=new char[str1];
      for(int i=0;i<arr.length;i++)
        {
          arr[i]=str1.charAt(i);
          if(((i>0)&&(ch[i]!=' ')&&(ch[i-1]==' '))||(ch[0]!=' ')&&(i==0))
          {
            count++;
          }
        Sytem.out.println(count);
        }
    }
  }