//Create a class 'Student' with three data members which are name, age, and address. The constructor of the class assigns default values name as "unknown", age as '0' and address as "not available". It has two members with the same name 'setInfo'. The first method has two parameters for name and age and assigns the same whereas the second method takes has three parameters which are assigned to name, age and address respectively. Print the name, age and address of 2 students.
class Student
  {
    String name;
    int age;
    String address;
    Student()
    {
      this.name = "unkown";
      this.age = 0;
      this.address = "not avaliable";
    }
    
     SetInfo(String name,int age)
    {
      this.name = name;
      this.age = age;
    }
     SetInfo(String name,int age,String address)
    {
      this.name = name;
      this.age = age;
      this.address=address;
    }
    public void getdetails()
    {
     Scanner s = new Scanner(System.in);
      System.out.println("Enter the student name:");
      String name=s.nextLine();
      System.out.println("Enter the student age");
      int age =s.nextInt();
      System.out.println("Enter the  student adress:");
    }
  }
class Main
  {
    public static void main(String args[])
    {
    Scanner s = new Scanner(System.in);
      Student  s1=new Student();
      Student  s2=new Student();
      s1.getdetails();
      s1.SetInfo(Sai,20);
      s2.getdetails();
      s2.SetInfo(pavan,25);
    }
  }