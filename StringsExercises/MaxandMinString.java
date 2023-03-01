import java.util.*;
class MaxandMinString
  {
    public static void main(String args[])
    {
   Scanner s = new Scanner(System.in);
     String str= new String();
      str = s.nextLine();
      String k[] = new String[100];
      int length = 0;
      str = str+"";
      for(int i=0;i<str.length();i++)
        {
      if(str.charAt(i)!='')
      {
        k = k+str.charAt(i);
      }
      else
      {
        k[length]=k;
        k++;
        k=" ";
      }
    }
       Min=Max=k[0];
    for(int i=0;i<length;i++)
  {
    if(Min.length()<k[i].length())
      Min=k[i];
    if(Max.length()<k[i].length())
      Max = k[i];
  }
System.out.println("Min word:"+Min);
System.out.println("Max word:"+Max);
  }
}