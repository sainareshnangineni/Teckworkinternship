//Convertion from array list to linkedlist
class ArraylistToLinked
  {
    public static void main(String args[])
    {
      ArrayList<String> l= new ArrayList();
      l.add("sai");
      l.add("ganesh");
      l.add("man");
      l.add("human");
       Iterator i=l.iterator();
      while(i.hasNext())
      {
        System.out.println(i.next());
      }
      LinkedList l1=new LinkedList(l);
      Iterator i1=l1.iterator();
      while(i1.hasNext())
        {
          Systemout.println(i1.next());
        }
    }
  }