package com.biblioteca1;

/**
 *
 * @author Diana Marcela Rivera, kevin Martinez
 * @version 1.0.0
 */
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Comparator;

public class App {
    public static void main(String[] args) {
        Library songLibrary = new Library();
        Scanner read = new Scanner(System.in);
        
        int year;
        String gender;
        Double duration;
      

        songLibrary.playlist.add(songLibrary.color);
        songLibrary.playlist.add(songLibrary.me_Llamas);
        songLibrary.playlist.add(songLibrary.todo_Para_mi);
        songLibrary.playlist.add(songLibrary.volver_a_Respirar);
        songLibrary.playlist.add(songLibrary.sin_Ti);
        songLibrary.playlist.add(songLibrary.paso_a_Paso);
        songLibrary.playlist.add(songLibrary.gitana);
        songLibrary.playlist.add(songLibrary.payaso);

        System.out.println("\n");
        System.out.println("------------------------------");
        System.out.println("My Playlist\n");
         

        int count = songLibrary.playlist.size();
        for (Song song : songLibrary.playlist) {
            System.out.println("Song: " + song);
        }


        List<Song> songFiltered = new ArrayList<>();
        System.out.println("\n");
        System.out.println("""
                --- Gender ---
                - Bachata
                - Pop
                - Reggaeton
                - Salsa
                """);
        System.out.println("\n");
        System.out.print("Enter the gender of the song to filter: ");
        gender = read.nextLine();
        for(Song song : songLibrary.playlist){
            if(song.getGender().equals(gender)){  //gender = ['Bachata', 'Pop', 'Tropipop','Salsa']
                songFiltered.add(song);
            }
        }
        
        
        
        List<Song> songFiltered2 = new ArrayList<>();
        System.out.print("Enter the year of the song to filter: ");
        year = read.nextInt();
        for(Song song : songLibrary.playlist){
            if(song.getDate().equals(year)){  // anios = [2009, 2015, 2016, 2017, 2018, 2019, 2020]
                songFiltered2.add(song);
            }
        }
        
        System.out.println("\n");
        System.out.println("Order by duration");

        songLibrary.playlist.sort(Comparator.comparing(Song::getDuration));
        songLibrary.playlist.forEach((s) -> System.out.println(s));

        System.out.println("\n");
        System.out.println("Order by date");

        songLibrary.playlist.sort(Comparator.comparing(Song::getDate));
        songLibrary.playlist.forEach((s) -> System.out.println(s));
        
        System.out.println("\n");

        System.out.println("\n");
        System.out.println("Filtered by Gender: " + gender);
        for (Song song : songFiltered) {
            System.out.println("> " + song);
        }

        System.out.println("\n");
        System.out.println("Filtered by year: "+ year);
        for (Song song : songFiltered2) {
            System.out.println("> " + song);
        }
    }
}
