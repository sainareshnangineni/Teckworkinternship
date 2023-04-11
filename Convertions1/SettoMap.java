import java.util.*;
class SettoMap
  {
    public static void main(String args[])
    {
      Set<String> s = new HashSet<>();
      s.add("sai");
      s.add("hi");
      s.add("ganesh");
      s.add("jay");
      Map<Integer> m = new HashMap<>(s);
       Iterator i=m.iterator();
      while(i.hasNext())
      {
        System.out.println(i.next());
      }
    }
    }
  }