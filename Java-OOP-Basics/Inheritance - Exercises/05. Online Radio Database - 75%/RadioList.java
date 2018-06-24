package onlineRadioDatabase;

import java.util.ArrayList;
import java.util.List;

public class RadioList {
    private List<Songs> songList;

    public RadioList() {
        this.songList = new ArrayList<>();
    }

    public void addSong(Songs songs){
        this.songList.add(songs);
    }


    public List<Songs> getSongList() {
        return songList;
    }


    public String getPlayListLenght() {
        int allMinutes = this.songList.stream().mapToInt(s -> s.getSongLenght().getMinutes()).sum();
        int allSeconds = this.songList.stream().mapToInt(s -> s.getSongLenght().getSeconds()).sum();
        allSeconds+=allMinutes*60;

        int hours = allSeconds/3600;
        int minutes = (allSeconds%3600)/60;
        int seconds = allSeconds%60;

        return String.format("Playlist length: %dh %dm %ds", hours, minutes, seconds);
    }
}
