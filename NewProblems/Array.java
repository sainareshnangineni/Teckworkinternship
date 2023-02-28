import java.util.Scanner;
class Array
  {
    static void sortarr(int array,int n)
    {
    int l=0;
    int m=0;
    int n=0;
    int i=0;
    while(i<n)
  {
    if(array[i]==0)
    {
      l=l+1;
      
    }
    if(array[i]==1)

      {
      m=m+1;
      }
    if(array[i]==2)
    {
      n=n+1;
    }
    i=i+1;
    while(i<l)
      {
        array[i]=0;
        i=i+1;
      }
    while(i<m+l)
      {
        array[i]=1;
        i=i+1;
      }
    while(i<n+m+l)
      {
        array[i]=2;
        i=i+1;
      }
  }
    }
public static void main(String args[])
    {
      int n;
      Scanner s=new Scanner(System.in);
      System.out.println("Enter the elements:");
      n=sc.nextInt();
      int arry[]=new int[100];
      System.out.println("Enter the elements in an array:");
      for(int i=0;i<n;i++)
        {
          arry[i]=s.nextInt();
        }
      sortarray(array,n);
      System.out.println("After sorteing:");
      for(int i=0;i<n;i++)
        {
      System.out.println(array[i]);
        }
    }
  }