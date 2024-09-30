public class Main {
  public static void main(String[] args) {
    ElevatorController elevatorController = new ElevatorController(2);

    elevatorController.addRequest(new Request(1, 4));
    elevatorController.addRequest(new Request(2, 4));
    elevatorController.addRequest(new Request(3, 2));

    elevatorController.processRequests();
  }
}
