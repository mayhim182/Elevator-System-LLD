public class DoorCloseState implements ElevatorState{
  @Override
  public void moveUp(Elevator elevator) {
    System.out.println("Elevator moving up");
    elevator.setCurrentState(new MovingUpState());
  }

  @Override
  public void moveDown(Elevator elevator) {
    System.out.println("Elevator going down");
    elevator.setCurrentState(new MovingDownState());
  }

  @Override
  public void stop(Elevator elevator) {
    System.out.println("Elevator stopped");
    elevator.setCurrentState(new IdleState());
  }

  @Override
  public void openDoor(Elevator elevator) {
    System.out.println("Opening doors");
    elevator.setCurrentState(new DoorOpenState());
  }

  @Override
  public void closeDoor(Elevator elevator) {
    System.out.println("Closing doors");
    elevator.setCurrentState(new DoorCloseState());
  }
}
