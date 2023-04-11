import java.util.*;
class BubbleSort
  {
    public static void main(String args[])
    {
      Scanner s = new Scanner(System.in);
      System.out.println("Enter the array elements size:");
      int size=s.nextInt();
      System.out.println("Enter the array elements into an array:");
      int arr[]=new int[size];
      for(int i=0;i<size-1;i++)
       arr[i]=s.nextInt();
      System.out.println("array before sorting is:");
       System.out.println("array is :"+ arr[i]);
         bubblesort(arr);
        System.out.println("array after sorting is:");
      for(int i=0;i<arr.length;i++)
        {
          System.out.println(arr[i]);
        }
    }
    static  void bubblesort(int arr[])
    {
      int n=arr.length;
      int temp=0;
      for(int i=0;i<n;i++)
        {
          for(int j=0;j<n-1;j++)
            {
              if(arr[j-1]>arr[j])
              {
                temp=arr[j-1];
                arr[j-1]=arr[j];
                arr[j]=temp;
              }
            }
        }
    }
  }