module org.example.elevator_simulation {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;

    opens org.example.elevator_simulation to javafx.fxml;
    exports org.example.elevator_simulation;
}