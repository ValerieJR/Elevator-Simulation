package org.example.elevator_simulation.src;

public abstract class Person {
    private String firstName;
    private String lastName;
    private int startFloor;
    private int endFloor;
    private String personType;
    private SimulationSettings sm = new SimulationSettings();

    Person( int startFloor, int endFloor){

        this.startFloor = startFloor;
    }
    Person( int startFloor, int endFloor, String personType){

        this.startFloor = startFloor;
        this.endFloor = endFloor;
        this.personType = personType;
    }
    Person( int startFloor, int endFloor, String personType, SimulationSettings _sm){

        this.startFloor = startFloor;
        this.endFloor = endFloor;
        this.personType = personType;
    }
    @Override
    public String toString() {
        super.toString();
        String content = "Start floor: " + startFloor + " End floor: " + endFloor + " Person type: " + personType;
        return content;
    }

    public void setEndFloor(int endFloor) {
        this.endFloor = endFloor;
    }

    public int getEndFloor() {
        return endFloor;
    }

    public void setStartFloor(int startFloor) {
        this.startFloor = startFloor;
    }

    public int getStartFloor() {
        return startFloor;
    }

    public void setPersonType(String personType) {
        this.personType = personType;
    }

    public String getPersonType() {
        return this.personType;
    }
}
