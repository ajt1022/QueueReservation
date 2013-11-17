package reservationAssignment;

public class Seats implements ArrayInterface{

	private String name;
	private String[] list;
	private int lastIndex = -1;
	
	
	public Seats(String name, int maxSize){
		list = new String[maxSize];
		this.name = name;
	}
	
	public Seats(String name){
		list = new String[100];
		this.name = name;
	}
	
	@Override
	public void add(Object element) {
		// TODO Auto-generated method stub
		lastIndex++;
		list[lastIndex] = (String) element;
	}

	@Override
	public boolean isFull() {
		// TODO Auto-generated method stub
		if(lastIndex == (list.length - 1))
			return true;
		else
			return false;
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return (lastIndex+1);
	}

	@Override
	public boolean contains(Object element) {
		// TODO Auto-generated method stub
		int location = 0;
		while(location <= lastIndex){
			if(( (String) element).equalsIgnoreCase(list[location]))
				return true;
			else
				location++;
		}
		return false;
	}

	@Override
	public void clear() {
		// TODO Auto-generated method stub
		for(int i = 0; i <= lastIndex; i++){
			list[i] = null;
		}
		lastIndex = -1;
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return name;
	}
	
	

	@Override	 
	public String toString(){
		String SeatList = "List" + name + "\n\n";
		
		for(int i =0; i <= lastIndex; i++){
			SeatList = SeatList + (i+1) + ". " + list[i] + "\n";
		}
		return SeatList;
	}
	 
}
