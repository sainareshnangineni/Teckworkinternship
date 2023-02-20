import java.util.*;
class SubjectGrade
  {
    public static void main(String l[])
    {
      Scanner s =new Scanner(System.in);
      int ph,ch,bi,math,com,S;
      System.out.println("Enter the  ph,ch,bi,math,com:");
      ph = s.nextInt();
      ch = s.nextInt();
      bi = s.nextInt();
      math = s.nextInt();
      com= s.nextInt();
      S = (ph,ch,bi,math,com)/5;
      if(S>=90)
      {
        System.out.println("Grade 'A':");
       else if(S>=80)
      {
            System.out.println("Grade 'B':");  
      }
      else if(S>=70)
      {
              System.out.println("Grade 'C':");
      }
      else if(S>=60)
      {
              System.out.println("Grade 'D':");
      }
      else if(S>=50)
      {
              System.out.println("Grade 'E':");
      }
      else if(S<=40)
      {
              System.out.println("Grade 'F':");
      }
      }
      
    }
  }