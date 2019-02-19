package ood_design;

public class Animal {
    OutwardAppearance appearance;
    OutwardAppearance skin;
    OutwardAppearance leg;
    int age;
    float weight;
    String name;
    boolean isFull;

    Animal() {

    }

    Animal(OutwardAppearance appearance, int age, float weight, String name) {
        this.appearance = appearance;
        this.skin = skin;
        this.leg = leg;
        this.age = age;
        this.weight = weight;
        this.name = name;
        this.isFull = false;
    }

    public void eat(Food food) {
        if(!isFull) {
            System.out.println("Eat something");
        }
    }

    public boolean isSleep(int time) {
        return (time >= 0 && time <= 9);
    }

}

class People extends Animal{


    People(OutwardAppearance appearance, int age, float weight, String name) {
       super(appearance, age, weight, name);
    }
    public void eat() {
        super.eat(Food.meat);
    }

    public boolean isSleeo(int time) {
        return super.isSleep(time);
    }

    private void write() {
        System.out.println("People can write letters");
    }


}

class Dog extends Animal {
    Dog() {
    }
    public void eat() {
        super.eat(Food.bone);
    }

    public boolean isSleep(int time) {
        return super.isSleep(time);
    }

    private void sayWong() {
        System.out.println("Dogs can bark.");
    }




}

enum OutwardAppearance {
    eye,
    skin,
    leg,
    hand,
    tail
}

enum Food {
    food,
    bone,
    meat
}

enum Object {
    people,
    dog
}

