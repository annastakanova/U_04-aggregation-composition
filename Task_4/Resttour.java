package by.epam.Unit04;

public class Resttour extends Tour {
    public Resttour(int numberOfDays, int cost, boolean food, String transport) {
        super(numberOfDays, cost, food, transport);
        this.setTourType("Отдых");
    }

    @Override
    public String toString() {
        return this.getTourType()+super.toString();
    }
}
