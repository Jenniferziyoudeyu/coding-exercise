package OodDesign;

public class Elevator {
    public Status status;
    public Direction direction;
    private int maxWeight;
    private int curWeight;

    public Elevator(Status myStatus, Direction myDirection, int maxWeight) {
        status = myStatus;
//        myStatus = Status.open;
        direction = myDirection;
        this.maxWeight = maxWeight;
    }

    public void setStatus(Status status) {
        this.status = status;
    }
    public Status getStatus() {
        return status;
    }

    public void st() {
        if (status == Status.open) {
            status = Status.close;
        }


        Elevator elevator = new Elevator(Status.open, Direction.up, 3000);
        elevator.st();
//            elevator.setStatus();
    }

    public int addWeight(int inputWeight) {

        return curWeight += inputWeight;
    }

    public int minusWeight(int inputWeight) {

        return curWeight -= inputWeight;
    }

    private boolean isOverweight() {
        return curWeight > maxWeight;
    }

    public Direction whereToGo(int curLevel, int targetLevel) {
        if (curLevel == targetLevel) return Direction.stay;
        else if (curLevel > targetLevel) return Direction.down;
        else return Direction.up;

    }
}

enum Status {
    open,
    close
}

enum Direction {
    up,
    down,
    stay
}
