import java.util.*;
class Divisibleby5and11
  {
    public static void main(String args[]){
      int N;
      Scanner S=new Scanner(System.in);
      System.out.println("Enter the No:");
      N = S.nextInt();
      if(N%5==0 && N%11==0)
      System.out.println("N is divisible by 5 and 11: ");
      else
      System.out.println("N is not divisible by 5 and 11: ");
    }
  }