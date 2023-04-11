import java.util.*;
class InventoryMain
  {
    public static void main(String args[])
    {
      char ch;
      int choice;
      Scanner sc=new Scanner(System.in);
      InventoryImp sobj=new InventoryImp();
      System.out.println("1. Add items");
      System.out.println("2. edit items");
      System.out.println("3. Delete items");
      System.out.println("4. check the product");
      System.out.println("5. display the product");
      do{
        System.out.println("Enter your choice:");
        choice=sc.nextInt();
        switch(choice)
          {
            case 1:
              sobj.add();
              break;
            case 2:
              sobj.edit();
              break;
            case 3:
              sobj.delete();
              break;
            case 4:
              sobj.checkproduct();
              break;
            case 5:
              sobj.displayproduct();
              break;
            default:
              System.out.println("Invalid option...");
              break;
          }
        System.out.println("Do you want to perform another operation:");
        ch=sc.next().charAt(0);
      }
        while(ch!='n');
    }
  }