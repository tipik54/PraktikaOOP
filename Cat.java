package ru.kaznu.ruslan.PraktikaOOP;

public class Cat {
    private String name;
    private int fullness;
    private boolean full;

    public Cat(String name, int fullness) {
        this.name = name;
        this.fullness = fullness;
        this.full = false;
    }

    public boolean isFull() {
        return full;
    }

    public String getName() {
        return name;
    }

    public void eat(Plate plate) {
        if (!full && plate.decreaseFood(fullness)) {
            full = true;
            System.out.println(name + " сыт");
        } else {
            System.out.println(name + " не поел, еды не достаточно, добавьте еды в " + plate.getName());
        }
    }

}
