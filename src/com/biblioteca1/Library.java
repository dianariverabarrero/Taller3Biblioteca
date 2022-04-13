package com.biblioteca1;

import java.util.ArrayList;

public class Library {
    ArrayList<Song> playlist = new ArrayList<>();

    Song color = new Song("Color", "Bachata",
            "gilbertoDaza.png",
            "Album Daza",
            3.37,
            1,
            2020);


    Song me_Llamas = new Song("Me Llamas", "Pop",
            "gilbertoDaza.png",
            "Album Daza",
            3.43,
            2,
            2017);

    Song todo_Para_mi = new Song("Todo para mi", "Pop",
            "gilbertoDaza.png",
            "Album Daza",
            3.10,
            3,
            2020);
}
