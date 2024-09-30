public class DoorOpenState implements ElevatorState {
  @Override
  public void moveUp(Elevator elevator) {
    System.out.println("Cannot move up gate khule hain");
  }

  @Override
  public void moveDown(Elevator elevator) {
    System.out.println("Gate khule h phle band karo");
  }

  @Override
  public void stop(Elevator elevator) {
    System.out.println("Already stopped");
  }

  @Override
  public void openDoor(Elevator elevator) {
    System.out.println("Darwaaze daayin aur khulenge floor: "+elevator.getCurrentFloor());
  }

  @Override
  public void closeDoor(Elevator elevator) {
    System.out.println("closing door");
    elevator.setCurrentState(new DoorCloseState());
  }
}
