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
        void delete();
        void display();
        void moveUp();
        void moveDown();
}
