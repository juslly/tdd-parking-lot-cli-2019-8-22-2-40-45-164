package com.oocl.cultivation;

import java.util.HashMap;
import java.util.Map;

public class ParkingLot {
    private final int capacity;
    private Map<ParkingTicket, Car> cars = new HashMap<>();

    public ParkingLot() {
        this(10);
    }

    public ParkingLot(int capacity) {
        this.capacity = capacity;
    }
    
    

    public int getAvailableParkingPosition() {
        return capacity- cars.size();
    }

	public ParkingTicket park(Car car) {
		if(capacity > 1) {
			ParkingTicket ticket = new ParkingTicket();
			cars.put(ticket, car);
			// TODO Auto-generated method stub
			return ticket;
			
		}else {
			return null;
		}
		
	}

	public Car fetch(ParkingTicket ticket) {
		// TODO Auto-generated method stub
		if(cars.containsKey(ticket)) {
			if(cars.get(ticket) == null) {
				return null;	
			}
			Car car = cars.get(ticket);
			cars.remove(car);
			return car;
		}else {
			return null;
		}
	
	}


}
