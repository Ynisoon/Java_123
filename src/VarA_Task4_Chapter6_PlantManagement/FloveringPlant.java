package VarA_Task4_Chapter6_PlantManagement;

public class FloveringPlant  implements  Plant {

    private String name;
    private String origin;
    private String type;

    @Override
    public void setInfo(String name, String origin, String type) {

        this.name = name;
        this.origin = origin;
        this.type = type;

    }

    @Override
    public String getInfo() {
        return "Цветковое растение: " + name + ", происхождение: " + origin + ", тип: " + type;
    }

    @Override
    public void water() {
        System.out.println(name + " полито.");
    }

    @Override
    public void setTemperature(int temperature) {
        System.out.println("Температура для " + name + " установлена на " + temperature + "C.");
    }

    @Override
    public void setLighting(String lighting) {
        System.out.println("Освещение для " + name + " установлено: " + lighting);
    }
}
