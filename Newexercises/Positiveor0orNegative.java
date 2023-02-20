import java.util.*;
public class Positiveor0orNegative
 {
  public static void main(String args[])
  {
  int A;
  Scanner s=new Scanner(System.in);
  System.out.println("Enter the A value:");
  A =s.nextInt();
  if(A>0){
  System.out.println("A is max");
  }
  else if(A==0)
  System.out.println("A is Zero");
  
  else if(A<0)
  System.out.println("A is Negative"); 
 }
 }