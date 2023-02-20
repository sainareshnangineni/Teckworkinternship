import java.util.Scanner;
class ElectricityBill
  {
    public static void main(String[] args)
    {
      Scanner s = new Scanner(System.in);
      System.out.println("Enter the electricity bill:");
      int unit = s.nextInt();
      float amount,s_charge,bill_amount;
      if(unit<=50)
      {
        amount = unit*0.50f;
      }
      else if(unit<=150)
      {
        amount = unit*1.20f;
      }
      else if(unit<=250)
      {
        amount = unit*1.20f;
      }
      else 
      {
        amount = unit*1.50f;
      }
      s_charge = amount*0.2f;
      bill_amount = amount+s_charge;
      System.out.println("Total bill:" +bill_amount);
    }
  }