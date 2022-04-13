/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.biblioteca1;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class App {
    public static void main(String[] args) throws Exception {
        ArrayList<Song> playlist = new ArrayList<>();

        Song song1 = new Song("Color", "Bachata",
                "gilbertoDaza.png",
                "Album Daza",
                3.37,
                1,
                2020);

        Song song2 = new Song("Me Llamas", "Pop",
                "gilbertoDaza.png",
                "Album Daza",
                3.43,
                2,
                2017);

        playlist.add(song1);
        playlist.add(song2);

        List<Song> songFiltered = new ArrayList<>();
        for(Song song : playlist){
            if(song.getGender().equals("Pop")){
                songFiltered.add(song);
            }
        }
        System.out.println("Filtrado por Nombre");
        System.out.println(songFiltered);

        List<Song> songFiltered2 = new ArrayList<>();
        for(Song song : playlist){
            if(song.getDate().equals(2020)){
                songFiltered2.add(song);
            }
        }

        System.out.println("Filtrado por Anio");
        System.out.println(songFiltered2);



        /*
        System.out.println("\n");
        System.out.println("------------------------------");
        System.out.println("My Playlist\n");

        int count = playlist.size();
        for (Song song : playlist) {
            System.out.println("Cancion: " + song);
        }
        System.out.println("\n");
        * */
    }
}
