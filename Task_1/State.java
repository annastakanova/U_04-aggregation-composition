package by.epam.Unit04;

import java.util.List;
import java.util.Objects;

public class State {
    private String stateTitle;
    private String capital;
    private List<Region> regionList;


    public State(String stateTitle, String сapital, List<Region> regionList) {
        this.stateTitle = stateTitle;
        this.capital = сapital;
        this.regionList = regionList;
    }

    public String getStateTitle() {
        return stateTitle;
    }

    public String getNameCapital() {
        return capital;
    }

    public List<Region> getRegionList() {
        return regionList;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        State state = (State) o;
        return Objects.equals(stateTitle, state.stateTitle) &&
                Objects.equals(capital, state.capital) &&
                Objects.equals(regionList, state.regionList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(stateTitle, capital, regionList);
    }

    @Override
    public String toString() {
        return "State{" +
                "nameState='" + stateTitle + '\'' +
                ", nameCapital='" + capital + '\'' +
                ", regionList=" + regionList +
                '}';
    }
}