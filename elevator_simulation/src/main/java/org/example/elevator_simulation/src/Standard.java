package org.example.elevator_simulation.src;

import java.util.ArrayList;

public class Standard extends Elevator{
    Standard(SimulationSettings _sm)
    {
        this.sm = _sm;
        STANDARDCAPACITY = sm.add_elevator.get(0).maximumCapacity;
    }
    private SimulationSettings sm;
    protected int STANDARDCAPACITY;

    @Override
    public void movePassengers(int floor, ArrayList<Person> currPassengers) {
        currPassengers.addAll(getCurrPassengers());
        getCurrPassengers().clear();

    }

    @Override
    public void passengersOff(int floor, ArrayList<Person> passengersComplete) {
        //int count = 0;
        for(int i =0; i < getCurrPassengers().size(); i++){
            if(getCurrPassengers().get(i).getEndFloor() == floor){
                passengersComplete.add(getCurrPassengers().get(i));
                getCurrPassengers().remove(i);
                i = i-1;
                //count = count + 0;
            }
        }
        // return count;
    }

    @Override
    public void addPersonsToElevator(ArrayList<Person> waitingQueue, int l){
        if(waitingQueue.get(l).getPersonType().equals(sm.passenger_request_percentage.get(0).passengerType)){
            System.out.println("Adding " +  waitingQueue.get(l) + " to standard elevator");
            getCurrPassengers().add(waitingQueue.get(l));
        }

    }
    @Override
    public ArrayList<Person> getCurrPassengers() {
        return super.getCurrPassengers();
    }
}