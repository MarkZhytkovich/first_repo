public class Animal {
    protected String location;
    protected String food;

    protected Animal(String location, String food) {
        this.location = location;
        this.food = food;
    }

    public String getLocation() {
        return location;
    }

    public String getFood() {
        return food;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void setFood(String food) {
        this.food = food;
    }

    public void eat() {
    }


    public void makeNoise() {
        System.out.println("Это животное издает звук: ");
    }

    public void feedAnimal() {
        System.out.println("Угостить животное таким продуктом: " + getFood());
    }
}