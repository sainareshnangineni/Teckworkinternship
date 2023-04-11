class PatientData
  {
    String Name;
    int age;
    String Problem;
    PatientData(String Name,int age,String Problem)
    {
      this.Name=Name;
      this.age=age;
      this.Problem=Problem;  
    }
	public String getName() 
    {
		  return Name;
	  }
	public int getAge() 
    {
		  return age;
    }
	public String getProblem() 
    {
		  return Problem;
	  }
    public String toString()
    {
      return "Name: "+ " "+ getName()+ "Age: "+ getAge()+" "+"Problem: "+" "+getProblem();
    }
}