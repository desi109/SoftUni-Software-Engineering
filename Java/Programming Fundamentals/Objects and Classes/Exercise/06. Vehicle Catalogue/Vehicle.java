public class Vehicle {
    private String type;
    private String model;
    private String color;
    private int hp;

    public Vehicle(String type, String model, String color, int hp) {
        this.type = type;
        this.model = model;
        this.color = color;
        this.hp = hp;
    }

    public String getType() {
        return type;
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public int getHp() {
        return hp;
    }

    @Override
    public String toString() {
        return String.format("" + 
                        "Type: %s\n" + 
                        "Model: %s\n" + 
                        "Color: %s\n" + 
                        "Horsepower: %d",
                this.getType().toUpperCase().charAt(0)
                        + this.getType().substring(1),
                this.getModel(),
                this.getColor(),
                this.getHp());
    }
}
