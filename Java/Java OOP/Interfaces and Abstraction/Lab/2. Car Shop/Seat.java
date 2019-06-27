import java.io.Serializable;

public class Seat implements Car, Serializable {
    private String countryProduced;
    private String model;
    private String color;
    private Integer horsePower;

    public Seat(String countryProduced, String model, String color, Integer horsePower) {
        this.countryProduced = countryProduced;
        this.model = model;
        this.color = color;
        this.horsePower = horsePower;
    }

    @Override
    public String getModel() {
        return this.model;
    }

    @Override
    public String getColor() {
        return this.color;
    }

    @Override
    public Integer getHorsePower() {
        return this.horsePower;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb
                .append(String.format("%s is %s and have %d horse powers",
                        this.getModel(),
                        this.getColor(),
                        this.getHorsePower()))
                .append(System.lineSeparator())
                .append(String.format("This is %s produced in %s and have %d tires",
                        this.getModel(),
                        this.countryProduced,
                        TIRES));

        return sb.toString();
    }
}


