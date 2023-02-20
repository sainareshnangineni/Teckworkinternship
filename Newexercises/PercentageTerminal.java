import java.util.Scanner;
class PercentageTerminal
  {
    public static void main(String args[])
    {
      float percentage,total_marks,scored;
      Scanner s = new Scanner(System.in);
      System.out.println("Enter your marks:");
      scored = s.nextFloat();
      System.out.println("Enter total marks:");
      total_marks = s.nextFloat();
      percentage =(float)((scored=total_marks)*100);
      System.out.println("Percentage is:"+  percentage);
      
    }
  }