/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package playlistmanager;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author Michael McCreary
 */
public class PopPlaylist implements PlaylistInterface {

    private List<Song> songs; // List to hold multiple songs
    private boolean isRepeat;

    // Default Constructor
    public PopPlaylist() {
        this.songs = new ArrayList<>();
        this.isRepeat = false;
    }

    // Constructor that sets the repeat status
    public PopPlaylist(boolean isRepeat) {
        this.songs = new ArrayList<>();
        this.isRepeat = isRepeat;
    }

//  Getters & Setters
    public List<Song> getSongs() {
        return songs;
    }

    public boolean isRepeat() {
        return isRepeat;
    }

    public void setIsRepeat(boolean isRepeat) {
        this.isRepeat = isRepeat;
    }

//  Methods from Interface
    public void addSong(Song song) {
        this.songs.add(song);
    }

    @Override
    public void display() {
//        If the playlist is empty it will alter the user
        if (songs.isEmpty()) {
            JOptionPane.showMessageDialog(null, "The playlist has no songs");
            return;
        }

        StringBuilder message = new StringBuilder("Rock Playlist: \n");
//      if the playlist is repeated display that it is
        if (isRepeat) {
            message.append("This playlist is on repeat. \n");
        }

//       Add each song to the message
        for (Song song : songs) {
            message.append(song.getArtist())
                    .append(" - ")
                    .append(song.getSong())
                    .append(" [")
                    .append(song.getGenre())
                    .append("]\n");
        }

//       Display the accumulated message
        JOptionPane.showMessageDialog(null, message.toString());
    }

    @Override
    public void moveUp(String title) {
//        a for loop to loop through the playlist
        for (int i = 0; i < songs.size(); i++) {
            Song song = songs.get(i);
//        if the song is in the playlist and not already at the top
            if (song.getSong().equalsIgnoreCase(title) && i > 0) {
//            Swap the songs
                Song temp = songs.get(i - 1);
                songs.set(i - 1, song);
                songs.set(i, temp);
                JOptionPane.showMessageDialog(null, "Song '" + title + "' moved up in the playlist");
                return;
            } else if (song.getSong().equalsIgnoreCase(title) && i == 0) {
                JOptionPane.showMessageDialog(null, "Song '" + title + "' already at the top of the playlist");
            }
        }
        JOptionPane.showMessageDialog(null, "Song '" + title + "' does not exist in the playlist");
    }

//    Inverted the move song up method
    @Override
    public void moveDown(String title) {
//        a for loop to loop through the playlist
        for (int i = 0; i < songs.size(); i++) {
            Song song = songs.get(i);
//        if the song is in the playlist and not already at the top
            if (song.getSong().equalsIgnoreCase(title) && i < songs.size() - 1) {
//            Swap the songs
                Song temp = songs.get(i + 1);
                songs.set(i + 1, song);
                songs.set(i, temp);
                JOptionPane.showMessageDialog(null, "Song '" + title + "' moved up in the playlist");
                return;
            } else if (song.getSong().equalsIgnoreCase(title) && i == songs.size() - 1) {
                JOptionPane.showMessageDialog(null, "Song '" + title + "' already at the bottom of the playlist");
            }
        }
        JOptionPane.showMessageDialog(null, "Song '" + title + "' does not exist in the playlist");
    }

//    Copied from the pop playlist class
    @Override
    public void deleteSong(String song) {
        String normalizedTitle = song.toLowerCase();

//      Use an iterator to remove items while iterating
        Iterator<Song> iterator = songs.iterator();
        while (iterator.hasNext()) {
            Song currentSong = iterator.next();
//           Check if the current song title matches the song the user wants tyo delete
            if (currentSong.getSong().toLowerCase().equals(normalizedTitle)) {
//              If a match is found remove the song from the list.
                iterator.remove();
                JOptionPane.showMessageDialog(null, "Song '" + currentSong.getSong() + "' has been deleted from the Pop Playlist");
                return;
            }
        }

//        if the song dis not part of the playlist
        JOptionPane.showMessageDialog(null, "No song found matching the title: " + song + " in the Pop Playlist");
    }

    @Override
    public List<Song> search(String search) {
        //       an array list to hold songs that match the users search
        List<Song> foundSongs = new ArrayList<>();
        for (Song song : songs) {
//          change song title to lowercase to make a search more effecient
            if (song.getSong().toLowerCase().contains(search.toLowerCase())) {
//              if a song is found to match the search it gets added to the array list                
                foundSongs.add(song);
            }
        }
//        Return array list
        return foundSongs;
    }
}
