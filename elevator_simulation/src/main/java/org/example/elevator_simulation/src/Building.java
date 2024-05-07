package org.example.elevator_simulation.src;

import java.util.ArrayList;

public class Building {
    private String buildingName;
    private int noOfFloors;
    private ArrayList<Floor> floors = new ArrayList<>();
    private SimulationSettings sm = new SimulationSettings();
    public Building(SimulationSettings _sm){
        this.sm = _sm;
        this.noOfFloors = this.sm.floors;
        for(int i= 0; i< 30/**this.sm.floors*/; i++){
            String floorName = "floor #" + i;
            this.floors.add(new Floor(floorName, this.sm));
            System.out.println(floorName + " being created");
            this.floors.get(i).setNumOfElevators(sm.number_of_elevators);
            this.floors.get(i).generateElevators();
            System.out.println("Total number of elevators on " + floorName + ": " + this.floors.get(i).getNumOfElevators() );


        }
    }



    public void setFloors(ArrayList<Floor> floors) {
        this.floors = floors;
    }

    public ArrayList<Floor> getFloors() {
        return floors;
    }

    public int getNoOfFloors() {
        return noOfFloors;
    }
}
