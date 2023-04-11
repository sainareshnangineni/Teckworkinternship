import java.util.*;
class ArrayList
  {
    public static void main(String args[])
    {
      ArrayList ar1=new ArrayList();
      ArrayList<Integer> ar1 = new ArrayList<Integer>();//homogeneous data
      //hetrogeneous data
      ArrayList<object>ar1=new ArrayList<object>ArrayList ar2 = new ArrayList<object>(7);
      ar1.add(10);
      ar1.add(20);
      System.out.println(ar1);
      ar2.add(30);
      ar2.add(36);
      ar2.add(30);
      System.out.println(ar2);
      System.out.println(ar2.remove(36));
      System.out.println(ar2.get(36));
System.out.println(ar2.indexOf(36));
      System.out.println(ar2.set(2,45));
    }
  }