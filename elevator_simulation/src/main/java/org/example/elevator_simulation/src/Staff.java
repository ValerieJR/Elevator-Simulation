package org.example.elevator_simulation.src;

public class Staff extends Person{

    Staff(int startFloor, int endFloor){
        super( startFloor, endFloor);
    }
    Staff(int startFloor, int endFloor, String personType, SimulationSettings _sm){
        super( startFloor, endFloor, personType, _sm);
    }

    public Staff(int startFloor, int endFloor, String personType) {
        super(startFloor, endFloor, personType);
    }


    @Override
    public String toString() {
        String content = super.toString();
        return content;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
