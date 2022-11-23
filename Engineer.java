public class Engineer {
    String name;
    String surname;
    String position;
    int salary;

    public Engineer(String name, String surname, String position, int salary) {
        this.name = name;
        this.surname = surname;
        this.position = position;
        this.salary = salary;
    }

    public void displayInfo() {
        System.out.println("Engineer's name: \n" + name + "\nEngineer's surname: \n" + surname + "\nEngineer's position: \n" + position + "\nEngineer's salary: \n" + salary);
    }
}
