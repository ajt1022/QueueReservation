package reservationAssignment;
import java.util.Collection;
import java.util.Iterator;

public class CircularQueue<T> implements QueueInterface<T>  {

	Node rear, front, current, previous;
	T element;
	
	
	public CircularQueue(){
		rear = null;
		front = null;
	}
	
	
	
	@Override
	public boolean enqueue(T element){
	      Node<T> newNode = new Node<T>(element, null);
          if(isEmpty()) {
                  rear = newNode;
          } else {
                  newNode.setLink(rear.getLink());
          }
          rear.setLink(newNode);
          rear = newNode;

          return true;
	}
	
	public boolean isEmpty() {
		 
		return rear==null;
		
	}



	@Override
	public T dequeue() throws QueueUnderflowException{
		Node current;
		
		if(isEmpty())
			throw new QueueUnderflowException("Dequeue attempted on empty queue.");
		else
		{
			
			//problem here 1
			current = rear.getLink();
			current.setLink(current.getLink());
			element = (T) current.getElement();
			front = current;
			
			
			return element;
		}
	}//ends dequeue
	
	@Override
	public int Size(){
		int count = 1;
		Node currentNode;
		currentNode = rear.getLink();
		while (currentNode != null && currentNode  != rear ){
			count++;
			currentNode = currentNode.getLink();
			
		}
		return count;
	}

	@Override
	public boolean hasNext() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public T next() {
		// TODO Auto-generated method stub
		return null;
	}

	
    public boolean contains(Object element) {
            boolean found=false;
            current = rear.getLink();
            previous = rear;
            do {
                    if (current.getElement().equals(element)) {
                            found = true;
                            break;
                    } else if (current==rear) {
                            found = false;
                    }
                    previous = current;
                    current = current.getLink();
            } while(current!=rear.getLink());
            return found;
    }
	
	
	public boolean remove(Object element) {
		boolean found = true;
        if(contains(element)) {
                
                if(current == rear){
                //last
                        rear = previous;                                
                }
                 // between
                        previous.setLink(current.getLink());
                
        } else {
                found = false;
        }
        return found;


	}
	
	public String toString() {
        String list = "[";
        Node current = rear.getLink();
        do {
                if (current==rear) {
                        list += current.getElement() + "]";
                } else {
                        list += current.getElement() + ", ";        
                }
                current = current.getLink();
        } while(current!=rear.getLink());

        return list;
}



	@Override
	public void remove() {
		// TODO Auto-generated method stub
		
	}
	
	
}
