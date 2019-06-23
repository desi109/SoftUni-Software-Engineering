public class Rectangle {

    private double sideA;
    private  double sideB;

    //Constructor with 2 parameters
    public Rectangle(double sideA, double sideB) {
        this.sideA = sideA;
        this.sideB = sideB;
    }

    //Constructor with 1 parameter
    public Rectangle(double sideA) {
        this.sideA = sideA;
    }

    public double getSideA() {
        return sideA;
    }

    public double getSideB() {
        return sideB;
    }

    public  double area(){
        return this.sideA * this.sideB;
    }
}
