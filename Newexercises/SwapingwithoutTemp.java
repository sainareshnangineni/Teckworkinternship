import java.util.*;
class SwapingwithoutTemp
  {
    public static void main(String g[])
    {
      Scanner s = new Scanner(System.in);
      System.out.println("Enter the D& B values:");
      int D = s.nextInt();
      int B = s.nextInt();
      System.out.println("Before Swaping:"+D+","+B+"");
      D=D+B;
      B=D-B;
      D=D-B;
      System.out.println("After Swaping:"+D+","+B+"");
    }
  }