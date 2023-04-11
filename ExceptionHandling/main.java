import java.util.*;
class Inheritence
  {
    String name;
    int age;
   public void getdetails()
    {
     Scanner s  = new Scanner(System.in);
      name =s.nextLine();
      age = s.nextInt();
    }
    public void setdetails()
    {
      System.out.println("ENter the name:"+ name);
      System.out.println("Enter the age"+ age);
    }
  }
class child extends Inheritence
  {
    String address;
    public void address()
    {
      System.out.println("Address is:"+ address);
    }
     public static void main(String args[])
    {
      child c = new child();
      c.getdetails();
      c.setdetails();
      System.out.println(c.name+" "+c.address);
    }
  }

