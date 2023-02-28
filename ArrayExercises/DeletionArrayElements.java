import java.util.*;
public class DeletionArrayElements
  {
    public static void main(String k[])
    {
     int a[] =new int[50]; 
    Scanner s = new Scanner(System.in);
      System.out.println("Enter the size of array elements:");
    int size=s.nextInt();
      System.out.println("Enter the array elements According to given array size:");
    for(int i=0;i<size;i++)
        {
        a[i]=s.nextInt();
        } 
      System.out.println("Array elements before deletion:");
      for(int i=0;i<size;i++)
        {
          System.out.println(a[i]);
        }
      System.out.println("Enter the position where the elements should  be inserted");
      int pos = s.nextInt();
      for(int i=pos;i<size;i++)
        {
          a[i]=a[i+1];
        }
      --size;
      System.out.println("Array elements after deletion");
      for(int i=0;i<size;i++)
        {
          System.out.println(a[i]);
        }
    }
  }