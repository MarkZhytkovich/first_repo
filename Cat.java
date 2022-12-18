import java.util.Objects;

public class Cat extends Animal {
    private String name;
    protected Cat(String location, String name, String food) {
        super(location, food);
        this.name = name;
    }

    public String getFood() {
        return food;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setFood(String food) {
        this.food = food;
    }

    public String getName() {
        return name;
    }

    public String getLocation() {
        return location;
    }


    @Override
    public void eat() {
        System.out.println("Еда для этого животного: " + food);
    }
    @Override
    public void makeNoise() {
        System.out.println("мяу");
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
