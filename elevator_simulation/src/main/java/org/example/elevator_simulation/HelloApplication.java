package org.example.elevator_simulation;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.transform.Translate;
import javafx.stage.Stage;
import org.example.elevator_simulation.src.*;
import java.io.IOException;
import java.util.ArrayList;


public class HelloApplication extends Application implements EventHandler<ActionEvent> {
    //GridPane root = new GridPane();
    AnchorPane root = new AnchorPane();
    Button strt = new Button();
    Rectangle rctg0 = new Rectangle(30,30);
    Rectangle rctg1 = new Rectangle(30,30);
    Rectangle rctg2 = new Rectangle(30,30);
    Rectangle rctg3 = new Rectangle(30,30);
    Rectangle rctg4 = new Rectangle(30,30);
    Rectangle rctg5 = new Rectangle(30,30);
    Rectangle rctg6 = new Rectangle(30,30);
    Rectangle rctg7 = new Rectangle(30,30);


    Label floor1 = new Label();
    Label floor2 = new Label();
    Label floor3 = new Label();
    Label floor4 = new Label();
    Label floor5 = new Label();
    Label floor6 = new Label();
    Label floor7 = new Label();
    Label floor8 = new Label();
    Label floor9 = new Label();
    Label floor10 = new Label();
    Label floor11 = new Label();
    Label floor12 = new Label();
    Label floor13 = new Label();
    Label floor14 = new Label();
    Label floor15 = new Label();
    Label floor16 = new Label();
    Label floor17 = new Label();
    Label floor18 = new Label();
    Label floor19 = new Label();
    Label floor20 = new Label();
    Label floor21 = new Label();
    Label floor22 = new Label();
    Label floor23 = new Label();
    Label floor24 = new Label();
    Label floor25 = new Label();
    Label floor26 = new Label();
    Label floor27 = new Label();
    Label floor28 = new Label();
    Label floor29 = new Label();
    Label floor30 = new Label();
    ArrayList<Rectangle> rctg = new ArrayList<>();

    Translate translate = new Translate(50,0);

    FileManipulator fm = new FileManipulator("C:\\Users\\reyes\\IdeaProjects\\VJR\\Elevator-Simulation\\Elevator_simulation\\");
    SimulationSettings sm;

