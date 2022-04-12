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

    //private String ArrayList name = new ArrayList<>();//


/**
 * Se extiende constructor de song y se genera constructor vacio
 * @author diana
 */

public class Playlist extends Song {
    
    public void createPlaylist() { 
        System.out.println("Write the name of the Playlist: /ln");
    }

    public Playlist(String title, String cover, String gender, String description, int id, java.util.Date date, double duration) {
        super(title, cover, gender, description, id, date, duration);
    }

    
    
    public Playlist() {
    }
    
    
    
    
    
    
    
    
    
    
    

    
    
    
    
    
    


}
