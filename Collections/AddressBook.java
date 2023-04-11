import java.util.*;
class AddressBook
  {
    public static void main(String args[])
    {
       HashMap <String,Integer> hm = new HashMap <  > ();
       
    }
    class AddressData
      {
        String personname;
        String houseno;
        String Streetname;
        int pincode;
        AddressData(String name,String no,String sname,int pin)
        {
          this.personname=name;
          this.houseno=no;
          this.Streetname=sname;
          this.pincode=pin;
        }
        public String getPersonname()
        {
          return personname;
        }
        public String gethouseno()
        {
          return houseno;
        }
        public String getStreetname()
        {
          return Streetname;
        }
        public Int getpincode
        {
          return pincode;
        }
      }
  }