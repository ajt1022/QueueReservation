package reservationAssignment;

import java.util.Date;

public class Customer {

    private int waitingTime;
   // private Date resArrivalTime;
    private int resArrivalTime;
    private String id;
    private int partySize;
    private String seatType;
    
    //reservation
    public Customer( String id,
                    int partySize, String seatType, int resArrivalTime, int waitingTime) {
            super();
            this.id = id;
            this.partySize = partySize;
            this.seatType = seatType;
            this.resArrivalTime = resArrivalTime;
            this.waitingTime = waitingTime;
    }
    
    public boolean equals(String id) {
            return this.id.equals(id);
    }
    
    public int getWaitingTime() {
            return waitingTime;
    }
    public void setWaitingTime(int waitingTime) {
            this.waitingTime = waitingTime;
    }
    public int getresArrivalTime() {
            return resArrivalTime;
    }
    public void setresArrivalTime(int resArrivalTime) {
            this.resArrivalTime = resArrivalTime;
    }
    public String getId() {
            return id;
    }
    public void setId(String id) {
            this.id = id;
    }
  
    public int getPartySize() {
            return partySize;
    }
    public void setPartySize(int partySize) {
            this.partySize = partySize;
    }
    public String getSeatType() {
            return seatType;
    }
    public void setSeatType(String seatType) {
            this.seatType = seatType;
    }

    @Override
    public String toString() {
            return "Customer [ waitingTime=" + waitingTime
                            + ", resArrivalTime=" + resArrivalTime + ", id=" + id
                            + ", partySize=" + partySize + ", seatType="
                            + seatType + "]";
    }
	
}
