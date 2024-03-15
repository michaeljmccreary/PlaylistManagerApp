/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package playlistmanager;

/**
 *
 * @author micha
 */
public class LikedSongs implements LikedSongsInterface {
    
//  Variables
    private String song;
    private String artist;
    private String genre;
    
//  Default Constructor
    public LikedSongs(){
        this.song = song;
        this.artist = artist;
        this.genre = genre;
    }

//  Overloaded Constructor 
    public LikedSongs(String song, String artist, String genre) {
        this.song = song;
        this.artist = artist;
        this.genre = genre;
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

//  Methods from Interface
    @Override
    public void moveSong() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void addSong() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void displayLikedSongs() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
