//Write a Java program to create a new String object with the contents of a character array
import java.util.Scanner;
class StringfromCharArray
  {
    public static Stringvalue(char[] chararray,int l,int n)
    {
      Scanner v=new Scanner(System.in);
     System.out.println("Enter the string: ");
      String str=new String();
      str=v.nextLine();
      for(int i=l;i<=n;i++)
        {
          str +=chararray[i];
        }
      return str;
    }

    public static void main(String args[])
    {
      Scanner s=new Scanner(System.in);
      char array=new char[50];
      System.out.println("Enter the array :");
      for(int i=0;i<array.length;i++)
        {
          array[i]=s.next.charAt(0);
          
        }
      StringfromCharArray(array,l,n);
      
    }
  }