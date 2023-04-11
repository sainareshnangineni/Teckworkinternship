import java.util.*; class Student {
  String name;
  String id;
  int totalmarks;   Student(String name, String id, int totalmarks) {
    this.name = name;
    this.id = id;
    this.totalmarks = totalmarks;
  }   public String getName() {
    return name;
  }   public String getId() {
    return id;
  }   public int getTotalmarks() {
    return totalmarks;
  } } class ArrayListExample {
  public static void main(String k[]) {     ArrayList<Student> ar1 = new ArrayList<Student>();
    // creating list of students
    ar1.add(new Student("aaa", "123", 67));
    System.out.println(ar1.getName());
    System.out.println(ar1.getId());
    System.out.println(ar1.getTotalMarks());     // heterogenous type
    ArrayList<Object> ar2 = new ArrayList<Object>();
    ar2.add(45);
    ar2.add(46);
    ar2.add(46.346564);   }
}