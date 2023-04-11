//String Compressor:Input: String s=”aabccbc”Output: Return 6, and the first 6 characters of the input array should be: ["a","2","b","2","c","3"]
import java.util.*;
class StringCompresstion
  {
    public static void main(String args[])
    {
      Scanner s = new Scanner(System.in);
      System.out.println("Enter the String:");
      String str =new String();
      str = s.nextLine();
      String k = s.nextLine();
      int i=0;
      k = k+str.charAt(i);
      String str1 = str.replaceAll(str,k);
      System.out.println("After the string compression:"+str1);
      
    }
    
  }