import java.util.Scanner;
class DiagonalMatrix
  {
   public static void diagonalmatix(int a[][],int r,int c)
    {
      System.out.println("Enter the DiagonalMatrix:");
      for(int i=0;i<r;i++)
        {
          for(int j=0;j<c;j++)
            {
            if(i==j)
            {
                System.out.println(a[i][j]+" ");
              }
              System.out.println();
            }
        }
    }
    public static void main(String args[])
    {
      Scanner s =new Scanner(System.in);
      System.out.println("Enter the row matrix:");
      int row = s.nextInt();
      System.out.println("Enter the column size matrix:");
      int column =s.nextInt();
      int arr[][]=new int[row][column];
      for(int i=0;i<row;i++)
        {
          for(int j=0;j<column;j++)
            {
              arr[i][j]=s.nextInt();
            }
        }
      diagonalmatix(arr,row,column);
    }
  }