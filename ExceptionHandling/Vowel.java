class InvalidWordException extends Extension
  {
    public InvalidWordException(String message)
    {
      super(message);
    }
  }
class WordTest
  {
    String word;
    void add()
    {
      System.out.println("enter the word");
      Scanner sc = new Scanner(System.in);
      try
        {
          for(int i=0;i<word.length;i++)
          if((word.charAt(i)>='A' && word.charAt(i)<='Z')||(word.charAt(i)>='a' && word.charAt(i)<='z'))
            word=sc.nextLine();
          
        }
      catch(InputMismatchException e)
        {
          System.out.println("Enter the input in the String format only");
          add();
        }
    
    void testword()
      {
      int count=0;
      String str = word.toLowerCase();
      for(int i=0;i<str.length();i++)
        {
          if(str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u')
          {
           count++;
          }
        }
      try{
        if(count>=3)
        {
          System.out.println("every word has Atleast 3 vowels");
        }
      }
      catch(InvalidWordException q)
        {
          System.out.println("Error"+q.getmessage());
        }
      }
 }
    class main
      {
        public static void main(String args[])
        {
          WordTest c = new WordTest[5];
          for(int i=0;i<6;i++)
            {
              c[i]=new WordTest();
              c[i].add();
              c[i].testword();
            }
          
        }
      }