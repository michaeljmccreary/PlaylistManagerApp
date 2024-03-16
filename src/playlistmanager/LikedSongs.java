/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package playlistmanager;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;
import javax.swing.JOptionPane;

/**
 *
 * @author Michael McCreary
 */
public class LikedSongs implements LikedSongsInterface {

//   Variables
    private Stack<Song> likedList = new Stack<>();
    private Song lastLikedSong;
    private boolean movedSong = false;

    public Song getLastLikedSong() {
        return lastLikedSong;
    }

    public void setLastLikedSong(Song lastLikedSong) {
        this.lastLikedSong = lastLikedSong;
    }

    // Default Constructor
    public LikedSongs() {

    }

    // Getters & Setters
    public Stack<Song> getLikedList() {
        return likedList;
    }

    public void setLikedList(Stack<Song> likedList) {
        this.likedList = likedList;
    }

//  Methods from Interface
    @Override
    public void moveSong() {
//     Boolean to check if a song has already been moved
        if (movedSong) {
//         If a song has already been moved throw an alert to the user as only the last liked song is allowed to be moved
            JOptionPane.showMessageDialog(null, "You already added the last liked song to the genre Playlist");
        } else if (likedList.isEmpty()) {
//         If the user has not liked any songs, alert them of the fact
            JOptionPane.showMessageDialog(null, "You have not liked any songs");
//         If they user has liked songs and not moved any remove the last liked song and save it to a variable 
        } else {
            lastLikedSong = likedList.pop();
//          makes the method true meaning the last liked song was moved 
            movedSong = true;
        }
    }

    @Override
    public void addSong(Song song) {
        likedList.push(song);
//      resets moved song to false if they user likes another song after moving a song already
        movedSong = false;
    }

    @Override
    public void displayLikedSongs() {
        StringBuilder sb = new StringBuilder();
        for (Song song : likedList) {
            sb.append(song.getSong()).append(" by ").append(song.getArtist()).append(" [").append(song.getGenre()).append("]\n");
        }
        JOptionPane.showMessageDialog(null, sb.toString());
    }

//   Method copied from pop playlist class
    @Override
    public List<Song> search(String search) {
//       an array list to hold songs that match the users search
        List<Song> foundSongs = new ArrayList<>();
        for (Song song : likedList) {
//            change song title to lowercase to make a search more effecient
            if (song.getSong().toLowerCase().contains(search.toLowerCase())) {
//                if a song is found to match the search it gets added to the array list
                foundSongs.add(song);
            }
        }
//        return array list
        return foundSongs;
    }
}
