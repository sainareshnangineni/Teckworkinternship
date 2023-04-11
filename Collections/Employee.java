import java.util.*;
class Employee
  {
    String name;
    int id;
    double salary;
    Employee(String name,int id,double salary)
    {
      this.name=name;
      this.id=id;
      this.salary=salary;
    }
    public String getname()
    {
       return name;
    }
    public int getid()
    {
      return id;
    }
    public double getsalary()
    {
      return salary;
    }
    public String toString()
    {
        System.out.println(name+" "+id+" "+salary);
    }
      
    
    void getdetails()
    {
      Scanner s = new Scanner(System.in);
      System.out.println("Enter the first employee details:");
      ArrayList<Employee>ar1=new ArrayList<Employee>();
     
      ar1.add(new Employee("sai",25,23000));
      ar1.add(new Employee("naresh",54,34000));
      for(Employee ar1:ar1)
        {
          System.out.println(ar1);
        }
    }
    void remove()
    {
     
      System.out.println(ar1.remove(1));
      System.out.println(ar1.remove(2));
      System.out.println("After removing the one employee name and id");
      for(Employee ar1:ar1)
        {
          System.out.println(ar1);
        }
    }
    void displaydetails()
    {
       Employee sai = employees.get(0);
        sai.salary = 55000.0; 
      System.out.println("displaying the updated data");
      for(Employee ar1:ar1)
        {
          System.out.println(ar1);
        }
    }
  }
class main
  {
    public static void main(String args[])
    {
      Employee employee=new Employee();
      System.out.println("Enter the employees:");
      employee.getname();
      employee.getid();
      employee.getsalary();
      employee.getdetails();
      employee.remove();
      employee.displaydetails();
    }
  }