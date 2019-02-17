package oodDesign;

public class MyElevator {
    private String brand;
    private double maxWeight;
    double currentWeight;
    private int[] level;
    boolean goUp;
    boolean isFull;

    MyElevator(String brand, double maxWeight, int[] level) {
        this.brand = brand;
        this.maxWeight = maxWeight;
        this.level = level;
        this.goUp = false;
        this.isFull = false;
        this.currentWeight = 0;
    }

    public void openDoor() {
    }

    public void closeDoor() {
    }

    double addWeight(int weight) {
        if (currentWeight < maxWeight && maxWeight - currentWeight >= weight ) {
            currentWeight += weight;
        }
        return currentWeight;
    }

    boolean overWeight(int weight) {
        if (currentWeight + weight > maxWeight) {
            return true;
        }
        return false;
    }

    double minusWeight(int weight) {
        currentWeight -= weight;
        return currentWeight;
    }

    boolean goingUp(int currentFloor, int destinationFloor) {
        if (currentFloor >= destinationFloor) {
            goUp = false;
        } else {
            goUp = true;
        }
        return goUp;
    }

}




