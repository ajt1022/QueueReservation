package reservationAssignment;

import java.util.*;

public class Reservations {

	private int ID = 0, purpose = 0, partys = 0, time1 = 0, answer = 0, response, finishtime, waittime, servicetime;
	private String seat, SID;
	
	Scanner input = new Scanner(System.in);
	Random rand = new Random();
	
	Customer R = null;
	CircularQueue<Customer>everyoneQ = new CircularQueue<Customer>();
	
	//arrays
	 String nameL1 = " of Barstools", nameL2 = " of Window table 1", nameL3 = " of Booth 1";
     Seats barStool = new Seats(nameL1,12);
     Seats Window = new Seats(nameL2,6);
     Seats Booth = new Seats(nameL3,5);
	
	CircularLL Clist = new CircularLL();
	
	public Reservations(){
		reservations();
		
	}
	
	
	
	public void reservations(){
		
		finishtime = 30 * partys;
        servicetime = 15 * partys;
        
		
		//Asking whether they want to reserve, what type of seat, party size, and if so what time
        
        System.out.println("Hello, welcome to The Best Restaurant. Do you want to use the reservation/waiting system?(1 = yes, 2 = no");
        answer = input.nextInt();
        
        System.out.println("Rememer that party size of 1 will be at a barstool seat, 2 to 4 will be at booth and 5 to 6 at window.");
        
        if(answer == 1){
        
        System.out.println("Do you want a reservation? If yes type 1 and when done type 2. if you are waiting type 3 and 4 when done.");
        
       purpose = input.nextInt();
       	
       
       
       	System.out.println("The customer's ID is: ");
       	ID++;
       	System.out.println(ID);
       	System.out.println("What is your party size?");
      	 	partys =  input.nextInt();
       	System.out.println(partys);
		
		
		if(purpose == 1){
   	 	
	 		
   	 	while(partys == 1 || partys <= 6){
   	 		
   	 		//barstool
   	 		if(partys == 1){
   	 			System.out.println("Barstool is the seat. Type it(barstool)");
   	 			seat = input.next();
   	 			if(seat == "barstool")
   	 				ID++;
   	 				//TrialCust.enqueue(Cname);
   	 				System.out.println("And finally for what time?");
   	 				time1 = rand.nextInt(21)+1;
   	 				System.out.println(time1);
   	 				finishtime = 30 * partys;
	 				servicetime = 15 * partys;
	 				waittime = finishtime - time1 - servicetime;
   	 				
   	 
   	 				R = new Customer(ID + "", partys, seat, time1, waittime);
   	 				System.out.println(R);
   	 				everyoneQ.enqueue(R);
   	 				barStool.add(ID + "A");
   	 				
   	 				//ask a new customer if they want another reservation
   	 				System.out.println("\nDo you want a reservation? If yes 1 type if no type 2.");
   	 				purpose = input.nextInt();
   	 			if(purpose == 2){
					System.out.println("No reservations.");
					System.out.println(everyoneQ);
					System.out.println(barStool);
					System.out.println(Booth);
					System.out.println(Window);
   	 				break;
   	 			}
   	 			else{
   	 				System.out.println("The customer's ID is: ");
   	 				ID++;
   	 				System.out.println(ID);
   	 				
   	 				System.out.println("What is your party size?");
   	 				partys =  input.nextInt();
   	 				System.out.println(partys);
   	 				}
   	 			}
   	 		
   	 			//booth
   	 			if(partys == 2 || partys == 3 || partys == 4){
   	 				
   	 				System.out.println("Booth is the seat. Type it(booth)");
   	 				seat = input.next();
   	 				if(seat == "booth")
   	 					ID++;
   	 					ID++;
   	 					ID++;
   	 					
       	 				System.out.println("And finally for what time?");
       	 				time1 = rand.nextInt(21)+1;
   	 					System.out.println(time1);
   	 					finishtime = 30 * partys;
   	 					servicetime = 15 * partys;
   	 					waittime = finishtime - time1 - servicetime;
   	 				
       	 				R = new Customer( ID + "", partys, seat, time1, waittime);
       	 				System.out.println(R);
       	 				everyoneQ.enqueue(R);
       	 				Booth.add(ID + "A");
       	 				
       	 				//ask a new customer if they want another reservation
       	 				System.out.println("\nDo you want a reservation? If yes 1 type if no type 2.");
       	 				purpose = input.nextInt();
       	 			if(purpose == 2){
    					System.out.println("No reservations.");
    					System.out.println(everyoneQ);
    					System.out.println(barStool);
    					System.out.println(Booth);
    					System.out.println(Window);
       	 				break;
       	 	
       	 			}
       	 			else{
       	 				System.out.println("The customer's ID is: ");
       	 				ID++;
       	 				System.out.println(ID);
       	 				System.out.println("What is your party size?");
       	 				//partys = input.nextInt();
       	 				partys =  input.nextInt();
       	 				System.out.println(partys);
       	 			}
   	 			}
   	 			//window
   	 			if(partys == 5 || partys == 6){	
   	 				System.out.println("Window is the seat. Type it(window)");
   	 				seat = input.next();
   	 				if(seat == "window")
   	 					ID++;
   	 					ID++;
   	 					ID++;
   	 					ID++;
   	 					ID++;
   	 					//TrialCust.enqueue(Cname);
   	 				System.out.println("And finally for what time?");
   	 				time1 = rand.nextInt(21)+1;
	 					System.out.println(time1);
	 					finishtime = 30 * partys;
       	 				servicetime = 15 * partys;
       	 				waittime = finishtime - time1 - servicetime;
   	 
   	 				R = new Customer( ID + "", partys, seat, time1, waittime);
   	 				System.out.println(R);
   	 				everyoneQ.enqueue(R);
   	 				Window.add(ID + "A");
   	 			
   	 				
   	 				//ask a new customer if they want another reservation
   	 				System.out.println("\nDo you want a reservation? If yes 1 type if no type 2.");
   	 				purpose = input.nextInt();
   	 			if(purpose == 2){
					System.out.println("No reservations.");
					System.out.println(everyoneQ);
					System.out.println(barStool);
					System.out.println(Booth);
					System.out.println(Window);
   	 				break;
   	 			}
   	 			else{
   	 				System.out.println("The customer's ID is: ");
	 				ID++;
	 				System.out.println(ID);
   	 				
   	 				System.out.println("What is your party size?");
   	 				//partys = input.nextInt();
   	 				partys =  input.nextInt();
   	 				System.out.println(partys);
   	 			}
   	 			
   	 				
   	 		}
   	 			
   	 		
   	 	}
   	
   	
    }//end of reservations if statement
		
		
	
        }
	}//end of reservation methods
	
	/*public String Delete(){
		System.out.println("Do you want to remove someone?1 = yes, 2 = no");
		response = input.nextInt();
		if(response == 1){
			System.out.println("Pick the ID you want to remove.");
			ID = input.nextInt();
			everyoneQ.remove();
			System.out.println("The list: ");
			System.out.println(everyoneQ);
			SID = ID + "";
		//if(SID == everyoneQ.next())
			//ID = 0;
		}
		else
			if(response == 2)
				System.out.println("No need to remove.");
		System.out.println(SID);
		return  ID+"";
	}*/
	

	public String toString(){
		
		return "Reservation:[ID: " + ID + ", # of Party: "+ partys + ",time: " + time1 +",type of seat: " + seat + "]";
		
	}
	
	
}
