

class Vehicle {

    enum Type {
        CITYCAR,
        FAMILY,
        EXECUTIVE,
        MINIVAN,
        CROSSOVER,
        SUV
    }

    private String regNumber;
    private Type type;
    private int manufacturingYear;
    private String brand;
    private String colour;

    Vehicle(String regNumber, Type type, int manufacturingYear, String brand, String colour) {
        this.regNumber = regNumber;
        this.type = type;
        this.manufacturingYear = manufacturingYear;
        this.brand = brand;
        this.colour = colour;
    }

    String getRegNumber() {
        return regNumber;
    }

    Type getType() {
        return type;
    }

    int getManufacturingYear() {
        return manufacturingYear;
    }

    String getBrand() {
        return brand;
    }

    String getColour() {
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

    @Override
    public String toString() {
        return  "regNumber='" + regNumber + '\'' +
                ", type=" + type +
                ", manufacturingYear=" + manufacturingYear +
                ", brand='" + brand + '\'' +
                ", colour='" + colour + '\'';
    }
}
