import java.util.*;
class ListtoMap
  {
    public static void main(String args[])
    {
    list<Integer> l=new ArrayList<>();
    l.add(1);
    l.add(2);
     l.add(4);
      Iterator i=l.iterator();
      while(i.hasNext())
      {
        System.out.println(i.next());
      }
      Map<Integer> m = new HashMap<>(l);
     Iterator i=m.iterator();
      while(i.hasNext())
      {
        System.out.println(i.next());
      }
    }
  }