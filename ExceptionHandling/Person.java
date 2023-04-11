import java.util.Scanner;
class InvalidNameException extends Exception
  {
    public InvalidNameException(String message)
    {
      super(message);
    }
  }
class Person
  {
    String name;
    public Person(String name)
    {
      this.name = name;
    }
    public void checkName() throws InvalidNameException
    {
      char s[] = new char[name.length()];
     for(int i=0;i<i+1;i++)
     {
      if(s[i] == 'A' && s[i] == 'E'  && s[i] == 'I'  && s[i] == 'O'  && s[i] == 'U'  && s[i] == 'a'  && s[i] == 'e'  && s[i] == 'i'  && s[i] == 'o'  && s[i] == 'u')
      {
        System.out.println("this is the valid name:");
      }
      else
      {
       throw new InvalidNameException("this name is " + name + " not valid ");
      }
    }
    }
  }
public class Personnamevowel
  {
    public static void main(String args[])
    {
     
      Person p = new Person("naresh");
      try
        {
          p.checkName();
        }
      catch (InvalidNameException e)
        {
          System.out.println("ERROR:" + e.getMessage());
        }
    }
  }