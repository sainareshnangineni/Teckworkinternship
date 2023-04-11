class InvalidLowercaseException extends Exception
  {
    public InvalidLowercaseException(String message) 
    {
       super(message);
    }
  }
 class Lowercase
   {
     String name;
     public Lowercase(String name)
     {
       this.name=name;
     }
     public void checkName()throws InvalidLowercaseException
     {
       char names[]=name.toCharArray();
       do
       {
         int i=0;
         if(names[i]>='A'&&names[i]<='Z')
         {
           System.out.println("this is a valid name:");
         }
         else
         {
           throw new InvalidLowercaseException("this name is invalid");
         }
         while(names.length<0);
         
       }
     }
   }
     public class PersonName
       {
         public static void main(String args[])
         {
           person p = new person("ganesh");
           person p1=new person("jai");
           try
             {
             p1.checkName();
             p.checkName();
          }
           catch(InvalidLowercaseException e)
             {
               System.out.println("Error:"+e.getMessage());
             }
       }
   }