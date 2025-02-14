package VarA_Task4_Chapter4;

import java.util.ArrayList;
import java.util.List;

public class District {
    private String name;
    private List<City> cities;

    // Конструктор
    public District(String name) {
        this.name = name;
        this.cities = new ArrayList<>();
    }


    public void addCity(City city) {
        cities.add(city);
    }


    public String getName() {
        return name;
    }

    public List<City> getCities() {
        return cities;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        District district = (District) o;
        return name.equals(district.name) && cities.equals(district.cities);
    }

    @Override
    public int hashCode() {
        return java.util.Objects.hash(name, cities);
    }

    @Override
    public String toString() {
        return "Район: " + name + ", Города: " + cities;
    }
}

