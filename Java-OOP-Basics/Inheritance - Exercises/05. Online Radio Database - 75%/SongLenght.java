package onlineRadioDatabase;

public class SongLenght {
    private int minutes;
    private int seconds;


    public SongLenght(String lenght) {
        this.parseSongLenght(lenght);
    }

    public int getMinutes() {
        return minutes;
    }

    public int getSeconds() {
        return seconds;
    }

    private void parseSongLenght(String lenght) {
        String[] tokens = lenght.split(":");
        String minutes = tokens[0];
        String seconds = tokens[1];
        if (tokens.length != 2 || !minutes.matches("\\d+") || !seconds.matches("\\d+")) {
            throw new IllegalArgumentException("Invalid song length.");
        }

        this.setMinutes(Integer.parseInt(minutes));
        this.setSeconds(Integer.parseInt(seconds));
    }

    private void setMinutes(int minutes){
        if (minutes < 0 || minutes > 59){
            throw new IllegalArgumentException("Song minutes should be between 0 and 14.");
        }
        this.minutes = minutes;
    }

    private void setSeconds(int seconds) {
        if (seconds < 0 || seconds > 59){
            throw new IllegalArgumentException("Song seconds should be between 0 and 59.");
        }
        this.seconds = seconds;
    }


}
