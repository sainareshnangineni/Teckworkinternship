import java.util.*;
class Frequency
  {
    public static void main(String args[])
    {
      int arr[]={2,5,2,7,5,12,5};
      int size =arr.length;
      countFrequency(arr,size);
    }
    static void countFrequency(int arr[],int size);
    {
      for(int i=0;i<size;i++)
        {
          int flag=0;
          int count=0;
          for(int j=i+1;j<size;j++)
            {
              if(arr[i]==arr[j])
              {
                flag=1;
              break;
            }
        }
      if(flag==1)
        continue;
      for(intj=0;j<=i;j++)
        {
          if(arr[i]==arr[j])
            count++;
           }
      System.out.println(arr[i]+": "+ count);
    }
  }
  }