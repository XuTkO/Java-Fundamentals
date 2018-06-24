package onlineRadioDatabase;

public class Songs {
    private String artistName;
    private String title;
    private SongLenght songLenght;

    public Songs(String artistName, String title) {
        this.setArtistName(artistName);
        this.setTitle(title);
    }

    private void setArtistName(String artistName) {
        if (artistName.length() < 3 || artistName.length() > 20){
            throw new IllegalArgumentException("Artist name should be between 3 and 20 symbols.");
        }
        this.artistName = artistName;
    }

    private void setTitle(String title) {
        if (title.length() < 3 || title.length() > 30){
            throw new IllegalArgumentException("Song name should be between 3 and 30 symbols.");
        }
        this.title = title;
    }

    public SongLenght getSongLenght() {
        return songLenght;
    }

    public void setSongLenght(SongLenght songLenght) {

        this.songLenght = songLenght;
    }


}
