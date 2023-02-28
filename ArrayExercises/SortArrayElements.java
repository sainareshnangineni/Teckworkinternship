import java.util.*;
class SortArrayElements
  {
    public static void main(String args[])
    {
      Scanner s=new Scanner(System.in);
      int n = nextInt();
      int arr[]=new int[n];
      System.out.println("Array elements after sorting:");
      for(int i=0;i<arr.length;i++)
        {
          for(int j=i+1;j<arr.length;j++)
            {
              int temp=0;
              if(arr[i]>arr[j])
              {
                temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
              }
            }
          System.out.println(arr[i]);
        }
    }
  }