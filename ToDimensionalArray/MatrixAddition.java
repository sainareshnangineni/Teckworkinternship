import java.util.Scanner;
class MatrixAddition
  {
    public static void arry(int k1[][],int k2[][],int k3[][],r1,c1)
    {
      for(int i=0;i<r1;i++)
        {
          for(int j=0;j<c1;j++)
            {
              k3[i][j]=k1[i][j]+k2[i][j];
            }
        }
      for(int i=0;i<r1;i++)
        {
         for(int j=0;j<c1;j++)
           {
             System.out.println(k3[i][j]+" ");
           }
          System.out.println();
        }
    }
    public static void main(String h[])
    {
      Scanner s = new Scanner(System.in);
      System.out.println("Enter the row1 size:");
      int row1=s.nextInt();
      System.out.println("Enter the column1 size:");
      System.out.println("Enter the row2 size:");
      int row2 =s.nextInt();
        System.out.println("Enter the column2 size:");
        int arr1[][]=new int[row1][column1];
      int arr2[][]=new int[row2][column2];
      System.out.println("Enter the arr1 :");
      for(int i=0;i<row1;i++)
        {
          for(int j=0;j<column1;j++)
            {
            arr1[i][j]=s.nextInt();
            }
        }
      System.out.println("enter the arr2 elements:");
      for(int i=0;i<row2;i++)
        {
          for(j=0;j<column2;j++)
            {
              arr2[i][j]=nextInt();
            }
        }
      for(int i=0;i<row1;i++)
        {
          for(j=0;j<column1;j++)
            {
              System.out.println(arr1[i][j]+" ");
            }
          System.out.println();
        }
      for(int i=0;i<row2;i++)
        {
          for(int j=0;j<column2;j++)
            {
              System.out.println(arr2[i][j]+" ");
            }
          System.out.println();
        }
      System.out.println("arry is:");
      arry(arr1,arr2,arr3,row1,column1);
    }
  }