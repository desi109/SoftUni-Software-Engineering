public class Square extends Rectangle {

    //Constructor
    public Square(double sideA) {
        super(sideA);
    }

    public double area() {
        return super.getSideA() * super.getSideA();
    }
}
