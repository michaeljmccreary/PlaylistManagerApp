/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package playlistmanager;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 *
 * @author Michael McCreary
 */
public class PlayListManager {

//  A map to store playlists by the genre
    private Map<String, PlaylistInterface> playlists;

//  Constuctor
    public PlayListManager() {
        this.playlists = new HashMap<>();
    }

//  Creating an instance of the PlaylistInterface
    public class PlaylistFactory {
//       Return a playlist instance based on genre selected by the user
        public static PlaylistInterface createPlaylist(String genre) {
//          Returns the instance of Rock or Pop playlist based on what the user selected  
            if(genre.equalsIgnoreCase("Rock")){
                return new RockPlaylist();
            } else
                return new PopPlaylist();
        }
    }

//    Method to create and add a new playlist if it does not already exist
    public boolean createAndAddPlaylist(String genre, PlaylistInterface playlist) {
        if (!playlists.containsKey(genre)) {
            playlists.put(genre, playlist); // Adds the playlist to the manager
            return true; // Indicates the playlist was successfully added
        }
        return false; // Indicates a playlist for this genre already exists
    }

//    Method to return playlist based on genre
    public PlaylistInterface getPlaylist(String genre) {
        return playlists.get(genre);
    }

//    Method to check is playlist exists for given genre
    public boolean playlistExists(String genre) {
        return playlists.containsKey(genre);
    }
    
//    Method to get all the playlists this will be used for the search button to search all playlists for a song
    public Set<String> getAllPlaylistGenres() {
        return playlists.keySet();
    }
}
