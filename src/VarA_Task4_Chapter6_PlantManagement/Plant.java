package VarA_Task4_Chapter6_PlantManagement;

public interface Plant {
    void setInfo(String name, String origin, String type);
    String getInfo();
    void water();
    void setTemperature(int temperature);
    void setLighting(String lighting);
}
