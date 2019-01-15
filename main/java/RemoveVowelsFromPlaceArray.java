import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RemoveVowelsFromPlaceArray {

    public List<String> VowelsRemoved(List<String> place) {
        List<String> PlaceWithoutVowels = new ArrayList<String>();
        String placeName = "";
        for (int i = 0; i < place.size(); i++) {
            placeName =  place.get(i);
            placeName = placeName.replaceAll("[aeiou]", "");
            PlaceWithoutVowels.add(placeName);
        }
        return PlaceWithoutVowels;
    }
}



