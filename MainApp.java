package ru.kaznu.ruslan.PraktikaOOP;

public class MainApp {
    public static void main(String[] args) {


        Plate plate = new Plate("Перая тарелка", 100);

        Cat[] cats = {
                new Cat("Барсик", 30),
                new Cat("Мурзик", 20),
                new Cat("Рыжик", 50),
                new Cat("Васька", 10)
        };

        plate.info();
        for (Cat cat : cats) {
            cat.eat(plate);
        }
        plate.info();

        for (Cat cat : cats) {
            System.out.println(cat.getName() + " сыт: " + cat.isFull());
        }

        plate.increaseFood(40);
        plate.info();

        // Попросим котов снова покушать
        cats[3].eat(plate);
        plate.info();
        for (Cat cat : cats) {
            System.out.println(cat.getName() + " сыт: " + cat.isFull());
        }




    }
}
