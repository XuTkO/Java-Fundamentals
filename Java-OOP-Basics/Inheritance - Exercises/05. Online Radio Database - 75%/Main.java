package onlineRadioDatabase;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        int numberSongs = Integer.parseInt(bf.readLine());
        RadioList radioList = new RadioList();
        for (int a = 0; a < numberSongs; a++) {
            String[] tokens = bf.readLine().split(";");

            try {
                Songs song = new Songs(tokens[0], tokens[1]);
                SongLenght songLenght = new SongLenght(tokens[2]);
                song.setSongLenght(songLenght);
                radioList.addSong(song);
                System.out.println("Song added.");

            } catch (IllegalArgumentException ex) {
                System.out.println(ex.getMessage());
            }


        }
        System.out.println("Songs added: " + radioList.getSongList().size());

        System.out.println(radioList.getPlayListLenght());
    }
}
