package opgave04.test;

import opgave04.model.Series;

import java.util.ArrayList;
import java.util.Arrays;

public class SeriesApp {
    public static void main(String[] args) {
        Series BetterCallSaul = new Series("Better Call Saul", new ArrayList<>(Arrays.asList("Saul Goodman", "Gustavo Fring", "Mike", "Howard")));

        BetterCallSaul.createEpisode(1,30,new ArrayList<>(Arrays.asList("Walter White", "Jesse Pinkman")));
        BetterCallSaul.createEpisode(2,60,new ArrayList<>(Arrays.asList("Hank", "Skylar White")));
        BetterCallSaul.createEpisode(3,60,new ArrayList<>(Arrays.asList("Tuco", "Badger")));


        System.out.println("Længden på alle episoderne i minutter i Better Call Saul er: " + BetterCallSaul.totalLength());
        System.out.println("Castet i Better Call Saul er:" + BetterCallSaul.getCast());
        System.out.println("Gæsteskuespillerne i Better Call Saul er: " + BetterCallSaul.getGuestActors());

    }

}
