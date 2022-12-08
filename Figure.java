abstract class Figure {
    private int side1;
    private int side2;

    public Figure(int side1, int side2) {
        this.side1 = side1;
        this.side2 = side2;
    }

    abstract void square();
    abstract void perimeter();

    public int getSide1() {
        return side1;
    }

    public int getSide2() {
        return side2;
    }
}
