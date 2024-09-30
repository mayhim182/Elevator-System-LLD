import java.util.*;
import java.util.stream.Collectors;

public class ElevatorController {
  private List<Elevator> elevatorList;
  private Queue<Request> requestQueue;

  public ElevatorController(int numOfElevators) {
    elevatorList = new ArrayList<>();
    for(int i = 0; i<numOfElevators; i++) {
      elevatorList.add(new Elevator());
    }
    requestQueue = new LinkedList<>();
  }

  public void addRequest(Request request) {
    requestQueue.add(request);
  }

  public void assignElevator(Request request) {
      List<Elevator> availableElevators = elevatorList.stream().filter(elevator -> !elevator.getStatus()).toList();
      if(elevatorList.isEmpty()) {
        System.out.println("No Elevators available right now");
        return ;
      }
      Elevator elevator = availableElevators.get(0);
      int source = request.getSourceFloor();
      int destination = request.getDestinationFloor();

      elevator.openDoor();
      elevator.setCurrentFloor(source);
      elevator.closeDoor();

      if(source<destination) {
        elevator.moveUp();
      } else if(source>destination) {
        elevator.moveDown();
      }

      elevator.setCurrentFloor(destination);
      elevator.stop();
      elevator.openDoor();
      elevator.closeDoor();
  }

  public void processRequests() {
    while (!requestQueue.isEmpty()) {
      Request request = requestQueue.poll();
      assignElevator(request);
    }
  }

}
