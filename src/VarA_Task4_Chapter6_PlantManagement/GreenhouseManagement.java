package VarA_Task4_Chapter6_PlantManagement;

public class GreenhouseManagement {
    public static void main(String[] args) {
        Greenhouse greenhouse = new Greenhouse();

        Bush bush = new Bush();
        bush.setInfo("Роза", "Франция", "Куст");

        FloveringPlant flower = new FloveringPlant();
        flower.setInfo("Орхидея", "Бразилия", "Цветок");

        IndoorPlant indoorPlant = new IndoorPlant();
        indoorPlant.setInfo("Фикус", "Индонезия", "Комнатное растение");

        greenhouse.addPlant(bush);
        greenhouse.addPlant(flower);
        greenhouse.addPlant(indoorPlant);

        System.out.println("Список растений в оранжерее:");
        greenhouse.listPlants();

        bush.water();
        flower.setTemperature(22);
        indoorPlant.setLighting("Яркий свет");

        greenhouse.removePlantByType("Куст");

        System.out.println("Список растений после удаления кустов:");
        greenhouse.listPlants();
    }
}
