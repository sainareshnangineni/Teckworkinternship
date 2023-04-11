/*Alice and Bob were having an argument about which of them is taller than the other. Charlie got irritated by the argument and decided to settle the matter once and for all.Charlie measured the heights of Alice and Bob, and got to know that Alice's height is X centimeters and Bob's height is Y centimeters. Help Charlie decide who is taller.It is guaranteed that X≠Y.Input FormatThe first line of input will contain an integer T — the number of test cases. The description of T test cases follows.The first and only line of each test case contains two integers X and Y, as described in the problem statement.Output FormatFor each test case, output on a new line A if Alice is taller than Bob, else output B . The output is case insensitive, i.e, both A  and a will be accepted as correct answers when Alice is taller.*/
import java.util.*;
class Alice&Bob
  {
    public static void main(String args[])
    {
      Scanner s = new Scanner(System.in);
      System.out.println("Enter the two values:");
      int Alice,Bob;
      Alice = s.nextInt();
      Bob = s.nextInt();
      if(Alice>Bob)
      {
        System.out.println("Alice is big");
      }
      else{
        System.out.println("Bob is big");
      }
    }
  }