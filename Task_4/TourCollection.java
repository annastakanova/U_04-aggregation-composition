package by.epam.Unit04;

import java.util.List;
import java.util.Objects;

public class TourCollection {
    List<Tour> tours;

    public TourCollection(List<Tour> tours) {
        this.tours = tours;
    }

    public List<Tour> getTours() {
        return tours;
    }

    public void setTours(List<Tour> tours) {
        this.tours = tours;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TourCollection that = (TourCollection) o;
        return tours.equals(that.tours);
    }

    @Override
    public int hashCode() {
        return Objects.hash(tours);
    }

    @Override
    public String toString() {
        return "TourCollection{" +
                "tours=" + tours +
                '}';
    }
}
