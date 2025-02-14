package VarA_Task4_Chapter4;

public class Main {
    public static void main(String[] args) {
        //города
        City minsk = new City("Минск", true, true);
        City gomel = new City("Гомель", false, true);
        City brest = new City("Брест", false, true);
        City vitebsk = new City("Витебск", false, true);

        // районы
        District minskDistrict = new District("Минский район");
        minskDistrict.addCity(minsk);

        District gomelDistrict = new District("Гомельский район");
        gomelDistrict.addCity(gomel);

        District brestDistrict = new District("Брестский район");
        brestDistrict.addCity(brest);

        District vitebskDistrict = new District("Витебский район");
        vitebskDistrict.addCity(vitebsk);

        //области
        Region minskRegion = new Region("Минская область", minsk);
        minskRegion.addDistrict(minskDistrict);

        Region gomelRegion = new Region("Гомельская область", gomel);
        gomelRegion.addDistrict(gomelDistrict);

        Region brestRegion = new Region("Брестская область", brest);
        brestRegion.addDistrict(brestDistrict);

        Region vitebskRegion = new Region("Витебская область", vitebsk);
        vitebskRegion.addDistrict(vitebskDistrict);

        //государство
        State belarus = new State("Беларусь", minsk);
        belarus.addRegion(minskRegion);
        belarus.addRegion(gomelRegion);
        belarus.addRegion(brestRegion);
        belarus.addRegion(vitebskRegion);

        // Выводим информацию
        belarus.printCapital();
        belarus.printRegionCount();
        belarus.printRegionalCenters();
        System.out.println("Площадь государства: " + belarus.calculateArea() + " кв. км");
    }
}
