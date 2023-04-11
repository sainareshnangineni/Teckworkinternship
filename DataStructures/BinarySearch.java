import java.util.*;
class BinarySearch
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
       System.out.println("array is :"+ arr[i]);
      int key=5;
      System.out.println("key to be searched as :"+key);
      int first=0;
      int last=arr.length-1;
      int mid=(first+last)/2;
      while(first<=last)
        {
          if(arr[mid]<key)
          {
            first=mid+1;
          }
          else if(arr[mid]==key)
          {
            System.out.println("Element is found at index:"+mid);
            break;
          }
          else 
          {
            last=mid-1;
            
          }
          mid = (first+last)/2;
        }
      if(first>last)
      {
        System.out.println("element is not found!");
      }
    }
  }