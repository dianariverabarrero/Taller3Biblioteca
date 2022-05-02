package com.biblioteca1;

/**
 *
 * @author Diana Marcela Rivera, kevin Martinez
 * @version 1.0.0
 */

import java.util.ArrayList;

/**
 * Se crea clase Playlist - arraylist canción, permite crear las playlist
 */
public class Playlist {

    private ArrayList<Song> playlist;

    public Playlist(){
        playlist = new ArrayList<Song>();
    }

    public void addSong(Song song){
        playlist.add(song);
    }

    public String getTitle(int index){
        return playlist.get(index).getTitle();
    }
}