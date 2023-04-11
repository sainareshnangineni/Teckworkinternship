import java.util.*;
class Employee
  {
    String name;
    String id;
    double salary;
    Employee(String name,String id,double salary)
    {
      this.name = name;
      this.id = id;
      this.salary=salary;
    }
    public String getName()
      {
      return name;
      }
public String getid()
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
  }
class ArrayList
  {
    public static void main(String args[])
    {
      ArrayList<Employee>ar1=new ArrayList<Employee>();
      ArrayList<Employee>ar2=new ArrayList<Employee>();
      ArrayList<Employee>ar3=new ArrayList<Employee>();
      ar1.add(new Employee("aaa","123",25000.00));
       ar2.add(new Employee("bbb","231",34000.00));
       ar3.add(new Employee("ccc","456",51000.00));
      System.out.println(ar1.getName());
       System.out.println(ar1.getid());
       System.out.println(ar1.getsalary());
      System.out.println(ar1.getEmployee());
      System.out.println(ar2.removeEmployee());
      System.out.println(ar3.getEmployee());
    }
    
  }