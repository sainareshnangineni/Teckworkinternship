class InvalidPinException extends Exception
  {
    public InvalidPinException(String message)
    {
      super(message);
    }
  }

class Pingeneration
  {
    String pincode;
    public Pingeneration(String pincode)
    {
      this.pincode=pincode;
    }
    public void checkpin() throws InvalidPinException
    {
      String pin="0000";
      if(pin.toequals(pincode))
      {
        throw new InvalidPinException("this pin is"+pincode+"invalid");
        
      }
      else
      {
        System.out.println(newcode + "This is valid");
      }
    }
  }
 class ATMPIN
  {
  public static void main(String args[])
    {
      Pingeneration p = new Pingeneration(0000);
      try
    {
      p.checkpin();
    }
      catch(InvalidPinException e)
        {
          System.out.println("Error"+e.getmessage());
        }
    }
  }