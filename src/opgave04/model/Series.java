package opgave04.model;

import java.util.ArrayList;

public class Series {
    private String title;
    private ArrayList<String> cast;
    private ArrayList<Episode> episodes = new ArrayList<>();

    public Series(String title, ArrayList<String> cast){
        this.title = title;
        this.cast = cast;
    }

    public String getTitle() {
        return title;
    }

    public ArrayList<String> getCast() {
        return cast;
    }

    public ArrayList<Episode> getEpisodes(){
        return new ArrayList<>(episodes);
    }
    public Episode createEpisode(int number, int lenghtMinutes, ArrayList<String> guestActors){
        Episode episode = new Episode(number, lenghtMinutes,guestActors);
        episodes.add(episode);
        return episode;
    }
    /**
     * Return the total length (in minutes) of all the
     * episodes in the series.
     */
    public int totalLength(){
        int totallenght = 0;
        for (Episode episode : episodes) {
            totallenght += episode.getLenghtMinutes();
        }
        return totallenght;
    }

    /**
     * Return the total list of all guest actors from all episodes.
     */
    public String getGuestActors(){
        String allActors = "";
        for (Episode episode : episodes) {
            allActors += episode.getGuestActors();
        }
        return allActors;
    }
}
