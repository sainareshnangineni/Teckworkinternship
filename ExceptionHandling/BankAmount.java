import java.util.*;
class BankAmount
  {
    Long balence;
    void deposit()
    {
      Scanner s = new Scanner(System.in);
      System.out.println("Enter the main balence:");
      long balence = s.nextLong();
      System.out.println("enter the deposit ammount:");
      long depositamount =s.nextLong();
      long deposit=balence+depositammount;
      System.out.println("before deposited ur ammount is "+balence+"adding deposit money so ur final balence is:"+deposit);
    }
    void withdraw()throws Exception
    {
      Scanner v=new SCanner(System.in);
      System.out.println("Enter the main balence:");
      long balence=v.nextLong();
      System.out.println("enter the withdraw amount:");
      long withdrawamount=sc.nextLong();
      long withdraw =balence-withdrawamount;
    }
    if(withdraw<=0)
     {
        throw new Exception("insufficient funds Exceptions");
     }
     else if(balence<=0)
      {
      throw new Exception("Insufficient funds Exceptions");
      }
     else 
     {
       System.out.println(withdraw);
     }

    void checkbalence()
     {
     Scanner s = new Scanner(System.in);
     System.out.println("enter the balence:");
     long balence = s.nextLong();
     System.out.println("check bank balence is:"+balence);
     }
    }
  
  class BankApplication
    {
      public static void main(String args[])
      {
        BankAccount b = new BankAccount();
        
        b.deposit();
        b.withdraw();
        b.checkbalence();
      }
    }
  