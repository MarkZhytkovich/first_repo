public class Dog extends Animal {

    protected Dog(String location,  String name, String food) {
        super(location, food);
        this.name = name;
    }

    private String name;

    public String getFood() {
        return food;
    }

    public void setFood(String food) {
        this.food = food;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    @Override
    public void eat() {
        System.out.println("Еда для этого животного: " + food);
    }

    @Override
    public void makeNoise() {
        System.out.println("гав");
    }
}