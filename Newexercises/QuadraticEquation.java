import java.util.*;
class QuadraticEquation
  {
    public static void main(String[] args)
    {
      Scanner s = new Scanner(System.in);
      System.out.println("Enter a value:");
      double a = s.nextDouble();
      System.out.println("Enter the b value:");
      double b = s.nextDouble();
      System.out.println("Enter the c value:");
      double c = s.nextDouble();
      double M = b*b-4.0*a*c;
      if(M>0)
      {
        double r1 = (-b+Math.pow(M,0.5))/(2.0*a);
        double r2 = (-b+Math.pow(M,0.5))/(2.0*a);
        System.out.println("The roots iare" +  r1 + "and" + r2);
      }
      else if(M==0)
      {
        double r1 = -b/(2.0*a);
        System.out.println("The root is" +  r1);
      }
      else
      {
        System.out.println("The equation has no real roots" );
      }
    }
  }