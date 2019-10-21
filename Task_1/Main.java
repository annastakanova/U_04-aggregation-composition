package by.epam.Unit04;

//Создать объект класса Государство (State), используя классы Область (Region), Район (Area), Город.
// Методы: вывести на консоль столицу, количество областей, площадь, областные центры.

import by.epam.Unit04.City;
import by.epam.Unit04.Area;
import by.epam.Unit04.Region;
import by.epam.Unit04.State;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        City city1 = new City("Минск");
        City city2 = new City("Брест");
        City city3 = new City("Витебск");
        City city4 = new City("Гродно");
        City city5 = new City("Могилев");
        City city6 = new City("Гомель");

        Area area1 = new Area("Молодеченский");
        Area area2 = new Area("Клецкий");
        Area area3 = new Area("Осиповичский");
        Area area4 = new Area("Минский");
        List<Area> areaList = new ArrayList<>();
        areaList.add(area1);
        areaList.add(area2);
        areaList.add(area3);
        areaList.add(area4);

        Region region1 = new Region("Минская", areaList, city1,12.3);
        Region region2 = new Region("Брестская", areaList, city2, 23.4);
        Region region3 = new Region("Витебская", areaList, city3, 34.5);
        Region region4 = new Region("Гродненская", areaList, city4,45.6);
        Region region5 = new Region("Могилевская", areaList, city5, 56.7);
        Region region6 = new Region("Гомельская", areaList, city6, 67.8);
        List<Region> regionList = new ArrayList<>();
        regionList.add(region1);
        regionList.add(region2);
        regionList.add(region3);
        regionList.add(region4);
        regionList.add(region5);
        regionList.add(region6);

        State state = new State("Беларусь", "Минск", regionList);

        getCapitalName(state);
        getSquareOfState(state);
        getRegionCount(state);
        getRegionCapital(state);
    }

    public static void getCapitalName(State state) {
        System.out.println("столица: " + state.getNameCapital());
    }

    public static void getRegionCount(State state) {
        System.out.println("количество областей: " + state.getRegionList().size());
    }

    public static void getSquareOfState(State state) {
        StateAction regionAction = new StateAction();
        System.out.println("площадь государства: "+regionAction.getSquareOfState(state));
    }

    public static void getRegionCapital(State state){
        System.out.print("областные центры: ");
        for (Region region:state.getRegionList()){
            System.out.print(region.getRegionCenter().getCityTitle() + ", ");
        }
    }
}