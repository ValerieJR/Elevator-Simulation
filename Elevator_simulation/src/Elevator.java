import java.util.ArrayList;

public class Elevator extends Floor{
    private int currFloor;
    private ArrayList<String> currPassengers = new ArrayList<String>();
    private enum direction {
    UP,
    DOWN,
    IDLE
    }
}
