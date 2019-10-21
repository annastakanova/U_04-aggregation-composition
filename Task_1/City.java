package by.epam.Unit04;

import java.util.Objects;

public class City {
    private String cityTitle;
    boolean isCapital;
    boolean regionCenter;

    public City(String cityTitle) {
        this.cityTitle = cityTitle;
    }

    public String getCityTitle() {
        return cityTitle;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        City city = (City) o;
        return Objects.equals(cityTitle, city.cityTitle);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cityTitle);
    }

    @Override
    public String toString() {
        return "City{" +
                "title='" + cityTitle + '\'' +
                '}';
    }
}