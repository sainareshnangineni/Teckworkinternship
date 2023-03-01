import java.util.Scanner;
class ENcryption
  {
    public static void main(String args[])
    {
      Scanner s = new Scanner(System.in);
      System.out.println("Enter the string:");
      String S = new String();
       S = s.nextLine();
      int position=s.nextInt();
      String r = Encryption(S,position);
      System.out.println("message before Encryption" + S);
      System.out.println("message after convertion" + r);
       String b=Decryption(S,position);
       System.out.println("message before convertion"+ S);
      System.out.println("message after convertion" + b);
        
    }
    public static String Encryption(String s,int p)
    {
      String result = " ";
      for(int i=0;i<s.length();i++)
        {
         result=result+(s.charAt(i)+p%26);
        }return result;
    }
    public static String Decryption(String s,int p)
    {
      String result1=" ";
      for(int i=0;i<s.length();i++)
        {
          result1= result1+(char)(charAt(i)-position%26);
        } return result1;
    }
  }