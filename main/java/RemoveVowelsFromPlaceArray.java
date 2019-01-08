import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RemoveVowelsFromPlaceArray {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String placeName = "";
        List<String> places = new ArrayList<String>();
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            placeName = sc.next();
            places.add(placeName);
        }

        List<String> NameWithoutVowels = new ArrayList<String>();
        NameWithoutVowels=VowelsRemoved(places);
        System.out.println(NameWithoutVowels);

        int j = 0;
        for (int i = 0; i < NameWithoutVowels.size(); i++) {
            System.out.println(" Place Name without Vowels:" + i + " " + NameWithoutVowels.get(i));
            j++;
        }

    }

    public static List<String> VowelsRemoved(List<String> place) {
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



