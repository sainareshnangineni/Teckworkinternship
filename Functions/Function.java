/*addition opeartion : function with arg with return statement 
Substraction opeartion : function without arg with return statement
multiplication opeartion : function with arg without return statement
division opeartion : function without arg without return statement*/
class Function
  {
    public static void main(String args[])
    {
      int a=10;
      int b=20;
      System.out.println("Enter the addition of 2 nos: ");
      int z=add(a,b);
      System.out.println(z);
      int v=sub();
      System.out.println(v);
      mul(a,b);
      divison();
    }
   static int add(int x,int y)
    {
       return(x+y);
    }
    static int sub()
    {
      int a=10,b=20;
      return(x-y);
    }
   static void mul(int x,int y)
    {
      int c=(x*y);
      System.out.println(c);
    }
    static void division()
    {
      int x=10,y=20;
      System.out.println(x/y);
    }
  }