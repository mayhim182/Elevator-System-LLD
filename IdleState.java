public class IdleState implements ElevatorState{
  @Override
  public void moveUp(Elevator elevator) {
    System.out.println("Elevator starts moving up");
    elevator.setCurrentState(new MovingUpState());
  }

  @Override
  public void moveDown(Elevator elevator) {
    System.out.println("Elevator starts going down");
    elevator.setCurrentState(new MovingDownState());
  }

  @Override
  public void stop(Elevator elevator) {
    System.out.println("Elevator already IDLE");
  }

  @Override
  public void openDoor(Elevator elevator) {
    System.out.println("Elevator door opens");
    elevator.setCurrentState(new DoorOpenState());
  }

  @Override
  public void closeDoor(Elevator elevator) {
    System.out.println("Elevator doors already closed");
  }

}
