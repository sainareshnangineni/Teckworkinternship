import java.util.*;
class sumof1tonEvennos
  {
    public static void main(String args[]){
   Scanner s = new Scanner(System.in);
   int no,i,sum=0;
    System.out.println("Enter the no:");
   no = s.nextInt();
    for(i=1;i<=no;i++)
      {
        if(i%2==0){
          sum=sum+i;
        }
      }
      System.out.println("sum of even nos"+no+"="+sum);
    } 
  }