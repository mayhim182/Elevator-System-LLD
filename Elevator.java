public class Elevator {
  private int currentFloor;
  private boolean status;

  private ElevatorState currentState;

  public boolean getStatus() {
    return status;
  }

  public void setStatus(boolean status) {
    this.status = status;
  }

  public int getCurrentFloor() {
    return currentFloor;
  }

  public void setCurrentFloor(int currentFloor) {
    this.currentFloor = currentFloor;
  }

  public ElevatorState getCurrentState() {
    return currentState;
  }

  public void setCurrentState(ElevatorState currentState) {
    this.currentState = currentState;
  }

  public Elevator() {
    this.currentFloor = 0; //assume elevator starts on ground floor
    this.currentState = new IdleState(); //starts in IDLE state
  }

  public void moveUp() {
    currentState.moveUp(this);
  }

  public void moveDown() {
    currentState.moveDown(this);
  }

  public void stop() {
    currentState.stop(this);
  }

  public void openDoor() {
    currentState.openDoor(this);
  }

  public void closeDoor() {
    currentState.closeDoor(this);
  }

}
