package org.example.elevator_simulation.src;

import java.util.ArrayList;

public class SimulationSettings {
    SimulationSettings(){
        add_elevator = new ArrayList<>();
        elevator_request_percentage = new ArrayList<>();
        passenger_request_percentage = new ArrayList<>();

    }
    public int floors;
    public ArrayList<AddElevator> add_elevator = new ArrayList<>();
    public ArrayList<ElevatorRequestPercentage> elevator_request_percentage = new ArrayList<>();
    public ArrayList<PassengerRequestPercentage> passenger_request_percentage = new ArrayList<>();
    public int number_of_elevators;
    public int run_simulation;
    public int getFloors() {
        return floors;
    }

    public void setFloors(int floors) {
        this.floors = floors;
    }
}
