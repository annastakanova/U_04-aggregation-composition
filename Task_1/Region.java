package by.epam.Unit04;

import java.util.List;
import java.util.Objects;

public class Region {
    private String regionTitle;
    private List<Area> areaList;
    private City regionCenter;
    private double regionSquare;

    public Region(String regionTitle, List<Area> areaList, City regionCenter, double regionSquare) {
        this.regionTitle = regionTitle;
        this.areaList = areaList;
        this.regionCenter = regionCenter;
        this.regionSquare = regionSquare;
    }

    public String getRegionTitle() {
        return regionTitle;
    }

    public List<Area> getAreaList() {
        return areaList;
    }

    public City getRegionCenter() {
        return regionCenter;
    }

    public Double getRegionSquare() {
        return regionSquare;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Region region = (Region) o;
        return Double.compare(region.regionSquare, regionSquare) == 0 &&
                regionTitle.equals(region.regionTitle) &&
                areaList.equals(region.areaList) &&
                regionCenter.equals(region.regionCenter);
    }

    @Override
    public int hashCode() {
        return Objects.hash(regionTitle, areaList, regionCenter, regionSquare);
    }

    @Override
    public String toString() {
        return "Region{" +
                "regionTitle='" + regionTitle + '\'' +
                ", areaList=" + areaList +
                ", regionCenter=" + regionCenter +
                ", regionSquare=" + regionSquare +
                '}';
    }
}
