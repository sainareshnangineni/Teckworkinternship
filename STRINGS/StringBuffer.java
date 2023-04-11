import java.util.*;
class StringBuffer
  {
    public static void main(String f[])
    {
      Scanner s = new Scanner(System.in);
      System.out.println("ENter the String:");
      String str = new String();
      str=s.nextInt();
      StringBuffer str1 = new StringBuffer(s);
      //methods applying
      //Append method
      str1.append(hello);
        System.out.println(str1);
      //Insert method
      n= str1.insert(1,2,java);
      System.out.println(n);
      //replace method
      h=str1.replace(2,hi);
      System.out.println(h);
      //delete method
        l=str1.delete(2);
      System.out.println(l);
      //reverse method
        k= str1.reverse(str1);
      System.out.println(k);
      
    }
  }