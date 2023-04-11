class QueueOperations
  {
    public static void main(String args[])
    {
      Queue<Integer> Q = new LinkedList<Integer>();
      Q.add(20);
      Q.add(35);
      Q.add(30);
      System.out.println("Queue: "+Q);
      System.out.println("Queue:"+Q.remove());
      System.out.println("Queue:"+Q.remove());
    
    }
  }