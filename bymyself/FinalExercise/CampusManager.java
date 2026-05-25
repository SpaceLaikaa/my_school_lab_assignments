package bymyself.FinalExercise;

import javax.swing.*;
import java.util.Collections;
import java.util.List;

public class CampusManager {
    List<CampusAsset> assets;

    public void sortAssetsByFootprint(){
        assets.sort((asset1, asset2) ->
                Double.compare(asset1.calculateCarbonFootprint(), asset2.calculateCarbonFootprint()));
    }
}
