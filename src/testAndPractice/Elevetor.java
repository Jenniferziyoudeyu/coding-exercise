package testAndPractice;

public class Elevetor {
    public boolean status;
    public float maxWeight;
    private int level;

    public Elevetor(boolean doorOpenStatus, boolean goUp, int speed, int maxWeight) {
        this.level = 0;
    }

    public boolean overWeight(int weight) {
        int numOfPeople = 0;
        Elevetor elevetor = new Elevetor(false, true, 2, 1000);
        while (numOfPeople * weight < elevetor.maxWeight) {
            numOfPeople += 1;
        }
        return true;
    }
}
//
//class a extends Elevetor {
//    public a(boolean doorOpenStatus, boolean goUp, int speed, int maxWeight) {
//        super(doorOpenStatus, goUp, speed, maxWeight);
//    }
//
//    @Override
//    public boolean overWeight(int weight) {
//       boolean superRes = super.overWeight(weight);
//        return !superRes;
//    }
//}
