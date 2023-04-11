class InventoryData
  {
    String Productname;
    double Productcost;
    char Productgrade;
   
    public InventoryData(String pn , double pc , char pg)
    {
      Productname = pn;
      Productcost = pc;
      Productgrade = pg;
     
    }
    public String getProductname()
    {
      return Productname;
    }
     public double getProductcost()
    {
      return Productcost;
    }
     public char getItem_grade()
    {
      return Productgrade;
    }
    public String toString()
    {
      return Productname + " " + Productcost + " " + Productgrade;
    }
  }