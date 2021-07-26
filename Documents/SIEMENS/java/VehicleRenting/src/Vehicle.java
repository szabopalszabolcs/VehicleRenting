import java.time.Year;

/**
 * Created by Szabi on 26.07.2021.
 */
public class Vehicle {

    public enum Type {
        CITYCAR,
        FAMILY,
        EXECUTIVE,
        MINIVAN,
        CROSSOVER,
        SUV
    }

    private String regNumber;
    private Type type;
    private Year manufacturingYear;
    private String brand;
    private String colour;

    public Vehicle(String regNumber, Type type, Year manufacturingYear, String brand, String colour) {
        this.regNumber = regNumber;
        this.type = type;
        this.manufacturingYear = manufacturingYear;
        this.brand = brand;
        this.colour = colour;
    }

    public String getRegNumber() {
        return regNumber;
    }

    public Type getType() {
        return type;
    }

    public Year getManufacturingYear() {
        return manufacturingYear;
    }

    public String getBrand() {
        return brand;
    }

    public String getColour() {
        return colour;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Vehicle vehicle = (Vehicle) o;

        return getRegNumber() != null ? getRegNumber().equals(vehicle.getRegNumber()) : vehicle.getRegNumber() == null;

    }

    @Override
    public int hashCode() {
        return getRegNumber() != null ? getRegNumber().hashCode() : 0;
    }
}
