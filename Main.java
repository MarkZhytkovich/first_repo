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

        Sun.daybreak(789);

    }
}