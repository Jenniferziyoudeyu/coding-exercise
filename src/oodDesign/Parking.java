package oodDesign;

public class Parking {
    private Level1[] levels;
    Parking(Level1[] levels) {
        this.levels = levels;
    }

    String[] parking(TypeIs type) {
        for(Level1 level1 : levels) {
            String spaceNum = level1.parking(type);
            if (spaceNum != null) {
                return new String[] {level1.getLevelNum(), spaceNum};
            }
        }
        return null;
    }

    void leave(String levelId, String spaceId) {
        for (Level1 level1 : levels) {
            if (levelId.equals(level1.getLevelNum())) {
                level1.leave(spaceId);
            }
        }
    }
}

class Level1 {
    private String levelNum;
    TypeIs type;
    private Space[] spaces;

    Level1(String levelNum, Space[] spaces) {
        this.levelNum = levelNum;
        this.spaces = spaces;
    }

    public String getLevelNum() {
        return levelNum;
    }

    String parking(TypeIs type) {
        for (int i = 0; i < spaces.length; i++) {
            if (!spaces[i].isTaken() && spaces[i].type == type) {
                spaces[i].take();
                return spaces[i].getSpaceNum();
            }
        }
        return null;
    }

    void leave(String number) {
        for (Space space: spaces) {
            if (space.getSpaceNum().equals(number)) {
                space.leave();
            }
        }
    }

}

class Space {
    private String spaceNum;
    TypeIs type;
    private boolean isFull;
    public Space(String spaceNum, TypeIs type) {
        this.spaceNum = spaceNum;
        this.type = type;
        this.isFull = false;

    }

    public String getSpaceNum() {
        return spaceNum;
    }

    boolean isTaken() {
        return isFull;
    }

    boolean take() {
        if(isFull) return false;
        else {
            isFull = true;
            return  true;
        }
    }

    void leave() {
        isFull = false;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (obj instanceof Space) {
            Space space = (Space) obj;
            return space.spaceNum.equals(getSpaceNum());
        } else {
            return super.equals(obj);
        }
    }
}

enum TypeIs {
    compact,
    regular
}
