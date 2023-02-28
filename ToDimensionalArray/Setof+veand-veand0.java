import java.util.*;
class sai
  {
    public static void main(String args[]){
    Scanner s=new Scanner(System.in);
    System.out.println("Enter the array elements:");
    int l=s.nextInt();
    int arry[]=new int[l];
    System.out.println("Enter the  array elements:");
    arry[]=s.nextInt();
   for(int i=s.nextInt();i<l;i++)
    {
    if(arry[i]<0)
     System.out.println(arry[l]+" ");
    else 
      if(arry[i]>0)
      System.out.println(arry[l]+" ");
    else
      if(arry[i]==0)
        System.out.println(arry[l]+" ");
  }
System.out.println();
  
}