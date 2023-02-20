import java.util.*;
class TotalnoofAmount
  {
    public static void main(String[] args)
    {
      Scanner k=new Scanner(System.in);
      System.out.println("Enter the Amount:");
      int amount = k.nextInt();
      int a500,a100,a50;
      a500=a100=a50=0;
      if(amount>=500)
        a500 = amount/500;
       amount-=a500*500;
      if(amount>100)
        a100 = amount/100;
      amount-=a100*100;
      if(amount>50)
        a50=amount/50;
      amount-=a50*50;
      System.out.println("total no of notes:");
      System.out.println("500 = "+ a500);
      System.out.println("100 = "+a100);
      System.out.println("50="+a50);
      
    }
  }