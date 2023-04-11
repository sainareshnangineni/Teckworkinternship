import java.util.*;
class ArraySequenceException extends Exception
  {
    public ArraySequenceException(String message)
    {
      super(message);
    }
  }
class ArrayElements
  {
    Scanner sc = new Scanner(System.in);
    int n;
    int arr[] = new int[n];
   
  void add()
    {
      System.out.println("enter the array elements:");
      try{
        for(int i=0;i<n;i++)
          {
            arr[i]=sc.nextInt();
          }
      }
      catch(InputMismatch e)
        {
          System.out.println("Enter only integer types of values");
          add();
        }
    }
      
    
    void sequence()
    {
      int count=0;
      for(int i=0;i<n;i++)
        {
          count=count+arr[i];
        }
      System.out.println("The sum of elements is"+count);
    }
    void checkarray()
    {
      int temp[]=new int[arr.length];
      System.out.println("this is the checking module");
      try
        {
        for(int i=0;i<arr.length;i++)
          {
            if(arr[i]>=0)
            {
              temp[i]=arr[i];
              System.out.println(temp[i]+" ");
            }
          }
      }
      catch(Exception e)
        {
          System.out.println("This is negative no so can we access the array");
        }
    }
  }
class Arraysum
  {
    public static void main(String args[])
    {
      Scanner s = new Scanner(System.in);
      System.out.println("Enter the no of cases");
      int cas = s.nextInt();
      Arraysum v[] = new Arraysum[cas];
      for(int i=0;i<cas;i++)
        {
          v[i] = new Arraysum();
          v[i].add();
          v[i].sequence();
          v[i].checkarray();
        }
    } 
         
  }