public class Main {

    public static void main(String [] args) {
        Engineer Mike = new Engineer("Mike", "Abrams", "developer", 3000);
        Mike.displayInfo();
        Engineer Max = new Engineer("Max", "Smith", "devops", 2500);
        Max.displayInfo();
        Engineer Tim = new Engineer("Tim", "Piers", "QA", 2300);
        Tim.displayInfo();

        Car mercedes = new Car(7, 200,5);
        mercedes.displayInfo();

        Sun.daybreak();
        Sun.daybreak();
        Sun.sunrisesCount();


        Vet vet = new Vet();
        Animal[] animals = new Animal[4];
        animals[0] = new Dog("Minsk", "Тузик", "Мясо");
        animals[1] = new Cat("Brest", "Барсик", "Колбаса");
        animals[2] = new Parrot("Grodno", "Кеша", "Пшено");
        animals[3] = new Horse("Gomel", "Саша", "Овес");

        for (Animal animal : animals) {
            vet.treatAnimal(animal);
        }


    }
}