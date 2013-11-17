package reservationAssignment;

import java.util.Iterator;

public class CircularLL<T> implements Iterator<T> {

	Node front, rear;
	
	public CircularLL(){
		front = null;
		rear = null;
	}
	
	
	 @Override
     public boolean hasNext() {
             Node next = null;

             if(!isEmpty()) {
                     System.out.println( next);
                     return true;
             } else
                     return next!=rear;
             
             
     }

     @Override
     public T next() {
             // TODO Auto-generated method stub
             return null;
     }

     @Override
     public void remove() {
             // TODO Auto-generated method stub
             
     }
     
     public boolean isEmpty() {
             return front==null;
     }
	
	
}
