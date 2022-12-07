public class Rectangle extends Figure {
    public Rectangle(int side1, int side2) {
        super(side1, side2);
    }

    @Override
    void square() {
        System.out.println(getSide1() * getSide2());
    }

    @Override
    void perimeter() {
        System.out.println((getSide1() + getSide2()) * 2);
    }

}
