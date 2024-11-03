package opgave04.model;

import java.util.ArrayList;

public class Episode {
    private int number;
    private int lenghtMinutes;
    private ArrayList<String> guestActors;

    public Episode(int number, int lenghtMinutes, ArrayList<String> guestActors){
        this.number = number;
        this.lenghtMinutes = lenghtMinutes;
        this.guestActors = guestActors;
    }

    public int getNumber() {
        return number;
    }

    public int getLenghtMinutes() {
        return lenghtMinutes;
    }

    public ArrayList<String> getGuestActors() {
        return guestActors;
    }
}
