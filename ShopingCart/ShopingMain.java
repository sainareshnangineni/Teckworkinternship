import java.util.*;
class ShoppingMain
  {
    public static void main(String[] args)
    {
      Scanner sc = new Scanner(System.in);
      ShoppingImp sim = new ShoppingImp();
      System.out.println(".....This is the Shopping Cart.....");
      System.out.println("1.add the item details..");
      System.out.println("2.remove the item details..");
      System.out.println("3.display the item details..");
      System.out.println("4.total cost of  the item details..");

      int val ;
      char ch;
      do
      {
        System.out.println("enter number from 1 to 4 it give requaired output");
         val = sc.nextInt();
        switch(val){
          case 1 : sim.add();
            break;
          case 2 : sim.remove();
            break;
          case 3 : sim.display();
            break;
          case 4 : sim.total_cost();
            break;
          default:System.out.println("insert valid option only");
        }
        System.out.println("you want another more action then enter y");
         ch = sc.next().charAt(0);
        
      }while(ch != 'n');
    }
  }