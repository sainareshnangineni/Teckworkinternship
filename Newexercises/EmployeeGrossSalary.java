import java.util.*;
class EmployeeGrossSalary
  {
    public static void main(String[] args)
    {
      Scanner s=new Scanner(System.in);
      System.out.println("Enter the Amount:");
      int a = s.nextInt();
      float Hra,Da,Total;
      if(a<=10000)
      {
        Hra = a*0.2f;
        Da = a*0.8f;
      }
      else if(a<=20000)
      {
        Hra = a*0.25f;
        Da = a*0.9f;
     }
      else{
        Hra = a*0.3f;
        Da=a*0.95f;
      }
      System.out.println("gross salary: "+(a+Hra+Da));
    }
  }