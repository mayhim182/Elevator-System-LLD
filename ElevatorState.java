public interface ElevatorState {
  void moveUp(Elevator elevator);
  void moveDown(Elevator elevator);
  void stop(Elevator elevator);
  void openDoor(Elevator elevator);
  void closeDoor(Elevator elevator);
}
