package by.epam.Unit04;

public class Therapy extends Tour {


    public Therapy(int numberOfDays, int cost, boolean food, String transport) {
        super(numberOfDays, cost, food, transport);
        this.setTourType("Лечение");
    }

    @Override
    public String toString() {
        return this.getTourType()+super.toString();
    }
}
