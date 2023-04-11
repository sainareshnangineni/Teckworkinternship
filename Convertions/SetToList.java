//convertion from set to list
class SetToList
  {
    public static void main(String args[])
    {
      Set<String> s = new HashSet<>();
      s.add("sai");
      s.add("hi");
      s.add("ganesh");
      s.add("jay");
      List<String> l=new ArrayList<>(s);
      Iterator i = l.iterator();
      while(i.hasNext())
        {
      System.out.println(i.next());
        }
    }
  }