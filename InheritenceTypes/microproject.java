class Shape
  {
   String colour;
    double s1;
    double s2;
    Shape(String colour,double s1,double s2)
    {
      this.colour = colour;
      this.s1 = s1;
      this.s2 = s2;
    }
      void getdetails()
        {
        System.out.println(s1+" "+s2);
        }
  }
  
  
class rectangle extends Shape//for rectangle
{
  double rectanglearea;
  rectangle(double s1,double s2)
  {
    super();
    this.s1 =s1;
    this.s2=s2;
   
  }
  void getdetails()
  {
    System.out.println(rectanglearea);
  }
  void calculatearea()
  {
    double rectanglearea;
    rectanglearea=s1+s2;
    System.out.println(rectanglearea);
  }
}
class triangle extends Shape//for triangle
{
  double trianglearea;
  triangle(double s1,double s2)
  {
    super();
    this.s1 = s1;
    this.s2 = s2;
  }
  void getdetails()
  {
    System.out.println(trianglearea);
  }
  void calculatearea()
  {
    double trianglearea;
    trianglearea=1/2*s1*s2;
    System.out.println(trianglearea);
  }
}
class circle extends Shape//for circle
{
   double pi = 3.14;
  double circlearea;
  circle(double d,double pi)
  {
    super();
    this.s1 = d;
    this.s2=pi;
  }
  void getdetails()
  {
    System.out.println(circlearea);
  }
}
   void calculatearea()
     {
     double circlearea;
     circlearea=s1*s2;
     System.out.println(circlearea);
     }
  }
class shapetester
  {
    public static void main(String args[])
    {
      Scanner s = new Scanner(System.in);
      double  s1 = s.nextDouble();
      double s2 = s.nextDouble();
      shape c = new shape(colour,s1,s2);
      c.getdetails();
      rectangle r = new rectangle(s1,s2);
      r.claculatearea();
      triangle g = new triangle(s1,s2);
      g.calculatearea();
      circle b = new circle(d,pi);
      b.claculatearea();
    }
  }