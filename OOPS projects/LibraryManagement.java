//Library Management System: Create classes for "Book" and "Author" that represent books and authors in a library. The Book class should have properties such as title, author, ISBN, and publisher, and methods such as getTitle, getAuthor, and setAuthor. The Author class should have properties such as name, email, and a list of books, and methods such as getName, getEmail, and addBook.
class Books
{
String title;
String author;
String isbn;
String publisher;
void getDetails()
{
System.out.println("Book title is"+title);
System.out.println("Book authoris"+author);
System.out.println("Book isbn is"+isbn);
System.out.println("Book publisher is"+publisher);
} 
void setDetails()
{
System.out.println("eneter deatils of a book");
Scanner s=new Scanner(System.in);
System.out.println("eneter book title");
title=s.nextLine();
System.out.println("eneter book author");
author=s.nextLine();
System.out.println("eneter book isbn");
isbn=s.nextLine();
System.out.println("eneter book publisher");
publisher=s.nextLine();
} } 
class Author
{
String name;
String email;
String[30] listofbooks;
void getDetails()
{
System.out.println("author name is"+name);
System.out.println("author eamil is"+email);
System.out.println("Books written by this autor is");
for(int i=0;i<listofbook.length;i++)
System.out.println(lisofbook[i]);
}
void setDetails();
{
System.out.println("eneter deatils of an author");
Scanner s=new Scanner(System.in);
System.out.println("eneter author name");
name=s.nextLine();
System.out.println("eneter author email ");
email=s.nextLine();
System.out.println("eneter no of books written by this author");
int n=s.nextInt();
listofBook[]=new String[n];
System.out.println("give names of books")
for(int i=0;i<n;i++)
listofbooks[i]=s.nextLine();
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