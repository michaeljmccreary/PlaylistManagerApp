/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package playlistmanager;

import java.util.ArrayList;
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
    public void search() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
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
    public void moveUp() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void moveDown() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void createPlaylist(String genre) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void deleteSong(Song song) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
