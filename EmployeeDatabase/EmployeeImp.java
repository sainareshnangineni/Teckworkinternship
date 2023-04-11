import java.util.*;
//import EmployeeImp.Employee;
class EmployeeImp implements EmployeeInterface
  { 
  ArrayList<EmployeeImp> emparr=new ArrayList<>();
  
  public  void insert()
     {
     Scanner s =new Scanner(System.in);
     System.out.println("Enetr employee details like id,name,sal");
     int id=s.nextInt();
     String name=s.nextLine();
     double sal=s.nextDouble();
     emparr.add(new EmployeeData(id,name,sal));
     }
  public void delete()
    {
    Scanner s=new Scanner(System.in);
      String verify = null;
    if(emparr.size()==0)
      System.out.println("no data is avaliable to delete");
    else{
      System.out.println("enter the employee id to delete data");
      int empid=s.nextInt();
      for(EmployeeData e : emparr)
        {
          if(e.getEmpid()==empid)
          {
            emparr.remove(e);
            verify ="found";
            break;
          }
          if(verify==null)
            System.out.println("no data is avaliable with this id ");
        }
    }
    }
  public void search()
    {
     Scanner s = new Scanner(System.in);
      String verify2=null;
    System.out.println("enter the id to search");
    int empid=s.nextInt();
      for(EmployeeData e: emparr)
        {
          if(e.getEmpid()==empid)
       {
        System.out.println(e.getEmpid()+" "+e.getEmpname()+" "+e.getEmpsalary());
      verify2="found";
      break;
        }
      }
    }
  public void display()
    {
    if(emparr.size()==0)
      System.out.println("no data is avaliable");
    else{
    Iterator itr=emparr.iterator();
    while(itr.hasNext())
      {
        System.out.println(itr.next());
      }
    }
  
    }
  }