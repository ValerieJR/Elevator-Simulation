/*package org.example.elevator_simulation;

import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.event.*;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import org.example.elevator_simulation.src.*;

import java.io.IOException;
import java.util.ArrayList;

public class HelloController {

    /*@FXML
    public static void startSimulation(ActionEvent actionEvent, Building b, SimulationSettings sm) throws IOException {


        //Adds passengers of type patient and type staff to every floor
        for (int i = 0; i < 5; i++) {
            b.getFloors().get(i).addPersonToFloor(i, i);
        }

        //adds passengers on floor 0 to their proper elevators
        System.out.println("On floor: " + 0);
        // goes through every elevator
        for (int j = 0; j < b.getFloors().get(0).getElevators().size(); j++) {
            System.out.println("On elevator: " + j + " Type: " + b.getFloors().get(0).getElevators().get(j).getElevatorType());
            if ((b.getFloors().get(0).getElevators().get(j).getElevatorType()).equals(sm.elevator_request_percentage.get(1).elevatorType)) {
                // goes through the passengers waiting to get on the elevator
                for (int k = 0; k < b.getFloors().get(0).getWaitingQueue().size(); k++) {
                    //if statement checks if correct passenger is being added to elevator and if elevator has reached capacity
                    if ((b.getFloors().get(0).getWaitingQueue().get(k).getPersonType()).equals(sm.passenger_request_percentage.get(1).passengerType) && (b.getFloors().get(0).getElevators().get(j).getCurrPassengers().size() < sm.add_elevator.get(1).maximumCapacity)) {
                        b.getFloors().get(0).getElevators().get(j).addPersonsToElevator(b.getFloors().get(0).getWaitingQueue(), k);
                        b.getFloors().get(0).getWaitingQueue().remove(k);
                        k = k - 1;
                        System.out.println("Waiting Queue");
                        System.out.println(b.getFloors().get(0).getWaitingQueue());

                    }
                }
                System.out.println(b.getFloors().get(0).getElevators().get(j).getCurrPassengers());
            } else if (b.getFloors().get(0).getElevators().get(j).getElevatorType().equals(sm.elevator_request_percentage.get(0).elevatorType)) {
                for (int l = 0; l < b.getFloors().get(0).getWaitingQueue().size(); l++) {
                    if ((b.getFloors().get(0).getWaitingQueue().get(l).getPersonType()).equals(sm.passenger_request_percentage.get(0).passengerType) && (b.getFloors().get(0).getElevators().get(j).getCurrPassengers().size() < sm.add_elevator.get(0).maximumCapacity)) {
                        b.getFloors().get(0).getElevators().get(j).addPersonsToElevator(b.getFloors().get(0).getWaitingQueue(), l);
                        b.getFloors().get(0).getWaitingQueue().remove(l);
                        l = l - 1;
                        System.out.println("Waiting Queue");
                        System.out.println(b.getFloors().get(0).getWaitingQueue());
                    }
                }
                System.out.println(b.getFloors().get(0).getElevators().get(j).getCurrPassengers());
            }
        }

        // System.out.println(checkFloors(b, sm));
        // elevators going up
        while (!checkFloors(b)) {
            for (int i = 0; i < 4; i++) {


                System.out.println("New loop");
                int n = 1;
                moveElevators(b, sm, i, i + 1, rctg, root, n);

                //updateWaitingQueue(b, sm, i + 1);


            }
            System.out.println(checkFloors(b));
        //elevators going down

            for (int i = 4; i > 0; i--) {
                System.out.println("New loop");
                int n = -1;
                moveElevators(b, sm, i, i - 1, rctg, root, n);
                //updateWaitingQueue(b, sm, i-1);


            }
            System.out.println(checkFloors(b));

        }
    }
    private static void moveElevators(Building b, SimulationSettings sm,int g, int i, ArrayList<Rectangle> rctg, GridPane root, int n){
        for (int j = 0; j < b.getFloors().get(g).getElevators().size(); j++) {


            System.out.println("Elevator on floor " + g + " and elevator " + j + " before move() " + b.getFloors().get(g).getElevators().get(j).getCurrPassengers());

            //moveRctg(j, rctg, root, n);


            //passengers on the elevator of floor i are being moved to the elevator one up

            b.getFloors().get(g).getElevators().get(j).movePassengers(i, b.getFloors().get(i).getElevators().get(j).getCurrPassengers());
            System.out.println("Elevator on floor " + (i) + " and elevator " + j + " passengers on elevator after move()" + b.getFloors().get(i).getElevators().get(j).getCurrPassengers());
            System.out.println();

            b.getFloors().get(i).getElevators().get(j).passengersOff(i, b.getFloors().get(i).getPassengerComplete());
            System.out.println("Passengers completed on floor " + (i) + " " + b.getFloors().get(i).getPassengerComplete());
            System.out.println();

            //  }}
            //public static void updateWaitingQueue(Building b, SimulationSettings sm, int i){
            // for (int j = 0; j < sm.number_of_elevators; j++) {
            // Passengers in the waiting queue of floor (i-1) are being added to the elevator on floor (i-1)
            if (!b.getFloors().get(i).getWaitingQueue().isEmpty()) {
                System.out.println("On floor " + (i));
                System.out.println("On elevator: " + j + " Type: " + b.getFloors().get(i).getElevators().get(j).getElevatorType());

                if ((b.getFloors().get(i).getElevators().get(j).getElevatorType()).equals(sm.elevator_request_percentage.get(1).elevatorType)) {

                    for (int k = 0; k < b.getFloors().get(i).getWaitingQueue().size(); k++) {
                        //if statement checks if correct passenger is being added to elevator and if elevator has reached capacity

                        if (b.getFloors().get(i).getWaitingQueue().get(k).getPersonType().equals(sm.passenger_request_percentage.get(1).passengerType) && (b.getFloors().get(i).getElevators().get(j).getCurrPassengers().size() < 8)) {
                            addStaffToElevator(b.getFloors().get(i).getWaitingQueue(), b.getFloors().get(i).getElevators(), k, j);
                            k = k - 1;
                        }
                    }

                    System.out.println("Passengers on elevator " + (j));
                    System.out.println(b.getFloors().get(i).getElevators().get(j).getCurrPassengers());
                    System.out.println();

                } else if ((b.getFloors().get(i).getElevators().get(j).getElevatorType()).equals(sm.elevator_request_percentage.get(0).elevatorType)) {

                    for (int l = 0; l < b.getFloors().get(i).getWaitingQueue().size(); l++) {

                        if (b.getFloors().get(i).getWaitingQueue().get(l).getPersonType().equals(sm.passenger_request_percentage.get(0).passengerType) && (b.getFloors().get(i).getElevators().get(j).getCurrPassengers().size() < 10)) {
                            addStaffToElevator(b.getFloors().get(i).getWaitingQueue(), b.getFloors().get(i).getElevators(), l, j);
                            l = l - 1;
                        }
                    }

                    System.out.println("Passengers on elevator " + (j));
                    System.out.println(b.getFloors().get(i).getElevators().get(j).getCurrPassengers());
                    System.out.println();

                }
            }
        }
    }
    private static boolean checkFloors(Building building){
        int counter = 0;

        boolean value = false;
        for(int i = 0; i < 5; i++ ){
            if(building.getFloors().get(i).getWaitingQueue().isEmpty()){
                counter = counter + 1;
                System.out.println(building.getFloors().get(i).getWaitingQueue());

            }
            else {
                System.out.println(building.getFloors().get(i).getWaitingQueue());
            }
        }
        if (counter == 5){

            value = true;
        }
        return value;
    }


    private static void addStaffToElevator(ArrayList<Person> waitingQueue, ArrayList<Elevator> elevators, int k, int j) {
        if (waitingQueue.get(k).getEndFloor() >= k) {
            elevators.get(j).addPersonsToElevator(waitingQueue, k);
            waitingQueue.remove(k);
            System.out.println("Waiting Queue");
            System.out.println(waitingQueue);
            System.out.println();

            /*if (building.getFloors().get(i - 1).getWaitingQueue().get(l).getEndFloor() >= l) {
             building.getFloors().get(i - 1).getElevators().get(j).addPersonsToElevator(building.getFloors().get(i - 1).getWaitingQueue(), l);
             building.getFloors().get(i - 1).getWaitingQueue().set(l, new Patient(-1, -1, "none"));
             System.out.println("Waiting Queue");
             System.out.println(building.getFloors().get(i - 1).getWaitingQueue());
             System.out.println();
             }*/
            //}
        /*}
    }
    private static void moveRctg(int j, ArrayList<Rectangle> rctg, GridPane root, int n){
        int constraint;
        switch (j) {
            case 0:
                constraint = GridPane.getColumnIndex(rctg.get(0));
                root.setConstraints(rctg.get(0), constraint + n, 2);
                break;
            case 1:
                constraint = GridPane.getColumnIndex(rctg.get(1));
                root.setConstraints(rctg.get(1), constraint + n, 3);
                break;
            case 2:
                constraint = GridPane.getColumnIndex(rctg.get(2));
                root.setConstraints(rctg.get(2), constraint + n, 4);
                break;
            case 3:
                constraint = GridPane.getColumnIndex(rctg.get(3));
                root.setConstraints(rctg.get(3), constraint + n, 5);
                break;
            case 4:
                constraint = GridPane.getColumnIndex(rctg.get(4));
                root.setConstraints(rctg.get(4), constraint + n, 6);
                break;
            case 5:
                constraint = GridPane.getColumnIndex(rctg.get(5));
                root.setConstraints(rctg.get(5), constraint + n, 7);
                break;
            case 6:
                constraint = GridPane.getColumnIndex(rctg.get(6));
                root.setConstraints(rctg.get(6), constraint + n, 8);
                break;

            case 7:
                constraint = GridPane.getColumnIndex(rctg.get(7));
                root.setConstraints(rctg.get(7), constraint + n, 9);
                break;

        }
    }*/
//}