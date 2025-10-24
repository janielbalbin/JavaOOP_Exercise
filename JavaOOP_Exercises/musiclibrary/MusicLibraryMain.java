package musiclibrary;

public class MusicLibraryMain {
    public static void main(String[] args) {
        MusicLibrary lib = new MusicLibrary();
        lib.addSong(new Song("Halo"));
        lib.addSong(new Song("Perfect"));
        lib.playRandomSong();
    }
}
