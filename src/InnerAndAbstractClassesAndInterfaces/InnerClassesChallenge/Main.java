package InnerAndAbstractClassesAndInterfaces.InnerClassesChallenge;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    private static boolean quit = false;
    private static ArrayList<Album> albums = new ArrayList<>();
    private static boolean forwardIteration = true;


    public static void main(String[] args) {
        LinkedList<Song> playlist = new LinkedList<>();

        Album minutesToMidnight = new Album("Linkin Park");
        Album hybridTheory = new Album("Linkin Park");
        minutesToMidnight.addASong(new Song("Given up", 320));
        minutesToMidnight.addASong(new Song("In Between", 320));
        minutesToMidnight.addASong(new Song("Shadow of the day", 320));

        hybridTheory.addASong(new Song("Papercut", 320));
        hybridTheory.addASong(new Song("Runaway", 320));
        hybridTheory.addASong(new Song("In the end", 320));
        hybridTheory.addASong(new Song("One step closer", 320));
        hybridTheory.addASong(new Song("A place for my head", 320));
        hybridTheory.addASong(new Song("Forgotten", 320));
        hybridTheory.addASong(new Song("Crawling", 320));

        albums.add(minutesToMidnight);
        albums.add(hybridTheory);

        addSongToPlaylist(new Song("Papercut", 320), playlist);
        addSongToPlaylist(new Song("New Divide", 320), playlist);
        addSongToPlaylist(new Song("Runaway", 320), playlist);
        addSongToPlaylist(new Song("In the end", 320), playlist);
        addSongToPlaylist(new Song("Given up", 320), playlist);
        addSongToPlaylist(new Song("Crawling", 320), playlist);
        addSongToPlaylist(new Song("Forgotten", 320), playlist);
        addSongToPlaylist(new Song("In Between", 320), playlist);

        ListIterator<Song> listIterator = playlist.listIterator();


        printMenu();
        if (listIterator.hasNext()) {
            System.out.println("Currently playing -> " + listIterator.next().getTitle());
        }
        while (!quit) {
            System.out.println("------------------");
            int input = scanner.nextInt();
            scanner.nextLine();
            switch (input) {
                case 0:
                    quit();
                    break;
                case 1:
                    printPlaylist(playlist);
                    break;
                case 2:
                    nextSong(listIterator);
                    break;
                case 3:
                    previousSong(listIterator);
                    break;
                case 4:
                    replay(listIterator);
                    break;
                case 5:
                    removeFromPlaylist(listIterator);
                    break;

            }
        }
    }

    private static void removeFromPlaylist(ListIterator<Song> listIterator) {
        System.out.print("Removing -> ");
        if (forwardIteration) {
            if (listIterator.hasPrevious()) {
                System.out.println(listIterator.previous().getTitle());
                listIterator.remove();
            }
        } else {
            if (listIterator.hasNext()){
                System.out.println(listIterator.next().getTitle());
                listIterator.remove();
            }

        }
        nextSong(listIterator);
    }

    private static void printPlaylist(LinkedList<Song> playlist) {
        System.out.println("\nCurrent playlist: ");
        for (Song song : playlist) {
            System.out.println(song.getTitle());
        }
    }

    private static void replay(ListIterator<Song> listIterator) {
        System.out.println("Replaying the song -> ");
        if (forwardIteration) {
            System.out.println(listIterator.previous().getTitle());
            listIterator.next();
        } else {
            System.out.println(listIterator.next().getTitle());
            listIterator.previous();
        }

    }

    private static void previousSong(ListIterator<Song> listIterator) {
        if (forwardIteration) {
            if (listIterator.hasPrevious()) {
                listIterator.previous();
            }
            forwardIteration = false;
        }
        if (listIterator.hasPrevious()) {
            System.out.println("Changing to the previous song -> " + listIterator.previous().getTitle());
        } else {
            System.out.println("We are at the beginning of the playlist.");
            forwardIteration = true;
        }
    }

    private static void nextSong(ListIterator<Song> listIterator) {
        //the direction is set to backwards
        if (!forwardIteration) {
            if (listIterator.hasNext()) {
                listIterator.next();
            }
            forwardIteration = true;
        }
        if (listIterator.hasNext()) {
            System.out.println("Changing to the next song -> " + listIterator.next().getTitle());
        } else {
            System.out.println("We are at the end of the playlist.");
            forwardIteration = false;
        }


    }

    private static void quit() {
        System.out.println("Exiting the playlist menu...");
        quit = true;
    }

    private static void printMenu() {
        System.out.println("Please press below listed keys for options: ");
        System.out.println("0- quit");
        System.out.println("1- print playlist");
        System.out.println("2- next song");
        System.out.println("3- previous song");
        System.out.println("4- replay");
        System.out.println("5- remove a song from the playlist\n\n");

    }


    private static void addSongToPlaylist(Song song, LinkedList<Song> playlist) {
        if (findAlbum(song)) {
            playlist.add(song);
            return;
        }
        System.out.println("The song " + song.getTitle() + " isn't present in any album, not adding to the playlist...");
    }

    private static boolean findAlbum(Song song) {
        for (Album album : albums) {
            if (album.findInAlbum(song)) {
                return true;
            }
        }
        return false;
    }
}
