import java.util.*;
class RemoveDuplicatesfromArray
  {
    public static void main(String args[])
    {
      int index=0;
      int arr[]={10,20,11,22,35,10,20};
      int size=arr.length;
      int duplicate,flag=0,count;
      int duplicate[]=new int[size];
      int i,j;
      System.out.println("Before removing duplicate from the array:");
      for(i=0;i<size;i++)
        {
          System.out.println(arr[i]);
        }
      for(i=0;i<size;i++)
        {
          count=0;
          for(j=i+1;j<size;j++)
            {
              if(arr[i]==arr[j])
              {
                count=count+1;
                break;
              }
            }
          if(count==0)
          {
            duplicate[index]=arr[i];
            index++;
          }
        }
      for(i=0;i<index;i++)
        {
          arr[i]=duplicate[i];
        }
      System.out.println("After removing duplicates from the array");
      for(i=0;i<index;i++)
        {
          System.out.println(arr[i]);
        }
    }
  }