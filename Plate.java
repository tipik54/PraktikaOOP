package ru.kaznu.ruslan.PraktikaOOP;

public class Plate {
    private String name;
    private int maxFood;
    private int currentFood;


    public Plate(String name, int maxFood) {
        this.name = name;
        this.maxFood = maxFood;
        this.currentFood = maxFood;
    }

    public String getName() {
        return name;
    }


    public void increaseFood(int amount) {
        if (currentFood + amount <= maxFood) {
            currentFood += amount;
        } else {
            currentFood = maxFood;
            System.out.println(name + " заполненна");
        }
        System.out.println("Еды в тарелке: " + currentFood);
    }

    public boolean decreaseFood(int amount) {
        if (amount <= currentFood) {
            currentFood -= amount;
            return true;
        } else {
            return false;
        }
    }

    public void info() {
        System.out.println("Еды в " + name + " : " + currentFood);
    }

}
