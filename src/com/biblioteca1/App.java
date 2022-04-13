/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.biblioteca1;

import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {
        Library songLibrary = new Library();

        songLibrary.playlist.add(songLibrary.color);
        songLibrary.playlist.add(songLibrary.me_Llamas);
        songLibrary.playlist.add(songLibrary.todo_Para_mi);


        List<Song> songFiltered = new ArrayList<>();
        for(Song song : songLibrary.playlist){
            if(song.getGender().equals("Bachata")){  //gender = ['Bachata', 'Pop', 'Tropipop']
                songFiltered.add(song);
            }
        }

        List<Song> songFiltered2 = new ArrayList<>();
        for(Song song : songLibrary.playlist){
            if(song.getDate().equals(2020)){  // anios = [2016, 2017, 2018, 2019, 2020]
                songFiltered2.add(song);
            }
        }

        System.out.println("\n");
        System.out.println("Filtered by Gender: ");
        for (Song value : songFiltered) {
            System.out.println("> " + value);
        }

        System.out.println("\n");
        System.out.println("Filtered by year: ");
        for (Song song : songFiltered2) {
            System.out.println("> " + song);
        }


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
