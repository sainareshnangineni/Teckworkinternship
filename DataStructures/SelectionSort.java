class SelectionSort
  {
    public static void main(String args[])
    {
      int temp;
      
      Scanner s = new Scanner(System.in);
      System.out.println("Enter the array elements size:");
      int size=s.nextInt();
      System.out.println("Enter the array elements into an array:");
      int arr[]=new int[size];
      for(int i=0;i<size-1;i++)
       arr[i]=s.nextInt();
      System.out.println("array before sorting is:");
       System.out.println("array is :"+ arr[i]);
      System.out.println("sorting the elements:");
      for(int i=0;i<size;i++)
        {
          for(j=i+1;j<size;j++)
            {
              if(arr[i]>arr[j])
              {
                temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
              }
            }
        }
      System.out.println("After sorting the array:");
      for(int i=0;i<size;i++)
        {
          System.out.println(arr[i]+" ");
        }
    }
    
  }