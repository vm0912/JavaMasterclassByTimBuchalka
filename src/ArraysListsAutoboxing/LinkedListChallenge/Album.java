package ArraysListsAutoboxing.LinkedListChallenge;

import java.util.ArrayList;

public class Album {
    private String author;
    private ArrayList<Song> songsList = new ArrayList<>();

    public Album(String author) {
        this.author = author;

    }


    public boolean findInAlbum(Song song) {
        String songTitle = song.getTitle();
        for (Song currentSong : songsList) {
            if (currentSong.getTitle().equals(songTitle)) {
                return true;
            }
        }
        return false;
    }

    public void addASong(Song songToAdd) {
        if(!findInAlbum(songToAdd)){
            songsList.add(songToAdd);
        }
    }
}
