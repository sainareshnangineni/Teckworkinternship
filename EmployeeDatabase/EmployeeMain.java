import java.util.*;
class EmployeeMain
  {
    public static void main(String args[])
    {
      char ch;
      int choice;
      Scanner sc=new Scanner(System.in);
      EmployeeImp empobj=new EmployeeImp();
      System.out.println("Add employee details");
       System.out.println("delete employee details");
       System.out.println("search employee details");
       System.out.println("display employee details");
      do{
        System.out.println("Enter ur choice:");
        choice=sc.nextInt();
        switch(choice)
          {
            case 1:empobj.insert();
          break;
            case 2:empobj.delete();
              break;
            case 3:empobj.search();
              break;
            case 4:empobj.display();
              break;
            default:System.out.println("invalid option");
              break;
          }
        System.out.println("do you want to continue one more operation");
        ch=sc.next().charAt(0);
      }
        while(ch!='n');
    }
  }