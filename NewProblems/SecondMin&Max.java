import java.util.Scanner;
class SecondMin&Max
  {
    public static void main(String args[])
    {
    int arr[]={20,50,43,38,77,56,66};
      int max=arr[0];
      int secondmax=arr[0];
      int min=arr[0];
      int secondmin=arr[0];
      System.out.println("the arry is");
      for(int i=0;i<arr.length;i++)
        {
          System.out.println("the given array is:");
        }
      System.out.println();
      for(int i=0;i<arr.length;i++)
        {
          if(arr[i]>max)
          {
            secondmax=max;
            max=arr[i];
          }
          else if(arr[i]>secondmax)
          {
            secondmax=arr[i];
          }
        }
      for(int i=0;i<arr.length;i++)
        {
          if(arr[i]<min)
          {
            secondmin=min;
            min=arr[i];
          }
          else if(arr[i]<secondmin)
          {
            secondmin=arr[i];
          }
        }
      System.out.println("\nSecond max no is:"+ secondmax);
     System.out.println("\nSecond min no is:"+ secondmin); 
    }
  }