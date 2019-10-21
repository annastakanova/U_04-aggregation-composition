package by.epam.Unit04;

public class Excursion extends Tour {
    public Excursion(int numberOfDays, int cost, boolean food, String transport) {
        super(numberOfDays, cost, food, transport);
        this.setTourType("Экскурсия");
    }

    @Override
    public String toString() {
        return this.getTourType()+super.toString();
    }
}