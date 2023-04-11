import java.util.*;
class MaptoSet
  {
    public static void main(String args[])
    {
    Map<Integer,String> m = new HashMap<>();
     m.put(1,"sai");
      m.put(2,"naresh");
      m.put(3,"ganesh");
    Set<String> s=new HashSet<>(m.KeySet());
      System.out.println("Set s is:"+s);
    
    }
 
  }