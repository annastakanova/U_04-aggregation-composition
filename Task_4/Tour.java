package by.epam.Unit04;
import java.util.Objects;

public class Tour {
    private int numberOfDays;
    private int cost;
    private boolean food;
    private String transport;
    private String tourType;

    public Tour(int numberOfDays, int cost, boolean food, String transport) {
        this.numberOfDays = numberOfDays;
        this.cost = cost;
        this.food = food;
        this.transport = transport;
    }

    public void setNumberOfDays(int numberOfDays) {
        this.numberOfDays = numberOfDays;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public void setFood(boolean food) {
        this.food = food;
    }

    public void setTransport(String transport) {
        this.transport = transport;
    }

    public String getTransport() {
        return transport;
    }

    public int getNumberOfDays() {
        return numberOfDays;
    }

    public int getCost() {
        return cost;
    }

    public boolean isFood() {
        return food;
    }

    public void setTourType(String tourType) {
        this.tourType = tourType;
    }

    public String getTourType() {
        return tourType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Tour tour = (Tour) o;
        return numberOfDays == tour.numberOfDays &&
                cost == tour.cost &&
                food == tour.food &&
                Objects.equals(transport, tour.transport) &&
                Objects.equals(tourType, tour.tourType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(numberOfDays, cost, food, transport);
    }

    @Override
    public String toString() {
        return ": " +numberOfDays + " дней, " + cost + "уе, питание включено = " + food + ", " + transport;
    }
}
