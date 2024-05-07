package org.example.elevator_simulation.src;

import java.util.ArrayList;

public class Express extends Elevator{
    SimulationSettings sm ;
    protected  int EXPRESSCAPACITY ;
    Express(SimulationSettings _sm)
    {
        this.sm = _sm;
        EXPRESSCAPACITY = sm.add_elevator.get(1).maximumCapacity;
    }
    @Override
    public void movePassengers(int floor, ArrayList<Person> currPassengers/*, ArrayList<Floor> floors*/) {
        currPassengers.addAll(getCurrPassengers());
        getCurrPassengers().clear();
        /**  if(direction.UP == this.getCurrentDirection()){
         currPassengers.addAll(getCurrPassengers());
         getCurrPassengers().clear();








         }
         else if(this.getCurrentDirection() == direction.DOWN)
         {

         }
         else{

         }*/

    }

    @Override
    public void passengersOff(int floor, ArrayList<Person> passengersComplete) {
        // int count = 0;
        for(int i =0; i < getCurrPassengers().size(); i++){
            if(getCurrPassengers().get(i).getEndFloor() == floor){
                passengersComplete.add(getCurrPassengers().get(i));
                getCurrPassengers().remove(i);
                i = i-1;
                // count = count + 1;
            }
        }
        // return count;
    }



    @Override
    public void addPersonsToElevator(ArrayList<Person> waitingQueue, int l){
        if(waitingQueue.get(l).getPersonType().equals(sm.passenger_request_percentage.get(1).passengerType)){
            System.out.println("Adding " +  waitingQueue.get(l) + " to express elevator");
            getCurrPassengers().add(waitingQueue.get(l));
        }
    }
    @Override
    public ArrayList<Person> getCurrPassengers() {
        return super.getCurrPassengers();
    }
}



