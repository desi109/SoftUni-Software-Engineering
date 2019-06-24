public class Circle extends Shape {
    private double radius;
    private String name;

    //Constructor
    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public String selectName() {
        return super.setName("Circle");
    }

    @Override
    public double calculatePerimeter() {
        return super.setPerimeter(2 * Math.PI * this.radius);
    }

    @Override
    public double calculateArea() {
        return super.setArea(Math.PI * (this.radius * this.radius));
    }
}
