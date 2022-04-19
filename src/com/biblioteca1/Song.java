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
public class Song {
    private String title;
    private String gender;
    private String cover;
    private String description;
    private Double duration;
    private int id;
    private Integer date;

    public Song(){
    }

    public Song(String title, String gender, String cover, String description, Double duration, int id, int date) {
        this.title = title;
        this.gender = gender;
        this.cover = cover;
        this.description = description;
        this.duration = duration;
        this.id = id;
        this.date = date;
    }

    public String getTitle() { return this.title;}

    public void setTitle(String title) {  this.title = title;  }

    public String getGender() { return this.gender; }

    public void setGender(String gender) { this.gender = gender;  }

    public String getCover() { return this.cover; }

    public void setCover(String cover) {  this.cover = cover;  }

    public String getDescription() { return this.description; }

    public void setDescription(String description) {
        this.description = description;
    }

    public Double getDuration() { return this.duration;  }

    public void setDuration(Double duration) {
        this.duration = duration;
    }

    public int getId() { return this.id;  }

    public void setId(int id) { this.id = id;  }

    public Integer getDate() { return this.date;  }

    public void setDate(Integer date) { this.date = date;  }


    @Override
    public String toString() {
        return "id: " + id + '\''+
                ", title: '" + title + '\''+
                ", gender: " + gender + '\''+
                ", cover: " + cover + '\''+
                ", description: " + description + '\''+
                ", date: " + date + '\''+
                ", duration: " + duration + '\'';
    }



}
