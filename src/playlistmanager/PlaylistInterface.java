/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package playlistmanager;

/**
 *
 * @author Michael McCreary
 */
public interface PlaylistInterface {
    
        void addSong(Song song);
        void search();
        void deleteSong(Song song);
        void display();
        void setIsRepeat(boolean isRepeat);
        void moveUp();
        void moveDown();
        void createPlaylist(String genre);
}
