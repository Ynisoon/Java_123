package VarA_Task4_Chapter4;

import java.util.ArrayList;
import java.util.List;

public class Region {
    private String name;
    private City regionalCenter;
    private List<District> districts;


    public Region(String name, City regionalCenter) {
        this.name = name;
        this.regionalCenter = regionalCenter;
        this.districts = new ArrayList<>();
    }


    public void addDistrict(District district) {
        districts.add(district);
    }

    public String getName() {
        return name;
    }

    public City getRegionalCenter() {
        return regionalCenter;
    }

    public List<District> getDistricts() {
        return districts;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Region region = (Region) o;
        return name.equals(region.name) &&
                regionalCenter.equals(region.regionalCenter) &&
                districts.equals(region.districts);
    }

    @Override
    public int hashCode() {
        return java.util.Objects.hash(name, regionalCenter, districts);
    }

    @Override
    public String toString() {
        return "Область: " + name + ", Областной центр: " + regionalCenter + ", Районы: " + districts;
    }
}
