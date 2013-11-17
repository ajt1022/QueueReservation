package reservationAssignment;

public class Node<T> {

	public T element;
	private Node link;
	
	public Node(T element, Node link){
		this.element = element;
		this.link = link;
		
	}//ends constructor
	
	public T getElement(){
		return element;
	}
	
	public void setElement(T element){
		this.element = element;
	}
	
	public Node getLink(){
		return link;
	}
	
	public void setLink(Node link){
		this.link = link;
	}
}
