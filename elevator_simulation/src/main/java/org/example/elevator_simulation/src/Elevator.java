package org.example.elevator_simulation.src;

import java.util.ArrayList;

enum direction {
    UP,
    DOWN,
    IDLE
}
public abstract class Elevator {
    private int currFloor;
    private direction currentDirection ;
    private String elevatorType;
    private ArrayList<Person> currPassengers = new ArrayList<Person>();

    public abstract void movePassengers(int floor, ArrayList<Person> currPassengers);
    public abstract void passengersOff(int floor, ArrayList<Person> passengersComplete);

    public ArrayList<Person> getCurrPassengers() {
        return currPassengers;
    }

    public void setElevatorType(String elevatorType) {
        this.elevatorType = elevatorType;
    }

    public String getElevatorType() {
        return elevatorType;
    }
    public abstract void addPersonsToElevator(ArrayList<Person> waitingQueue, int l);

    public direction getCurrentDirection() {
        return currentDirection;
    }

    public void setCurrentDirection(direction currentDirection) {
        this.currentDirection = currentDirection;
    }


    private static void addStaffToElevator(ArrayList<Person> waitingQueue, ArrayList<Elevator> elevators, int k, int i, int j) {
        if (waitingQueue.get(k).getEndFloor() >= k) {
            elevators.get(j).addPersonsToElevator(waitingQueue, k);
            waitingQueue.remove(k);
            System.out.println("Waiting Queue");
            System.out.println(waitingQueue);
            System.out.println();

            /**if (building.getFloors().get(i - 1).getWaitingQueue().get(l).getEndFloor() >= l) {
             building.getFloors().get(i - 1).getElevators().get(j).addPersonsToElevator(building.getFloors().get(i - 1).getWaitingQueue(), l);
             building.getFloors().get(i - 1).getWaitingQueue().set(l, new Patient(-1, -1, "none"));
             System.out.println("Waiting Queue");
             System.out.println(building.getFloors().get(i - 1).getWaitingQueue());
             System.out.println();
             }*/
        }
    }

}

