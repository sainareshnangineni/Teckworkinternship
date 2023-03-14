//Create an interface “Number” with the following abstract methods isZero( ), isPositive(), isNegative( ), isOdd( ), isEven( ), isPrime(), and isAmstrong() the above methods return boolean primitive type. Implement this interface in the “Verification” 
interface no
  {
    boolean isZero(int num);
    boolean isPositive(int num);
    boolean isNegative(int num);
    boolean isOdd(int num);
    boolean isEven(int num);
    boolean isArmstrong(int num);
  }
class Verification implements no
  {
    public boolean isZero(int num)
    {
      if(num==0)
      {
      return true;
       
      }
      else
      {
        return false;
      }
    }
    public boolean isPositive(int num)
    {
      if(num>0)
      {
     return true;
      }
      else{
        return false;
      }
    }
    public boolean isNegative(int num)
    {
      if(num<0)
      {
   return true;
      }
      else{
        return false;
      }
    }
    public  boolean isOdd(int num)
    {
      if(num%2!==0)
      {
      return true;
      }
      else 
      {
        return false;
      }
    }
    public boolean isEven(int num)
    {
      if(num%2==0)
      {
       return true;
      }
      else
      {
        return false;
      }
    }
   public boolean isArmstrong(int num)
    {
      int a = 0,b=0;
      int s = n1;
      while(num>0)
        {
          a = n1%10;
          b = b+(a*a*a);
          n1 = n1/10;
          
        }
      if(s1==b)
      {
       return true;
      }
      else{
        return false;
      }
    }
  }
class Main
  {
    public static void main(String args[])
    {
    Scanner s = new Scanner(System.in);
    int num = s.nextInt();
     verification v = new verification();
      System.out.println(v.isZero(num));
      System.out.println(v.isPositive(num));
      System.out.println(v.isNegative(num));
      System.out.println(v.isOdd(num));
      System.out.println(v.isEven(num));
      System.out.println(v.isArmstrong(num));
    }
  }