import java.util.*;
class StringMethods
  {
    public static void main(String s[])
    {
      String sai=new String();
      Scanner k=new Scanner(System.in);
      System.out.println("Enter the string:");
      sai=k.nextLine();
      System.out.println(sai);
      //how we retrive the entire string value
      System.out.println(sai.charAt(3));
System.out.println(sai.split(" "));
      String saiarr[]=sai.split(" ");
    for(int i=0;i<sai.length;i++)
      System.out.println(saiarr[i]);
      //s.length(method)
      System.out.println(sai.length());//storing the purpose value in some variable
      int length=sai.length();
      System.out.println(length);
      //concat(method)
      System.out.println(sai.concat("hai"));
      String naresh="hello";
      System.out.println(sai.concat(naresh));
      //addition of string
      System.out.println(sai+"hai");
      System.out.println(sai+5);
      //to string
      System.out.println(sai.toString());
      Stringexam f=new Stringexample();
      System.out.println(f.toString());
      //charAt
      System.out.println(sai.charAt(4));
      //getchars
      char a[]=new char[10];
      sai.getchars(3,7,a,1);
      System.out.println(a);
      for(int i=0;i<a.length;i++)
        System.out.println(p[a]);
      //getBytes
      byte b[]=new char[10];
      b.getBytes();
      for(int i=0;i<b.length;i++)
        System.out.println(b[i]);
    //--------------------------
    //'------------------------'
     // String comparisions
    System.out.println("Enter the first string:");
      String s = new String(scanner.in);
      System.out.println(string1.compare(string2));
      //Equalsmethod()
      System.out.println(string1.equals(string2));
      //==method
    System.out.println(string1==string2);
      String s1="hello";
      String s2="kiya";
      System.out.println(s1==s2);
      System.out.println(s1.startswith("1"));
      System.out.println(s1.endswith("dl"));
      //equalsignoreCase(method)
      System.out.println(s1.equalsIgnoreCase(s2));
      //Searching(method)
      System.out.println(s1.Index('z'));
      System.out.println(s1.lastIndex('z'));
      //conversions
      System.out.println(s1.subtring(2));
            System.out.println(s1.subtring(2,3));
            System.out.println(s1.replace('2','3'));

    }
  }