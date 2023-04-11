class InvalidCharecterException extends Exception
  {
    public  InvalidCharecterException(String message)
    {
      super(message);
    }
  }
class person
  {
   
   public void checkcharecter()
    {
      if(arr[0]==0)
      {
       throw new InvalidCharecterException(arr[0]+"is an  Alphabet");
      }
     System.out.println(arr[0]+"is not an alphabet");
    }
  }
 class main
  {
  public static void main(String args[])
    {
      Scanner s=new Scanner(System.in);
      System.out.println("Enter the String:");
      String str = new String();
      str = s.nextString();
      char arr[]=new char[str];
      for(int i=0;i<str.length;i++)
        {
          arr[i]=s.next.charAt(0);
          System.out.println("Array of string is:"+arr[i]);
        }
      person sai=new person();
      try
        {
        sai.checkcharecter();
        }
      catch (InvalidCharecterException e)
        {
          System.out.println("charecter is"+e.getmessage());
        }
     }
  }