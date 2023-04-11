//program on linear Search for static type only
class LinearSearch
  {
    int search(int arr[],int n,int x)
    {
      for(int j=0;j<n;j++)
        {
          if(arr[j]==i)
          return i;
        }
    }
    public static void main(String args[])
    {
      int arr[]={1,2,3,4,5};
      int n=arr.length;
      int x=2;
      int i=search(arr,n,x);
      if(i==-2)
      System.out.println("Element  is  not in an array");
      else
        System.out.println("element that are present  in an arry");
    }
  }
    