public class MovingUpState implements ElevatorState{
  @Override
  public void moveUp(Elevator elevator) {
    System.out.println("Elevator is moving up");
  }

  @Override
  public void moveDown(Elevator elevator) {
    System.out.println("Elevator can't move down while moving up");
  }

  @Override
  public void stop(Elevator elevator) {
    System.out.println("Elevator stopped");
    elevator.setCurrentState(new IdleState());
  }

  @Override
  public void openDoor(Elevator elevator) {
    System.out.println("Cannot open door while moving up");
  }

  @Override
  public void closeDoor(Elevator elevator) {
    System.out.println("Elevator doors are already closed");
  }

}
