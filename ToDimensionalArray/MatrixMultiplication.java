import java.util.*;
public class MatrixMultiplication
  {
    public static void main(String args[])
    {
     Scanner s = new Scanner(system.in);//Read the data for matrix
     int s1,s2,p1,p2,i,j;
      System.out.println("Enter the dimensions of s1,s2:");
      s1=s.nextInt();
      s2=s.nextInt();
      p1=s.nextInt();
      p2=s.nextInt();
      //After allocating the data for matrix
      int Matrix1[][]=new int[s1][s2];
      int Matrix2[][]=new int[p1][p2];
      System.out.println("Given data for s matrix  is:");
      for(i=0;i<s1;i++)
        {
          for(j=o;j<s2;j++)
          Matrix1[i][j]=s.nextInt();  
        }
      System.out.println("Given data for p matrix");
      for(i=0;i<p1;i++)
        {
          for(j=0;j<p2;j++)
          p1[i][j]=s.nextInt();    
        }
      multiplication(Matrix1,s1,s2,Matrix2,p1,p2);
      static void multiplication(int f[][],int r1,int c1,int s[][],int r2,int c2)
     {
     int result[][]=new int[r1][c2];
     if(c1==r2)
     {
       for(int i=0;i<r1;i++)
         {
           for(int j=0;j<c2;j++)
             {
               result[i][j]=0;
               for(int k=0;k<c1;k++)
                 result[i][j]=result[i][j]+f[i][k]*s[k][j];
             }
         }
       for(int i=0;i<r1;i++)
         {
           for(int j=0;j<c2;j++)
             {
               System.out.println(result[i][j]+"\t");
             }
           System.out.println("\n");
           
             }
         }
     else
       System.out.println("multiplication not possible");
             }
  }
  }
     