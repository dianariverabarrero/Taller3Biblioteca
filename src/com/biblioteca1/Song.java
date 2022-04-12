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
import java.util.Date;

public class Song {
    private String title,cover,gender,description; //se reduce línea de código//
    private int id;
    private Date date;
    private double duration;



   /**
    * Se genera constructor con parámetros
    * @param title
    * @param cover
    * @param gender
    * @param description
    * @param id
    * @param date
    * @param duration 
    */
    public Song(String title, String cover, String gender, String description, int id, Date date, double duration) {
        this.title = title;
        this.id = id;
        this.date = date;
        this.duration = duration;
        this.cover = cover;
        this.gender = gender;
        this.description = description;
    }
    
        public Song() {
    }
    

    public String Title() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int Id() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date Date() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public double Duration() {
        return duration;
    }

    public void Duration(double duration) {
        this.duration = duration;
    }

    public String Cover() {
        return cover;
    }

    public void setCover(String cover) {
        this.cover = cover;
    }

    public String Gender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String Description() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}

