package com.oocl.cultivation;

public class ParkingBoy {

    private final ParkingLot parkingLot;
    private String lastErrorMessage;

    public ParkingBoy(ParkingLot parkingLot) {
        this.parkingLot = parkingLot;
    }

    public ParkingTicket park(Car car) {
        // TODO: Please implement the method
    	ParkingTicket ticket = parkingLot.park(car);
		return ticket;
    	
       // throw new RuntimeException("Not implemented");
    }

    public Car fetch(ParkingTicket ticket) {
        // TODO: Please implement the method
    	if(ticket == null){
			return null;
		}else {
				Car car = parkingLot.fetch(ticket);
				return car;	
		}
    	
       // throw new RuntimeException("Not implemented");
    }

    public String getLastErrorMessage() {
    	ParkingTicket ticket =  new ParkingTicket();
    	Car car = parkingLot.fetch(ticket);
    	if(ticket == null) {
			return "The parking lot is full";
	    }	
    	if(car == null) {
    	    return "Please provide your parking ticket.";
	
    	}else {
    		 return "null";
    	}
       
    }
}
