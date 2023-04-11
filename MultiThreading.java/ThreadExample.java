class Threadclass implements Runnable
  {
   public  void run()
    {
      System.out.println("i am runnin gthred");
    }
  }
public class ThreadExample
{
  public static void main(String h[])
  {
    Threadclass tc=new Threadclass();
   // tc.run();
    Thread t1=new Thread(tc);
    t1.start();
    Thread t2=new Thread(tc);
    t2.start();
    Thread
  }
}