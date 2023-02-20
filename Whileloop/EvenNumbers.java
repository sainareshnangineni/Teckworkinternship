import java.util.*;

class EvenNumbers {
  public static void main(String args[])
  {
   int n = 100;
    int i=1;
   
    System.out.println("Even nos from 1 to "+n+":");
  
    while(i<=n)
      {
        if(i%2==0)
        {
          System.out.println(i);
          
        }
        i++;
      }
  }
  }