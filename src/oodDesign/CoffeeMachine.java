package oodDesign;

public class CoffeeMachine {
    public int totalWater, totalMilk;
    public int maxWater, maxMilk;

    public boolean haveACoffee(Coffee coffee) {
        makeACoffee();
        if (coffee instanceof DecafCoffee) {
            if (totalMilk < ((DecafCoffee) coffee).milk) return false;
            totalMilk -= ((DecafCoffee) coffee).milk;
        }
        if (totalWater < coffee.waterNeeded) return false;
        totalWater -= coffee.waterNeeded;
        return true;
    }

    private void makeACoffee() {

    }

    void addWater(int water) {
        if (totalWater + water > maxWater) {
            totalWater = maxWater;
        } else totalWater += water;
    }


}

class Coffee {
    int waterNeeded;
    public Coffee(int waterNeeded) {
        this.waterNeeded = waterNeeded;
    }

    public void setWaterNeeded(int waterNeeded) {
        this.waterNeeded = waterNeeded;
    }

    public int getWaterNeeded() {
        return waterNeeded;
    }
}

class DecafCoffee extends Coffee {
    int milk;
    DecafCoffee(int waterNeeded, int milk) {
        super(waterNeeded);
        this.milk = milk;
    }

    public void setMilk(int milk) {
        this.milk = milk;
    }

    public int getMilk() {
        return milk;
    }
}

enum CoffeeKind {
    American,
    CaféLatte,
    Cappuccino,
    Espresso
}
