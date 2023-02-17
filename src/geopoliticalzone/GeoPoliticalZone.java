package geopoliticalzone;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public enum GeoPoliticalZone {
    NORTH_EAST(),
    NORTH_WEST(),
    NORTH_CENTRAL("KWARA", "KOGI", "NIGER", "FCT"),
    SOUTH_WEST("LAGOS", "ONDO","EKITI", "OGUN"),
    SOUTH_EAST(),
    SOUTH_SOUTH();

    private List<String> theStates = new ArrayList<>();
    GeoPoliticalZone(String... states){
        theStates = Arrays.asList(states);
    }

    public static GeoPoliticalZone getPoliticalZone(String state){
        for(GeoPoliticalZone geoPoliticalZone : values()){
            if(geoPoliticalZone.theStates.contains(state.toUpperCase())){
                return geoPoliticalZone;
            }
        }
        throw new RuntimeException("The state you selected is incorrect, kindly check again");
    }
}
