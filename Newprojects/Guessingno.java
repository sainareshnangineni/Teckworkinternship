import java.util.*;
class Guessingno
  {
    public static void main(String args[])
    {
      
      int n,guess;
      Scanner s=new Scanner(System.in);
      System.out.println("Enter the n value:");
      n = s.nextInt();
      System.out.println("Enter the Guess value:");
      guess=s.nextInt();
     while(n!=guess){
       
        if(n<guess)
         {
           System.out.println("To high");
           guess=s.nextInt();
           continue;
         }
        else {
           System.out.println("To low");
           guess=s.nextInt();
           continue;
        }
  }}}
  