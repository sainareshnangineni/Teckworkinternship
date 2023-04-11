import java.util.*;
class EmployeeDatabase
{
private int id;
private String name;
private int age;
private double salary;
public EmployeeDatabase(int id,String name,int age,double salary)
{
this.id=id;
this.name=name;
this.age=age;
this.salary=salary;
}
public int id()
{
return id;
}

public String name()
{
return name;
}
public int age()
{
return age;
}
public Double salary()
{
return salary;
}
public String toString()
{
return "id:" + id + "name:"+ name+"age:"+age+"salary:"+salary;
}
}

  class main
    {
     public static void main(String args[])
      {
        ArrayList<EmployeeDatabase>ar1=new ArrayList<EmployeeDatabase>();
        Scanner sc = new Scanner(System.in);
        ar1.add(new EmployeeDatabase(1,"sai",35,2000));
         ar1.add(new EmployeeDatabase(2,"naresh",46,3000));
         ar1.add(new EmployeeDatabase(3,"babi",48,6000));
        Iterator it=ar1.iterator();
        while(it.hasNext())
          {
            
    System.out.println(it.next());
          }
        String verify=null;
        System.out.println("Enter the id to get employee details");
        int sid=sc.nextInt();
        for(EmployeeDatabase e:ar1)
          {
            if(e.getId()==sid)
            {
              System.out.println("id:"+e.getid()+"name:"+e.getname()+"age:"+e.getage()+"salary:"+e.getsalary());
            e.toString();
            verify="found";
            break;
          }
          }
        if(verify==null)
          System.out.println("not found");
        String verify1=null;
        System.out.println("Enter id that you want to delete:");
        int did=sc.nextInt();
        for(EmplyeeDatabase e:ar1)
          {
            if(e.getid()==did)
            {
              System.out.println("id:"+e.getid()+"name:"+e.getName()+"age:"+e.getage()+"salary:"+e.getsalary());
              ar1.remove(e);
              verify1="found";
              break;
            }
          }
        if(verify1==null)
        {
          System.out.println("not found");
          Iterator itr=ar1.iterator();
          while(itr.hasNext())
            {
              System.out.println(itr.next());
            }
        }
      }
    }
