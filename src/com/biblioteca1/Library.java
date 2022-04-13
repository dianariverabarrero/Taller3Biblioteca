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
    Song paso_a_Paso = new Song("Paso a Paso", "Pop",
            "vaes.png",
            "Album Espejo",
            3.53,
            4,
            2019);
    Song sin_Ti = new Song("Sin ti", "Reggaeton",
            "alexZurdo.png",
            "Album Quien contra Nosotros",
            4.24,
            5,
            2018);
    Song volver_a_Respirar = new Song("Volver a Respirar", "Pop",
            "davidScarpeta.png",
            "Album Volver a Respirar",
            3.56,
            6,
            2009);
}
