//overloading method
import java.util.*;
class DivisionOverloading
  {
    public static void main(String args[])
    {
     
      Polymorphism s = new Polymorphism();
      s.division(20,3);
      s.division(8.7,2.0);
    
    }
  }
class Polymorphism
  {
    
    public void division(int a,int b)
    {
      int c = a/b;
      System.out.println(" Division of c is:"+ c);
    }
     public  void division(double a,double b)
    {
      double c = a/b;
       System.out.println(" Division of c is:"+ c);
    }
  }