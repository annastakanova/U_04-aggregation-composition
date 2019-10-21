package by.epam.Unit04;

public class Shopping extends Tour {


    public Shopping(int numberOfDays, int cost, boolean food, String transport) {
        super(numberOfDays, cost, food, transport);
        this.setTourType("Шопинг");
    }

    @Override
    public String toString() {
        return this.getTourType()+super.toString();
    }
}