class Abstract
  {
    public static void main(String h[])
    {
      SBI sbi = new SBI();
     System.out.println(sbi.intrestrate());
      sbi.annualprofit();
      HDFC h = new hdfc();
     System.out.println(h.intrestrate());
      h.annualintrest();
    }
  }
   abstract class Bank//we can't create the object for the abstract class
  {
  abstract double intrestRate();
  abstract void AnnualProfit();
  }
  class SBI extends Bank{
  double intrestrate()
  {
    return 1;
  }
  public void annualprofit()
  {
    System.out.println("the year got 30% profit");
  }
  class HDFC extends Bank
  {
    double intrestrate()
    {
      return 12.8;
    }
     void annualprofit()
    {
      System.out.println("the year got 50% of profit");
    }
  }
}



    