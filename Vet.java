public class Vet {


    public void treatAnimal(Animal animal) {
        System.out.println(animal);
        animal.makeNoise();
        System.out.println(animal.getLocation());
        animal.eat();
        animal.feedAnimal();
    }
}