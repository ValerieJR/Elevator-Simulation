package org.example.elevator_simulation.src;

import java.util.ArrayList;
import java.util.Random;

public class Floor{
    private String floorName;
    private int numOfElevators;
    private ArrayList<Person> passengerComplete = new ArrayList<Person>();
    private ArrayList<Person> waitingQueue = new ArrayList<Person>();
    private ArrayList<Elevator> elevators = new ArrayList<Elevator>();
    private SimulationSettings sm ;
    Floor(String floorName, SimulationSettings _sm)
    {
        this.floorName = floorName;
        this.passengerComplete = new ArrayList<>();
        this.waitingQueue = new ArrayList<>();
        this.elevators = new ArrayList<>();
        this.sm = _sm;

    }


    public void addPersonToFloor(int i, int startFloor){
        for( i = 0 ; i<5; i++){
            Random rnd = new Random();
            double prop = rnd.nextDouble(100);

            if(prop >=sm.passenger_request_percentage.get(0).percentage){
                waitingQueue.add(new Staff(startFloor, rnd.nextInt(29)+1, sm.passenger_request_percentage.get(1).passengerType, sm));
                waitingQueue.get(i).setPersonType(sm.passenger_request_percentage.get(1).passengerType);
                System.out.println(waitingQueue.get(i).toString());
            }
            else if (prop < sm.passenger_request_percentage.get(0).percentage) {
                waitingQueue.add(new Patient(startFloor, rnd.nextInt(29)+1, sm.passenger_request_percentage.get(0).passengerType, sm));
                waitingQueue.get(i).setPersonType(sm.passenger_request_percentage.get(0).passengerType);
                System.out.println(waitingQueue.get(i).toString());
            }
        }
    }

    public void generateElevators(){
        System.out.println("Elevators are being generated");
        for(int i = 0; i< numOfElevators; i++){

            if(i%2 == 0) {
                elevators.add(new Standard(this.sm));
                elevators.get(i).setElevatorType(sm.elevator_request_percentage.get(0).elevatorType);
                System.out.println("Elevator Type " + elevators.get(i).getElevatorType() + " created");
            }
            else {
                elevators.add(new Express(this.sm));
                elevators.get(i).setElevatorType(sm.elevator_request_percentage.get(1).elevatorType);
                System.out.println("Elevator Type " + elevators.get(i).getElevatorType() + " created");
            }
        }
    }
    public void setNumOfElevators(int numOfElevators) {
        this.numOfElevators = numOfElevators;
    }

    public int getNumOfElevators() {
        return numOfElevators;
    }

    public void setWaitingQueue(ArrayList<Person> waitingQueue) {
        this.waitingQueue = waitingQueue;
    }

    public ArrayList<Person> getWaitingQueue() {
        return waitingQueue;
    }

    public void setElevators(ArrayList<Elevator> elevators) {
        this.elevators = elevators;
    }

    public ArrayList<Elevator> getElevators() {
        return elevators;
    }

    public void setPassengerComplete(ArrayList<Person> passengerComplete) {
        this.passengerComplete = passengerComplete;
    }

    public ArrayList<Person> getPassengerComplete() {
        return passengerComplete;
    }

    public void setFloorName(String floorName) {
        this.floorName = floorName;
    }

    public String getFloorName() {
        return floorName;
    }



}
