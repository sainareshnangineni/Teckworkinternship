class University
  {
   int x=20;//non static 
   static int y =30;//static
   void  Increment()//non-static
    {

      System.out.println(x+" "+y);
    }
    static void Decrement()//static
    {
      y=y+1;
    }
  }
    class University1
      {
    public static void main(String args[])
    {
      Scanner s = new Scanner(System.in);
      s.Increment();
      s.Decrement();
      System.out.println(s.x+" "+s.y);
    }

      }
    
  