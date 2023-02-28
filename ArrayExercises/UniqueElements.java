import java.util.*;
class UniqueElements
  {
    public static void main(String args[])
    {
      int arr[]={2,3,5,8,6,9,5,3,6};
      int len=arr.length;
      int DistinctArray=new int[20];
      int index=0;
      for(int i=0;i<len;i++)
        {
          int flag=0;
          for(int j=0;j<i;j++)
            {
              if(arr[i]==arr[j])
              {
                flag=1;
                break;
              }
            }
          if(flag==0)
          {
            DistinctArray[index]=arr[i];
            index++;
            
          }
        }
      for(int i=0;i<index;i++)
        System.out.println(DistinctArray[i]+"");
    }
  }