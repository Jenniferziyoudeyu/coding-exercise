package oodDesign;

public class ParkingLot {
    String id;
    Level[] levels;
    ParkingLot(String id, Level[] levels) {
        this.id = id;
        this.levels = levels;
    }

    boolean park (Car car) {
        for (int i = 0; i < levels.length; i++) {
            if(car.levelId.equals(levels[i].id)) {
                return true;
            }
        } return false;
    }


}

class Level {
    String id;
    private ParkingSpace[] spaces;
    Level(String id, ParkingSpace[] spaces) {
        this.id = id;
        this.spaces = spaces;
    }

    boolean searchASpace (Car car) {
        for (int i = 0; i < spaces.length; i++) {
            if (spaces[i] == null)  {
                spaces[i].number.equals(car.parkingNumber);
                return true;
            }
        }
        return false;
    }

    String park(Car car) {
        if (searchASpace(car)) {
            return car.parkingNumber;
        }
        return "Can't find a parking space.";
    }

    void leave(Car car) {
        for (int i = 0; i < spaces.length; i++) {
            if (car.parkingNumber.equals(spaces[i].number)) {
                spaces[i] = null;
            }
        }
    }

}

class ParkingSpace {
    String number;
    ParkingSpace(String number) {
        this.number = number;

    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if ( obj instanceof ParkingSpace) {
            ParkingSpace space = (ParkingSpace)obj;
            return space.number.equals(number);
        }
        else return super.equals(obj);
    }
}


class Car {
    String parkingNumber;
    String levelId;
}