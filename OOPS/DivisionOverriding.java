import java.util.*;
  class DivisionOverriding

{
  public static void main(String args[])
  {
    Polymorphism b = new Polymorphism();
     
      b.division(20,5);
      b.division(4.2,2.0);
  }
}
class Polymorphism
  {
   
    
   void  division(int a,int b)
    {
      int c = a/b;
      System.out.println("division of c is:"+c);
    }
    
  }
class Poymorphism1 extends Polymorphism
  {
    void  division(double a,double b)
    {
      double c = a/b;
      System.out.println("division of c is :"+c);
    }
  }
