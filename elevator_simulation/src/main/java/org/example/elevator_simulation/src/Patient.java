package org.example.elevator_simulation.src;

public class Patient extends Person {
    Patient(int startFloor, int endFloor){
        super( startFloor, endFloor);
    }
    Patient(int startFloor, int endFloor, String personType, SimulationSettings _sm){
        super(startFloor, endFloor, personType, _sm);

    }
    Patient(int startFloor, int endFloor, String personType) {
        super(startFloor, endFloor, personType);
    }

    @Override
    public String toString() {
        String content = super.toString();
        return content;
    }


}
