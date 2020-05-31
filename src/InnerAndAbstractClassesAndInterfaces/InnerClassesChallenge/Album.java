package InnerAndAbstractClassesAndInterfaces.InnerClassesChallenge;

import java.util.ArrayList;
import java.util.List;

public class Album {
    private String author;
    private SongList songList;
//    private ArrayList<Song> songsList = new ArrayList<>();

    public Album(String author) {
        this.author = author;
        this.songList = new SongList();

    }


    public boolean findInAlbum(Song song) {
//        String songTitle = song.getTitle();
//        for (Song currentSong : songsList) {
//            if (currentSong.getTitle().equals(songTitle)) {
//                return true;
//            }
//        }
//        return false;
        return this.songList.findSong(song);
    }

    public void addASong(Song songToAdd) {
//        if(!findInAlbum(songToAdd)){
//            songsList.add(songToAdd);
//        }
        this.songList.addASong(songToAdd);
    }

    private class SongList {
        private List<Song> songList;

        public SongList() {
            this.songList = new ArrayList<>();
        }

        private boolean addASong(Song songToAdd){
            if(!findSong(songToAdd)){
                songList.add(songToAdd);
                return true;
            }
            return false;
        }

        private boolean findSong(Song song){
            String songTitle = song.getTitle();
            for (Song currentSong : songList) {
                if (currentSong.getTitle().equals(songTitle)) {
                    return true;
                }
            }
            return false;
        }

    }
}
