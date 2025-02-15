package VarA_Task4_Chapter6_PlantManagement;

import java.util.ArrayList;
import java.util.List;

public class Greenhouse {

        private List<Plant> plants = new ArrayList<>();


public void addPlant(Plant plant) {
    plants.add(plant);
    }

    public void removePlantByType(String type){
        plants.removeIf(p -> p.getInfo().contains(type));
    }

    public void listPlants(){

        for (Plant plant : plants){
            System.out.println(plant.getInfo());
        }

    }
}
