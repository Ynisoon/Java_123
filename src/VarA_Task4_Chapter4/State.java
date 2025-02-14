package VarA_Task4_Chapter4;

import java.util.ArrayList;
import java.util.List;

public class State {

    private String name;
    private City capital;
    private List<Region> regions;

    // Конструктор
    public State(String name, City capital) {
        this.name = name;
        this.capital = capital;
        this.regions = new ArrayList<>();
    }

    // Добавление области в государство
    public void addRegion(Region region) {
        regions.add(region);
    }

    // Метод для вывода столицы
    public void printCapital() {
        System.out.println("Столица государства " + name + ": " + capital.getName());
    }

    // Метод для вывода количества областей
    public void printRegionCount() {
        System.out.println("Количество областей в государстве " + name + ": " + regions.size());
    }

    // Метод для вывода областных центров
    public void printRegionalCenters() {
        System.out.println("Областные центры государства " + name + ":");
        for (Region region : regions) {
            System.out.println(region.getRegionalCenter().getName());
        }
    }

    // Метод для вычисления площади (примерная реализация)
    public double calculateArea() {
        double totalArea = 0;
        for (Region region : regions) {
            totalArea += region.getDistricts().size() * 1000; // Примерный расчет
        }
        return totalArea;
    }

    // Переопределение методов
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        State state = (State) o;
        return name.equals(state.name) &&
                capital.equals(state.capital) &&
                regions.equals(state.regions);
    }

    @Override
    public int hashCode() {
        return java.util.Objects.hash(name, capital, regions);
    }

    @Override
    public String toString() {
        return "Государство: " + name + ", Столица: " + capital + ", Области: " + regions;
    }
}

