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
public interface PlaylistInterface {
    
        void addSong(Song song);
        void deleteSong(String song);
        void display();
        void setIsRepeat(boolean isRepeat);
        void moveUp(String song);
        void moveDown(String title);
        List<Song> search(String search);
}
