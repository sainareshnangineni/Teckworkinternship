import java.util.*;
class InventoryImp
  {
    HashMap<String,Double,Char> hash1=new HashMap<>();
    public void add()
    {
      Scanner s=new Scanner(System.in);
      System.out.println("Enter the product details:");
      System.out.println("Enter the product name:");
      String Productname=s.nextLine();
      System.out.println("Enter the product cost:");
      double Productcost=s.nextDouble();
      System.out.println("Enter the product grade:");
      char  Productgrade = s.next().charAt(0);
      
       hash1.add(new ProductData(Productname,Productcost,Productgrade));
    }
    public void edit()
    {
      Scanner s=new Scanner(System.in);
      if(hash1.size()) ==  0)
        {
         System.out.println("to edit the productdetails:");
        else
        {
          String verify=null;
          System.out.println("Enter the Productname to edit the data");
          String Productname=s.nextLine();
          for(Productname e.hash1)
        }
        }
    }
  }