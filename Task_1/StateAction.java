package by.epam.Unit04;

import by.epam.Unit04.Area;
import by.epam.Unit04.Region;
import by.epam.Unit04.State;

public class StateAction {
    public double getSquareOfState(State state){
        double square = 0;
        for (Region region : state.getRegionList()){
                square += region.getRegionSquare();
        }
        return square;
    }
}
