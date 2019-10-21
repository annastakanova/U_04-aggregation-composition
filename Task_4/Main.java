package by.epam.Unit04;

import java.util.ArrayList;
import java.util.List;

//Туристические путевки.
//Сформировать набор предложений клиенту по выбору туристической путевки различного типа
// (отдых, экскурсии, лечение, шопинг, круиз и т. д.) для оптимального выбора.
// Учитывать возможность выбора транспорта, питания и числа дней.
// Реализовать выбор и сортировку путевок.

public class Main {

    public static void main(String[] args) {
        Cruise cruise1 = new Cruise(10, 5520, true, "поезд");
        Cruise cruise2 = new Cruise(15, 10000, false, "самолет");
        Excursion excursion = new Excursion(25, 2450, true, "автобус");
        Therapy therapy = new Therapy(30, 800, true, "самолет");
        Resttour resttour = new Resttour(14, 1000, true, "самолет");
        Shopping shopping = new Shopping(21, 2450, true, "автобус");
        List<Tour> tourList = new ArrayList<>();
        tourList.add(cruise1);
        tourList.add(cruise2);
        tourList.add(shopping);
        tourList.add(therapy);
        tourList.add(excursion);
        tourList.add(resttour);

        TourCollection tourCollection = new TourCollection(tourList);
        TourLogic TourLogic=new TourLogic();

        System.out.println("\nПоиск тура по транспорту: ");
        Tour tour = TourLogic.findByTransport(tourList,"поезд");
        System.out.println(tour);

        TourLogic.sortOnCost(tourCollection);
        System.out.println("\nТуры после сортировки по стоимости: ");
        for (int i = 0; i < tourList.size(); i++) {
            System.out.println(tourList.get(i));
        }

        //Customer customer = new Customer("Иванов", "поезд");
        //customer.getVariantOfTraveling();

    }
}
