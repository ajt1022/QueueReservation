package reservationAssignment;
import java.util.Iterator;

public interface QueueInterface<T> extends Iterator<T> {

	public boolean enqueue(T element);
	
	public T dequeue() throws QueueUnderflowException; 
	
	public int Size();
	
}
