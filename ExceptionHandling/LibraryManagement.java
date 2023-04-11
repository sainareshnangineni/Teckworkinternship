//Library Management System: Create classes for "Book" and "Author" that represent books and authors in a library. The Book class should have properties such as title, author, ISBN, and publisher, and methods such as getTitle, getAuthor, and setAuthor. The Author class should have properties such as name, email, and a list of books, and methods such as getName, getEmail, and addBook.
class InputException extends Exception
  {
  InputException(String message)
    {
    super(message);
    }
  }
class Books
{
String title;
String author;
String isbn;
String publisher;
void getDetails()
{
System.out.println("Book title is"+title);
  try{
    Title=s.nextLine();
  }
  catch(InputMismatchException t)
        {
    System.out.println("enter the book title in string format only");
    getdetails();
        }
System.out.println("Book authoris"+author);
  try
    {
      author=s.nextLine();
    }
  catch(InputMismatchException a)
    {
    System.out.println("enter the author name in string format only");
    getdetails();
    }
System.out.println("Book isbn is"+isbn);
  try{
    isbn=s.nextLine();
  }
  catch(InputMismatchException i)
    {
    System.out.println("enter the Isbn no  in string format only");
    getdetails();
    }
System.out.println("Book publisher is"+publisher);
   try{
    publisher=s.nextLine();
  }
  catch(InputMismatchException p)
    {
    System.out.println("enter the Publisher  in string format only");
    getdetails();
    }
} 
void setDetails()
{
System.out.println("eneter deatils of a book");
Scanner s=new Scanner(System.in);
System.out.println("eneter book title");
   try{
    Title=s.nextLine();
  }
  catch(InputMismatchException t)
        {
    System.out.println("enter the book title in string format only");
    getdetails();
        }
System.out.println("eneter book author");
  try
    {
      author=s.nextLine();
    }
  catch(InputMismatchException a)
    {
    System.out.println("enter the author name in string format only");
    getdetails();
    }

System.out.println("eneter book isbn");
  try{
    isbn=s.nextLine();
  }
  catch(InputMismatchException i)
    {
    System.out.println("enter the Isbn no  in string format only");
    getdetails();
    }
System.out.println("eneter book publisher");
   try{
    publisher=s.nextLine();
  }
  catch(InputMismatchException p)
    {
    System.out.println("enter the Publisher  in string format only");
    getdetails();
    }
}
} 
class Author
{
String name;
String email;
String[30] listofbooks;
void getDetails()
{
System.out.println("author name is"+name);
   try{
    name=s.nextLine();
  }
  catch(InputMismatchException p)
    {
    System.out.println("enter the Publisher  in string format only");
    getdetails();
    }
System.out.println("author eamil is"+email);
   try{
    email=s.nextLine();
  }
  catch(InputMismatchException p)
    {
    System.out.println("enter the Publisher  in string format only");
    getdetails();
    }
System.out.println("Books written by this autor is");
for(int i=0;i<listofbook.length;i++)
  try{
    throw newInputException("no of books should be in a custom Exception");
  }
  catch(InputMismatchException t)
    {
System.out.println(lisofbook[i]);
      getdetails();
}
}
void setDetails();
{
System.out.println("eneter deatils of an author");
Scanner s=new Scanner(System.in);
System.out.println("eneter author name");
 try
    {
      name=s.nextLine();
    }
  catch(InputMismatchException a)
    {
    System.out.println("enter the author name in string format only");
    setDetails();
    }

System.out.println("eneter author email ");
  try
    {
      email=s.nextLine();
    }
  catch(InputMismatchException a)
    {
    System.out.println("enter the author name in string format only");
   setDetails();
    }

System.out.println("eneter no of books written by this author");
  try
    {
     int n=s.nextInt();
    String listofBook[]=new String[n];
    }
  catch(InputMismatchException a)
    {
    System.out.println("enter the author name in string format only");
    setDetails();
    }
System.out.println("give names of books");
  
for(int i=0;i<n;i++)
  try{
    throw newInputException("no of books should be in a custom Exception");
    listofbooks[i]=s.nextLine();
  }
  catch(InnputMismatchException b)
    {
      System.out.println(listofbooks[i]);
      setDetails();
    }

} 
} 
class LibrayManagement
{
public static void main(String a[])
{
Books b=new Book();
b.setDetails();
b.getDetails();
Author a=new Autor();
a.getDetails();
a.getDetails();
}
}