package reservationAssignment;

import java.util.*;


public class Waiting {
	
	private int purpose, ID, partys, time1, finishtime, waittime, servicetime, answer;
	private String seat;
	
	
	
	Scanner input = new Scanner(System.in);
	Random rand = new Random();
	
	Customer W = null;
	
	 CircularQueue<Customer>everyoneQ = new CircularQueue<Customer>();
	
	 //array
	 String nameL1 = " of Barstools", nameL2 = " of Window table 1", nameL3 = " of Booth 1";
     Seats barStool = new Seats(nameL1,12);
     Seats Window = new Seats(nameL2,6);
     Seats Booth = new Seats(nameL3,8);
	 
    
	 
	 public Waiting(){
		 waiting();
	 }
	 
	 
	public void waiting(){
		//waiting code
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
        
        
        
        
   	 	if(purpose == 3){
   	 		while(partys == 1 || purpose <= 6){
   	 			

       	 		//barstool
       	 		if(partys == 1){
       	 			System.out.println("Barstool is the seat. Type it(barstool)");
       	 			seat = input.next();
       	 			if(seat == "barstool")
       	 				ID++;
       	 				ID++;
       	 				//TrialCust.enqueue(Cname);
       	 				System.out.println("And finally for what time?");
       	 				time1 = rand.nextInt(21)+1;
       	 				System.out.println(time1);
       	 				finishtime = 30 * partys;
       	 				servicetime = 15 * partys;
       	 				waittime = finishtime - time1 - servicetime;
       	 				//custs.setWaitingTime(waittime);
       	 				System.out.printf("The wait time: %d min", waittime);
       	 				System.out.println();
       	 
       	 				W = new Customer(ID + "B", partys, seat, time1, waittime);
       	 				System.out.println(W);
       	 				everyoneQ.enqueue(W);
       	 				barStool.add(ID + "B");
       	 				
       	 				//ask a new customer if they want another reservation
       	 				System.out.println("\nDo you want to be on the waiting list? If yes 3 type if no type 4.");
       	 				purpose = input.nextInt();
       	 			if(purpose == 4){
    					System.out.println("Not on waiting list.");
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
       	 		
       	 			//booth
       	 			if(partys == 2 || partys == 3 || partys == 4){
       	 				
       	 				System.out.println("Booth is the seat. Type it(booth)");
       	 				seat = input.next();
       	 				if(seat == "booth")
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

           	 				//custs.setWaitingTime(waittime);
           	 			 	System.out.printf("The wait time: %d min", waittime);
           	 			 	System.out.println();
     
           	 				W = new Customer(ID + "B", partys, seat, time1, waittime);
           	 				System.out.println(W);
           	 				everyoneQ.enqueue(W);
           	 				Window.add(ID + "B");
           	 				
           	 				//ask a new customer if they want another reservation
           	 			System.out.println("\nDo you want to be on the waiting list? If yes 3 type if no type 4.");
           	 				purpose = input.nextInt();
           	 			if(purpose == 4){
        					System.out.println("Not on waiting.");
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
       	 					ID++;
       	 					//TrialCust.enqueue(Cname);
       	 				System.out.println("And finally for what time?");
       	 				time1 = rand.nextInt(21)+1;
   	 					System.out.println(time1);
   	 					finishtime = 30 * partys;
   	 					servicetime = 15 * partys;
   	 					waittime = finishtime - time1 - servicetime;
   	 					//custs.setWaitingTime(waittime);
   	 					System.out.printf("The wait time: %d min", waittime);
   	 					System.out.println();
       	 
       	 				W = new Customer(ID + "B", partys, seat, time1,waittime);
       	 				System.out.println(W);
       	 				everyoneQ.enqueue(W);
       	 				Window.add(ID + "B");
       	 				
       	 				//ask a new customer if they want another reservation
       	 			System.out.println("\nDo you want to be on the waiting list? If yes 3 type if no type 4.");
       	 				purpose = input.nextInt();
       	 			if(purpose == 4){
    					System.out.println("Not on waiting list.");
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
   	 		
   	 	/*System.out.println();
	 	System.out.println("The queue of waiting: ");
	 	System.out.println(waitingQ);*/
   	 	}
   	 	}//ends waiting code
	}
	
public String toString(){
		
		return "Waiting:[ID: " + ID + ", # of Party: "+ partys + ",time: " + time1 +",type of seat: " + seat + "wait time: ," + waittime + "]";
		
	}
	
	
}
