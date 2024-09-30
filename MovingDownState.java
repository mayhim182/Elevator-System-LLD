public class MovingDownState implements ElevatorState{
  @Override
  public void moveUp(Elevator elevator) {
    System.out.println("Cannot move up while moving down");
  }

  @Override
  public void moveDown(Elevator elevator) {
    System.out.println("Already moving down");
  }

  @Override
  public void stop(Elevator elevator) {
    System.out.println("Stopping at "+elevator.getCurrentFloor());
    elevator.setCurrentState(new IdleState());
  }

  @Override
  public void openDoor(Elevator elevator) {
    System.out.println("Cannot open door while moving");
  }

  @Override
  public void closeDoor(Elevator elevator) {
    System.out.println("Doors already closed");
  }
}
