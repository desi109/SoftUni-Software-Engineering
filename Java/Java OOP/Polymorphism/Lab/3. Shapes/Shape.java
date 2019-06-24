public abstract class Shape {
    private double perimeter;
    private double area;
    private String name;


    protected double setPerimeter(double perimeter) {
        return this.perimeter = perimeter;
    }

    protected double setArea(double area) {
        return this.area = area;
    }

    protected String setName(String name) {
        return this.name = name;
    }

    public abstract String selectName();

    public abstract double calculatePerimeter();

    public abstract double calculateArea();

}
