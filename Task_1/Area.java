package by.epam.Unit04;

import java.util.Objects;

public class Area {
    private String areaTitle;

    public Area(String areaTitle) {
        this.areaTitle = areaTitle;
    }

    public String getAreaTitle() {
        return areaTitle;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Area area = (Area) o;
        return areaTitle.equals(area.areaTitle);
    }

    @Override
    public int hashCode() {
        return Objects.hash(areaTitle);
    }

    @Override
    public String toString() {
        return "Area{" +
                "areaTitle='" + areaTitle + '\'' +
                '}';
    }
}
