public class Rectangle extends Shape {
    private double sideA;
    private double sideB;
    private String name;

    //Constructor
    public Rectangle(double sideA, double sideB) {
        this.sideA = sideA;
        this.sideB = sideB;
    }

    @Override
    public String selectName() {
        return super.setName("Rectangle");
    }

    @Override
    public double calculateArea() {
        return super.setArea(this.sideA * this.sideB);
    }

    @Override
    public double calculatePerimeter() {
        return super.setPerimeter((this.sideA + this.sideB) * 2);
    }
}
