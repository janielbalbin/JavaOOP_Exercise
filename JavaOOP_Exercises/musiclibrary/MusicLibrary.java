package musiclibrary;

import java.util.ArrayList;
import java.util.Random;

public class MusicLibrary {
    ArrayList<Song> songs = new ArrayList<>();

    public void addSong(Song s) { songs.add(s); }
    public void removeSong(Song s) { songs.remove(s); }
    public void playRandomSong() {
        if (songs.size() > 0) {
            Random rand = new Random();
            Song s = songs.get(rand.nextInt(songs.size()));
            System.out.println("Playing: " + s.title);
        }
    }
}
