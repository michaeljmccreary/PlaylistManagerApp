/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package playlistmanager;

/**
 *
 * @author Michael McCreary
 */
public class RockPlaylist implements PlaylistInterface {
    
//  Variables
    private String song;
    private String artist;
    private String genre;
    private boolean isRepeat;
    
//  Default Constructor
    public RockPlaylist(){
        this.song = song;
        this.artist = artist;
        this.genre = genre;
        this.isRepeat = isRepeat;
    }

//  Overloaded Constructor
    public RockPlaylist(String song, String artist, String genre, boolean isRepeat) {
        this.song = song;
        this.artist = artist;
        this.genre = genre;
        this.isRepeat = isRepeat;
    }

//  Getters & Setters
    public String getSong() {
        return song;
    }

    public void setSong(String song) {
        this.song = song;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public boolean isIsRepeat() {
        return isRepeat;
    }

    public void setIsRepeat(boolean isRepeat) {
        this.isRepeat = isRepeat;
    }

//  Methods from Interface
    @Override
    public void addSong() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void search() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void delete() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void display() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void moveUp() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void moveDown() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