    {
        try {
            sm = fm.readSettingsInformation("SimulationSettings.txt");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    Building b = new Building(sm);



    @Override
    public void start(Stage stage)  {
        //FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
        rctg.add(rctg0);
        rctg.add(rctg1);
        rctg.add(rctg2);
        rctg.add(rctg3);
        rctg.add(rctg4);
        rctg.add(rctg5);
        rctg.add(rctg6);
        rctg.add(rctg7);

        //root settings
        root.setMinSize(2000,800);
        root.setPadding(new Insets(10,10,10,10));


        //set text
        strt.setText("Start");
        floor1.setText("Floor 1");
        floor2.setText("Floor 2");
        floor3.setText("Floor 3");
        floor4.setText("Floor 4");
        floor5.setText("Floor 5");
        floor6.setText("Floor 6");
        floor7.setText("Floor 7");
        floor8.setText("Floor 8");
        floor9.setText("Floor 9");
        floor10.setText("Floor 10");
        floor11.setText("Floor 11");
        floor12.setText("Floor 12");
        floor13.setText("Floor 13");
        floor14.setText("Floor 14");
        floor15.setText("Floor 15");
        floor16.setText("Floor 16");
        floor17.setText("Floor 17");
        floor18.setText("Floor 18");
        floor19.setText("Floor 19");
        floor20.setText("Floor 20");
        floor21.setText("Floor 21");
        floor22.setText("Floor 22");
        floor23.setText("Floor 23");
        floor24.setText("Floor 24");
        floor25.setText("Floor 25");
        floor26.setText("Floor 26");
        floor27.setText("Floor 27");
        floor28.setText("Floor 28");
        floor29.setText("Floor 29");
        floor30.setText("Floor 30");

        //set size
        floor1.setMinSize(30,30);
        floor2.setMinSize(30,30);
        floor3.setMinSize(30,30);
        floor4.setMinSize(30,30);
        floor5.setMinSize(30,30);
        floor6.setMinSize(30,30);
        floor7.setMinSize(30,30);
        floor8.setMinSize(30,30);
        floor9.setMinSize(30,30);
        floor10.setMinSize(30,30);
        floor11.setMinSize(30,30);
        floor12.setMinSize(30,30);
        floor13.setMinSize(30,30);
        floor14.setMinSize(30,30);
        floor15.setMinSize(30,30);
        floor16.setMinSize(30,30);
        floor17.setMinSize(30,30);
        floor18.setMinSize(30,30);
        floor19.setMinSize(30,30);
        floor20.setMinSize(30,30);
        floor21.setMinSize(30,30);
        floor22.setMinSize(30,30);
        floor23.setMinSize(30,30);
        floor24.setMinSize(30,30);
        floor25.setMinSize(30,30);
        floor26.setMinSize(30,30);
        floor27.setMinSize(30,30);
        floor28.setMinSize(30,30);
        floor29.setMinSize(30,30);
        floor30.setMinSize(30,30);

        //rectangle color
        rctg0.setFill(Color.BLUE);
        rctg1.setFill(Color.RED);
        rctg2.setFill(Color.BLUE);
        rctg3.setFill(Color.RED);
        rctg4.setFill(Color.BLUE);
        rctg5.setFill(Color.RED);
        rctg6.setFill(Color.BLUE);
        rctg7.setFill(Color.RED);

        //adding elements
        root.getChildren().add(floor1);
            floor1.setLayoutX(0);
            floor1.setLayoutY(0);

        root.getChildren().add(floor2);
            floor2.setLayoutX(50);
            floor2.setLayoutY(0);
        root.getChildren().add(floor3);
            floor3.setLayoutX(100);
            floor3.setLayoutY(0);
        root.getChildren().add(floor4);
            floor4.setLayoutX(150);
            floor4.setLayoutY(0);
        root.getChildren().add(floor5);
            floor5.setLayoutX(200);
            floor5.setLayoutY(0);
        root.getChildren().add(floor6);
            floor6.setLayoutX(250);
            floor6.setLayoutY(0);
        root.getChildren().add(floor7);
            floor7.setLayoutX(300);
            floor7.setLayoutY(0);
        root.getChildren().add(floor8);
            floor8.setLayoutX(350);
            floor8.setLayoutY(0);
        root.getChildren().add(floor9);
            floor9.setLayoutX(400);
            floor9.setLayoutY(0);
        root.getChildren().add(floor10);
            floor10.setLayoutX(450);
            floor10.setLayoutY(0);
        root.getChildren().add(floor11);
            floor11.setLayoutX(500);
            floor11.setLayoutY(0);
        root.getChildren().add(floor12);
            floor12.setLayoutX(550);
            floor12.setLayoutY(0);
        root.getChildren().add(floor13);
            floor13.setLayoutX(600);
            floor13.setLayoutY(0);
        root.getChildren().add(floor14);
            floor14.setLayoutX(650);
            floor14.setLayoutY(0);
        root.getChildren().add(floor15);
            floor15.setLayoutX(700);
            floor15.setLayoutY(0);
        root.getChildren().add(floor16);
            floor16.setLayoutX(750);
            floor16.setLayoutY(0);
        root.getChildren().add(floor17);
            floor17.setLayoutX(800);
            floor17.setLayoutY(0);
        root.getChildren().add(floor18);
            floor18.setLayoutX(850);
            floor18.setLayoutY(0);
        root.getChildren().add(floor19);
            floor19.setLayoutX(900);
            floor19.setLayoutY(0);
        root.getChildren().add(floor20);
            floor20.setLayoutX(950);
            floor20.setLayoutY(0);
        root.getChildren().add(floor21);
            floor21.setLayoutX(1000);
            floor21.setLayoutY(0);
        root.getChildren().add(floor22);
            floor22.setLayoutX(1050);
            floor22.setLayoutY(0);
        root.getChildren().add(floor23);
            floor23.setLayoutX(1100);
            floor23.setLayoutY(0);
        root.getChildren().add(floor24);
            floor24.setLayoutX(1150);
            floor24.setLayoutY(0);
        root.getChildren().add(floor25);
            floor25.setLayoutX(1200);
            floor25.setLayoutY(0);
        root.getChildren().add(floor26);
            floor26.setLayoutX(1250);
            floor26.setLayoutY(0);
        root.getChildren().add(floor27);
            floor27.setLayoutX(1300);
            floor27.setLayoutY(0);
        root.getChildren().add(floor28);
            floor28.setLayoutX(1350);
            floor28.setLayoutY(0);
        root.getChildren().add(floor29);
            floor29.setLayoutX(1400);
            floor29.setLayoutY(0);
        root.getChildren().add(floor30);
            floor30.setLayoutX(1450);
            floor30.setLayoutY(0);
        root.getChildren().add(rctg0);
            rctg.get(0).setLayoutY(50);
            rctg.get(0).setLayoutX(0);
        root.getChildren().add(rctg1);
            rctg.get(1).setLayoutY(100);
            rctg.get(1).setLayoutX(0);
        root.getChildren().add(rctg2);
            rctg.get(2).setLayoutY(150);
            rctg.get(2).setLayoutX(0);
        root.getChildren().add(rctg3);
            rctg.get(3).setLayoutY(200);
            rctg.get(3).setLayoutX(0);
        root.getChildren().add(rctg4);
            rctg.get(4).setLayoutY(250);
            rctg.get(4).setLayoutX(0);
        root.getChildren().add(rctg5);
            rctg.get(5).setLayoutY(300);
            rctg.get(5).setLayoutX(0);
        root.getChildren().add(rctg6);
            rctg.get(6).setLayoutY(350);
            rctg.get(6).setLayoutX(0);
        root.getChildren().add(rctg7);
            rctg.get(7).setLayoutY(400);
            rctg.get(7).setLayoutX(0);
        root.getChildren().add(strt);
            strt.setLayoutX(0);
            strt.setLayoutY(450);



      //  root.add(floor1,30,30);
        /*root.add(floor2,3,0);
        root.add(floor3,4,0);
        root.add(floor4,5,0);
        root.add(floor5,6,0);
        root.add(floor6,7,0);
        root.add(floor7,8,0);
        root.add(floor8,9,0);
        root.add(floor9,10,0);
        root.add(floor10,11,0);
        root.add(floor11,12,0);
        root.add(floor12,13,0);
        root.add(floor13,14,0);
        root.add(floor14,15,0);
        root.add(floor15,16,0);
        root.add(floor16,17,0);
        root.add(floor17,18,0);
        root.add(floor18,19,0);
        root.add(floor19,20,0);
        root.add(floor20,21,0);
        root.add(floor21,22,0);
        root.add(floor22,23,0);
        root.add(floor23,24,0);
        root.add(floor24,25,0);
        root.add(floor25,26,0);
        root.add(floor26,27,0);
        root.add(floor27,28,0);
        root.add(floor28,29,0);
        root.add(floor29,30,0);
        root.add(floor30,31,0);
        root.add(strt,0,0);
        root.add(rctg0,2,2);
        root.add(rctg1,2,3);
        root.add(rctg2,2,4);
        root.add(rctg3,2,5);
        root.add(rctg4,2,6);
        root.add(rctg5,2,7);
        root.add(rctg6,2,8);
        root.add(rctg7,2,9);
        root.setGridLinesVisible(true);*/
       // translate.setX(50);
      //  translate.setY(0);
      //  translate.setZ(0);
        strt.setOnAction(this);
        Scene scene = new Scene(/*fxmlLoader.load()*/root, 900, 500);
        stage.setTitle("Elevator Simulator");
        stage.setScene(scene);
        stage.show();

    }


    public static void main(String[] args) {
        launch();

    }





    @Override
    public void handle(ActionEvent actionEvent) {
    //Adds passengers of type patient and type staff to every floor
    for (int i = 0; i < 10; i++) {
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
        for (int i = 0; i < 9; i++) {


            System.out.println("New loop");
             double n = 50;
            moveElevators(b, sm, i, i + 1, rctg, root, n, translate,0);

            //updateWaitingQueue(b, sm, i + 1);


        }
        System.out.println(checkFloors(b));
        //elevators going down

        for (int i = 9; i > 0; i--) {
            System.out.println("New loop");
            double n = -50;
            moveElevators(b, sm, i, i - 1, rctg, root, n, translate, 1);
            //updateWaitingQueue(b, sm, i-1);


        }
        System.out.println(checkFloors(b));

    }
}
    private static void moveElevators(Building b, SimulationSettings sm,int g, int i, ArrayList<Rectangle> rctg, AnchorPane root, double n, Translate translate, int direction){
        for (int j = 0; j < b.getFloors().get(g).getElevators().size(); j++) {


            System.out.println("Elevator on floor " + g + " and elevator " + j + " before move() " + b.getFloors().get(g).getElevators().get(j).getCurrPassengers());



            //root.getChildren().remove(rctg.get(0));
            //double prevX = rctg.get(0).getLayoutX();
            //rctg.get(0).setLayoutX(prevX + 50);
            //root.getChildren().add(rctg.get(0));

            //  moveRctg(j, rctg, n, translate);
          //  try{
            //    Thread.sleep(200);
            //}
            //catch(InterruptedException e){

            //}
            //int constraint;

           // constraint = GridPane.getColumnIndex(rctg.get(0));
         //  GridPane.setConstraints(rctg.get(0), constraint + 1, 2);
          // root.getChildren().add(rctg.get(0));
           // System.out.println(constraint);

            /* (j) {
                case 0:
                    constraint = GridPane.getColumnIndex(rctg.get(0));
                    root.setConstraints(rctg.get(0), (constraint + n), 2);
                    break;
                case 1:
                    constraint = GridPane.getColumnIndex(rctg.get(1));
                    root.setConstraints(rctg.get(1), (constraint + n), 3);
                    break;
                case 2:
                    constraint = GridPane.getColumnIndex(rctg.get(2));
                    root.setConstraints(rctg.get(2), (constraint + n), 4);
                    break;
                case 3:
                    constraint = GridPane.getColumnIndex(rctg.get(3));
                    root.setConstraints(rctg.get(3), (constraint + n), 5);
                    break;
                case 4:
                    constraint = GridPane.getColumnIndex(rctg.get(4));
                    root.setConstraints(rctg.get(4), (constraint + n), 6);
                    break;
                case 5:
                    constraint = GridPane.getColumnIndex(rctg.get(5));
                    root.setConstraints(rctg.get(5), (constraint + n), 7);
                    break;
                case 6:
                    constraint = GridPane.getColumnIndex(rctg.get(6));
                    root.setConstraints(rctg.get(6), (constraint + n), 8);
                    break;

                case 7:
                    constraint = GridPane.getColumnIndex(rctg.get(7));
                    root.setConstraints(rctg.get(7), (constraint + n), 9);
                    break;

            }*/


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
                            addStaffToElevator(b.getFloors().get(i).getWaitingQueue(), b.getFloors().get(i).getElevators(), k, j, i, direction);
                            k = k - 1;
                        }
                    }

                    System.out.println("Passengers on elevator " + (j));
                    System.out.println(b.getFloors().get(i).getElevators().get(j).getCurrPassengers());
                    System.out.println();

                } else if ((b.getFloors().get(i).getElevators().get(j).getElevatorType()).equals(sm.elevator_request_percentage.get(0).elevatorType)) {

                    for (int l = 0; l < b.getFloors().get(i).getWaitingQueue().size(); l++) {

                        if (b.getFloors().get(i).getWaitingQueue().get(l).getPersonType().equals(sm.passenger_request_percentage.get(0).passengerType) && (b.getFloors().get(i).getElevators().get(j).getCurrPassengers().size() < 10)) {
                            addStaffToElevator(b.getFloors().get(i).getWaitingQueue(), b.getFloors().get(i).getElevators(), l, j, i, direction);
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
        for(int i = 0; i < 10; i++ ){
            if(building.getFloors().get(i).getWaitingQueue().isEmpty()){
                counter = counter + 1;
                System.out.println(building.getFloors().get(i).getWaitingQueue());

            }
            else {
                System.out.println(building.getFloors().get(i).getWaitingQueue());
            }
        }
        if (counter == 10){

            value = true;
        }
        return value;
    }


    private static void addStaffToElevator(ArrayList<Person> waitingQueue, ArrayList<Elevator> elevators, int k, int j, int i , int direction) {
        if(direction == 0 ){
        if (waitingQueue.get(k).getEndFloor() >= i) {
            elevators.get(j).addPersonsToElevator(waitingQueue, k);
            waitingQueue.remove(k);
            System.out.println("Waiting Queue");
            System.out.println(waitingQueue);
            System.out.println();
        }
        else if (direction==1){

            if (waitingQueue.get(k).getEndFloor() <= i) {
                elevators.get(j).addPersonsToElevator(waitingQueue, k);
                waitingQueue.remove(k);
                System.out.println("Waiting Queue");
                System.out.println(waitingQueue);
                System.out.println();
            }
        }
            /*if (building.getFloors().get(i - 1).getWaitingQueue().get(l).getEndFloor() >= l) {
             building.getFloors().get(i - 1).getElevators().get(j).addPersonsToElevator(building.getFloors().get(i - 1).getWaitingQueue(), l);
             building.getFloors().get(i - 1).getWaitingQueue().set(l, new Patient(-1, -1, "none"));
             System.out.println("Waiting Queue");
             System.out.println(building.getFloors().get(i - 1).getWaitingQueue());
             System.out.println();
             }*/
            //}
        }
    }
    private static void moveRctg(int j, ArrayList<Rectangle> rctg, double n, Translate translate){
        int constraint;

        switch (j) {
            case 0:
                rctg.get(0).getTransforms().addAll(translate);


                break;
            case 1:
                rctg.get(1).getTransforms().addAll(translate);

                break;
            case 2:

                rctg.get(2).getTransforms().addAll(translate);
                break;
            case 3:

                rctg.get(3).getTransforms().addAll(translate);
                break;
            case 4:

                rctg.get(4).getTransforms().addAll(translate);
                break;
            case 5:
                rctg.get(5).getTransforms().addAll(translate);

                break;
            case 6:
                rctg.get(6).getTransforms().addAll(translate);

                break;

            case 7:
              //  constraint = GridPane.getColumnIndex(rctg.get(7));
              //  root.getChildren().remove(rctg.get(7));
               // GridPane.setConstraints(rctg.get(7), (constraint + n), 9);
              //  root.getChildren().remove(rctg.get(7));
                rctg.get(7).getTransforms().addAll(translate);
                break;

        }
    }


}


