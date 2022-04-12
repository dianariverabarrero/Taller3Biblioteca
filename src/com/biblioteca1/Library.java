/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.biblioteca1;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author diana
 */
public class Library {
    private final Song Song;
    private List<Song> songs;

    public Library(com.biblioteca1.Song song){
        Song = song;
        this.songs = new ArrayList<>();
        new Song();
        songs.add(Song);
    }

}
