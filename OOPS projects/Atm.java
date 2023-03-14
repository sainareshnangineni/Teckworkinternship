class Account
  {
    double balence;
    long number;
    String Accountholdername;
    void getDetails();
    {
      Scanner sb = new Scanner(System.in);
      System.out.println("Enter the number:");
      number = sb.nextLong();
      System.out.println("Enter the string:");
      String  = sb.nextLine();
      System.out.println("Enter the Accountholder name:");
      Accountholdername  = sb.nextLine();
      }
   void deposit();
    {
      System.out.println("Account details:");
      Scanner s = new Scanner(System.in);
      System.out.println("Account Number"+ number);
      number= s.nextLong();
      System.out.println("Account balance"+ balence);
      balence = s.nextDouble();
      balence = withdraw-balence;
      System.out.println(balence);
    }
    void withdraw();
    {
      System.out.println("Enter the amount details: ");
      Scanner b = new Scanner(System.in);
      System.out.println("enter the account no:"+ number);
      number = s.nextLong();
      System.out.println("Account withdraw is:"+ withdraw);
      balence=balence-deposit;
      System.out.println(balence);
    }
   void checkbalence();
    {
      System.out.println("Enter the Account details:");
      Scanner v = new Scanner(System.in);
      System.out.println("Account Number"+number);
      number = v.nextLong();
      System.out.println("balence is:"+ checkbalence);
    }
    
  }
    class Atmsimmulator
      {
        public static void main(String arr[])
        Scanner s = new Scanner(System.in);
        System.out.println("Welcome");
        System.out.println("Insert your card:");
        System.out.println("What task u will perform:");
        System.out.println("1.Deposit");
        System.out.println("2.checkbalence");
        System.out.println("3.withdraw");
        Scanner p=new Scanner(system.in);
        int i = p.nextInt();
        switch(i)
          {
            case 1:
              deposit();
              break;
            case 2:
              checkbalence();
              break;
            case 3:
              withdraw();
              break;
              default(i):
                System.out.println("Please Insert the card again!");
          }
      }