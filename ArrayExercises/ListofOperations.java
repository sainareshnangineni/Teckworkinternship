import java.util.*;
class ListofOperations
  {
    public static void main(String k[])
    {
      Scanner s = new Scanner(System.in);
      System.out.println("Enter the array elements:");
      int size = s.nextInt();
      int array[]=new int[size];
    System.out.println("which of the following operation would u perform:");
    System.out.println("1.Insert an element in Last index:");
    System.out.println("2.insert an element in specified index:");
    System.out.println("3.Remove element from first index:");
    System.out.println("4:Remove element from last index:");
    System.out.println("5.Remove element from specified index:");
      int option = s.nextInt();
      switch(option)
        {
          case 1:
            InsertAtFirstIndex(array,size);
            break;
          case 2:
            InsertAtLastIndex(array,size);
            break;
          case 3:
            InsertAtSpecifiedIndex(array,size);
            break;
          case 4:
            RemoveAtFirstIndex(array,size);
            break;
          case 5:
            InsertAtLastIndex(array,size);
            break;
          case 6:
            InsertAtSpecifiedIndex(array,size)
              break;
          case 7:
            InsertAtAsendingOrder(array,size);
            break;
          case 8:
            InsertAtDesendingOrder(array,size);
            break;
        }  
      static void InsertAtFirstIndex(int arr[],int size);
      {
       System.out.println("Enter the elements u want to insert");
        Scanner s = new Scanner(System.in);
        arr[0]=s.nextInt();
      }
      static void  InsertAtLastIndex(int arr[],int size);
      {
       System.out.println("Enter the elements that u want :");
        Scanner s = new Scanner(System.in);
        arr[n-1]=s.nextInt();
      }
      static void InsertAtSpecifiedIndex(int arr[],int size);
      {
       Scanner s=new Scanner(System.in);
        System.out.println("Enter the position u want enter the data:");
        position = s.nextInt();
        System.out.println("enter the  element u want to  insert the data");
        arr[position]=s.nextInt();
      }
     static void RemoveAtFirstIndex(int array,int size);
      {
        arr[0]=0;
      }
     static void InsertAtLastIndex(int array,int size);
      {
        arr[n-1]=0;
      }
      static void InsertAtSpecifiedIndex(int array,int size);
      {
        Scanner s =new Scanner(System.in);
        System.out.println("at what positionu want insert:");
        position=p.nextInt();
        arr[position]=0;
      }
     static void  InsertAtAsendingOrder(int array,int size);
      {
        
      }
       static void  InsertAtDesendingOrder(int array,int size);
      {
        
      }
    }

  }   