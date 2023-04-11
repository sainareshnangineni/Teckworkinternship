//convertion from list to set
import java.util.*;
class ListToSet
  {
    public static void main(String args[])
    {
      ArrayList<String> l=new ArrayList<>();
      l.add("data");
      l.add("naresh");
      l.add("madam");
      Set<String> hashset = new HashSet<>(l);
      for(String value:hashSet)
        {
          System.out.println(value);
        }
    }
  }