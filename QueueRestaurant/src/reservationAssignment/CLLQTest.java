package reservationAssignment;

import java.util.*;


public class CLLQTest {

	 public static void main(String[] args) throws QueueUnderflowException {
         // TODO Auto-generated method stub
         
		 String customer= "yes", seat;
		 int time1, purpose = 0, partys=0, answer = 0, finishtime, servicetime, waittime=0, ID=0;
		 Scanner input = new Scanner(System.in);
		
		 //arrays and names for the 3 different type of seats
	
         Reservations reser = new Reservations();
         Waiting wait = new Waiting();
         
         
         CircularQueue<Customer> waitingQ = new CircularQueue<Customer>();
         CircularQueue<Customer> reservationQ = new CircularQueue<Customer>();
         
         //trial
         CircularQueue<String> TrialCust = new CircularQueue<String>();
         CircularQueue<Customer>everyoneQ = new CircularQueue<Customer>();
         
         Customer custs = null;
         Date Time;  	
      
        	System.out.println(reser);
        	System.out.println(wait);
        	
       	 	
       	 	
    	 	
      /*   q.enqueue(1);
         q.enqueue(2);
         q.enqueue(3);
        */
        /* for(int trial=0; trial <= 10; trial++){
          System.out.println("Enter first name of customer:");
          firstN = input.nextLine();
        	 p.enqueue(firstN);
 
 */
   //      }
     /*    System.out.println(q.toString());
         System.out.println(p);
         q.dequeue();
        // System.out.println(p.dequeue());
         System.out.println(q.dequeue());
        System.out.println(q.Size());
        System.out.println(p.Size());
     //   System.out.println(p);
        q.remove(1);
      //  p.remove("Gary");
        System.out.println(q);
        System.out.println(p);
       */
       // System.out.println(Seats.Barstools());
         /*LinkedList alist = new LinkedList();
         alist.add("A");
         alist.add("B");
         System.out.println(alist.iterator().hasNext());
         System.out.println(alist.iterator().next());
         System.out.println((alist.iterator().next());
         */
        
     
        
      /* Booth1.add("Geoff");
        Booth1.add("Micheal");
        Booth1.add("Ray");
        Booth1.add("Jack");
        */
        
      //  System.out.println(barStool);
       // System.out.println(Window1);
      //  System.out.println(Booth1);
      
        
       
       // Random rand = new Random();
        int opentime = 9;
        int closetime = 21;
        int time = 9;
        int count = 0;
        int trafficPercent = 50;
        

       /* while ((time >= opentime) && (time <= closetime)) {
                int cusArrival = rand.nextInt(100);
                if (cusArrival <= trafficPercent) {
                        Customer aCust;
                        count++;
                        // reservation=0
                        if (rand.nextInt(2) == 1) {
                                aCust = new Customer("Eric", count + "", "eric123", 5,
                                                Seats.SeatCat.WINDOWS, new Date());
                                reservationQ.enqueue(aCust);
                        } else {
                                // waiting list =1
                                aCust = new Customer("Eric", count + "", "", 5,
                                                Seats.SeatCat.WINDOWS, new Date());
                                waitingQ.enqueue(aCust);
                        }
                }
                time++;
        }
        
        
        System.out.println(reservationQ);
        System.out.println(waitingQ);
        Customer searchCust = new Customer("Eric", 1+"" + "", "", 5,
                        Seats.SeatCat.WINDOWS, new Date());
        System.out.println(reservationQ.contains(searchCust));
        System.out.println(waitingQ.contains(searchCust));
 */
 }
	
	
}





