package oodDesign;

public class ParkingLot {
    String id;
    Level[] levels;
    ParkingLot(String id, Level[] levels) {
        this.id = id;
        this.levels = levels;
    }

    boolean park() {
        for (int i = 0; i < levels.length; i++) {
            if(levels[i] == null) {
                return true;
            }
        } return false;
    }


}

class Level {
    String id;
    ParkingSpace[] spaces;
    Level(String id, ParkingSpace[] spaces) {
        this.id = id;
        this.spaces = spaces;
    }

    ParkingSpace searchASpace(Type type) {
        for (int i = 0; i < spaces.length; i++) {
            if (!spaces[i].isTaken && spaces[i].type == type) {
                return spaces[i];
            }
        }
        return null;
    }


    void leave(String number) {
        for (int i = 0; i < spaces.length; i++) {
            if(spaces[i].number == number) {
                spaces[i].isTaken = false;
            }
        }
    }

}

class ParkingSpace {
    Type type;
    boolean isTaken;
    String number;
    ParkingSpace(String number, Type type) {
        this.number = number;
        this.isTaken = false;
        this.type = type;

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

enum Type {
    compact,
    regular
}


