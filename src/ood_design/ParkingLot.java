package ood_design;

public class ParkingLot {
    private Level[] levels;
    ParkingLot(Level[] levels) {
        this.levels = levels;
    }

    String[] parking(Type type) {
//        for (int i = 0; i < levels.length; i++) {简写：
        for (Level level: levels) {
            String spaceNum = level.parking(type);
            if (spaceNum != null) {
                //需要初始化array 需要知道车位号和层号
                return new String[]{level.getId(),spaceNum};
            }
        } return null;
    }

    void leave(String levelId, String spaceId) {
        for (Level level : levels) {
            if (level.getId().equals(levelId)) {
                level.leave(spaceId);
            }
        }
    }
}

class Level {
    private String id;
    private ParkingSpace[] spaces;
    Level(String id, ParkingSpace[] spaces) {
        this.id = id;
        this.spaces = spaces;
    }
    //可以别的class得到level的id号码但是不能随意改变
    public String getId() {
        return id;
    }

    String parking(Type type) {
        for (int i = 0; i < spaces.length; i++) {
            if (spaces[i].type == type && spaces[i].take())
                return spaces[i].spaceNumber;
//            if (!spaces[i].isTaken() && spaces[i].type == type) {
//                spaces[i].take();
//                return spaces[i].number;
//            }
        }
        return null;
    }

    void leave(String number) {
        for (int i = 0; i < spaces.length; i++) {
            if(spaces[i].spaceNumber.equals(number)) {
                spaces[i].leave();
            }
        }
    }

}

class ParkingSpace {
    Type type;
    private boolean isTaken;
    String spaceNumber;
    ParkingSpace(String number, Type type) {
        this.spaceNumber = number;
        this.isTaken = false;
        this.type = type;

    }
//为了防止别人随意设置taken 我要get一下
    public boolean isTaken() {
        return isTaken;
    }

    boolean take() {
        if (isTaken) return false;
        else {
            isTaken = true;
            return true;
        }
    }
 //相当于set isTaken
    void leave() {
        isTaken = false;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if ( obj instanceof ParkingSpace) {
            ParkingSpace space = (ParkingSpace)obj;
            return space.spaceNumber.equals(spaceNumber);
        }
        else return super.equals(obj);
    }
}

enum Type {
    compact,
    regular
}


