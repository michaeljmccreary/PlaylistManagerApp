/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package playlistmanager;

import java.util.List;

/**
 *
 * @author Michael McCreary
 */
public interface LikedSongsInterface {
    
    void moveSong();
    void addSong(Song song);
    void displayLikedSongs();
    List<Song> search(String search);
    
}
