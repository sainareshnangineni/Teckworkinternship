import java.util.*;
class UpperTriangleMatrix
  {
    public static void uppertriangele(int sai[][],int row,int column)
    {
      System.out.println("Enter the upper values in a matrix:");
      for(int i=0;i<row;i++)
        {
          for(int j=0;j<column;j++)
            {
              if(i>j)
              {
                continue;
              }
              else{
                System.out.println(sai[i][j]+"");
              }
              System.out.println();
            }
         }
    } 
    public static void main(String args[])
    {
      Scanner s = new Scanner(System.in);
      System.out.println("Enter the row size matrix:");
      int row = s.nextInt();
      System.out.prntln("Enter the column size matrix");
      int column=s.nextInt();
      int sai[][]= new int[row][column];
      for(int i=0;i<row;i++)
        {
          for(j=0;j<column;j++)
            {
              sai[i][j]=s.nextInt();
            }
        }
      uppermatrix(sai,row,column);
    }
  }