/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.biblioteca1;

/**
 *
 * @author diana
 */
import java.util.ArrayList;

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