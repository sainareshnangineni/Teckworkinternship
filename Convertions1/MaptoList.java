class MaptoList
  {
    public static void main(String args[])
    {
      Map<String> m = new HashMap<>();
      m.put("sai");
      m.put("naresh");
      m.put("vasu");
      while(i.hasNext())
      {
        System.out.println(i.next());
      }
      ArrayList<String> A = new ArrayList<>(m.keySet());
       Iterator i = A.iterator();
      while(i.hasNext())
        {
      System.out.println(i.next());
        }
    }
  }