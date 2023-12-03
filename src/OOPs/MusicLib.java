package OOPs;

import java.util.ArrayList;
import java.util.Random;

class Song{
    String name;
    String artist;

    public Song(String name,String artist) {
        this.name = name;
        this.artist=artist;
    }

    public String getName() {
        return name;
    }

    public String getArtist() {
        return artist;
    }
}
public class MusicLib {
    ArrayList<Song> playList;

    public MusicLib() {
        this.playList = new ArrayList<>();
    }

    ArrayList<Song> addSong(Song songs){
        playList.add(songs);
        return playList;
    }
    void random(){
        int size = playList.size();
        Random rand = new Random();
        int index = rand.nextInt(size);
        System.out.println("Now playing: " + playList.get(index).getName() + " by " + playList.get(index).getArtist());
    }


    public static void main(String[] args) {
        MusicLib library = new MusicLib();
        library.addSong(new Song("Midnight Train to Georgia", "Gladys Knight & the Pips"));
        library.addSong(new Song("Stairway to Heaven", "Led Zeppelin"));
        library.addSong(new Song("Imagine", "John Lennon"));
        library.addSong(new Song("All by Myself", "Eric Carmen"));
        library.addSong(new Song("What'd I Say", "Ray Charles"));
        library.addSong(new Song("Walking in Memphis", "Marc Cohn"));
        library.addSong(new Song("In the Air Tonight", "Phil Collins"));

        System.out.println("All songs:");
        for (Song song: library.playList) {
            System.out.println(song.getName() + " by " + song.getArtist());
        }
        System.out.println("\n**Playing Random Song**");
        library.random();
        System.out.println();
        library.random();
        System.out.println();
        library.random();
    }

    }

