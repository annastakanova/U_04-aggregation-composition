package by.epam.Unit04;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Arrays;

public class TourLogic {

    public Tour findByTransport(List<Tour> tourList, String transport) {
        //Tour[] result = new Tour[0]; 
        for (Tour tour: tourList) {
            if (tour.getTransport() == transport) {
                //result = extendArr(result, tour);
                return tour;                         //как вернуть список?
                //System.out.println(tour);
            }
        }
        return null;
    }

//    private Tour[] extendArr(Tour[] result, Tour t) { 
//        result = Arrays.copyOf(result, result.length + 1); 
//        result[result.length - 1] = t; 
//        return result; 
//    } 

    public TourCollection sortOnCost(TourCollection tourList) {
        Collections.sort(tourList.getTours(), Comparator.comparing(Tour::getCost));
        return tourList;
    }
}