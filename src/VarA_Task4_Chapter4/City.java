package VarA_Task4_Chapter4;

public class City {
    private String name;
    private boolean isCapital;
    private boolean isRegionalCenter;


    public City(String name, boolean isCapital, boolean isRegionalCenter) {
        this.name = name;
        this.isCapital = isCapital;
        this.isRegionalCenter = isRegionalCenter;
    }


    public String getName() {
        return name;
    }

    public boolean isCapital() {
        return isCapital;
    }

    public boolean isRegionalCenter() {
        return isRegionalCenter;
    }

    // Переопределение методов
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        City city = (City) o;
        return isCapital == city.isCapital &&
                isRegionalCenter == city.isRegionalCenter &&
                name.equals(city.name);
    }

    @Override
    public int hashCode() {
        return java.util.Objects.hash(name, isCapital, isRegionalCenter);
    }

    @Override
    public String toString() {
        return name + (isCapital ? " (столица)" : "") + (isRegionalCenter ? " (областной центр)" : "");
    }
}
