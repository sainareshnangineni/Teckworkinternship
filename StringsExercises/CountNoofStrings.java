import java.util.*;
class CountNoofStrings
  {
    public static void main(String r[])
    {
      
      Scanner s = new Scanner(System.in);
      String s1 = new String();
      s1=s.nextLine();
      int count = 0;
      char arr[]=new char[s1];
      for(int i=0;i<arr.length;i++)
        {
          arr[i]=s1.charAt(i);
         if( ((i>0)&&(ch[i]!=' ')&&(ch[i-1]==' ')) || ((ch[0]!=' ')&&(i==0)) )  
             {
            count++;
             }
          return count;
        }
      
      
    }
  }