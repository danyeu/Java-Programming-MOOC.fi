
public class Song {

    private String artist;
    private String name;
    private int durationInSeconds;

    public Song(String artist, String name, int durationInSeconds) {
        this.artist = artist;
        this.name = name;
        this.durationInSeconds = durationInSeconds;
    }

    @Override
    public String toString() {
        return this.artist + ": " + this.name + " (" + this.durationInSeconds + " s)";
    }

    public boolean equals(Object compared) {
        if (!(compared instanceof Song)) {
            return false;
        }
        Song c = (Song) compared;
        if (!(this.artist.equals(c.artist)) | !(this.name.equals(c.name)) | this.durationInSeconds != c.durationInSeconds) {
            return false;
        }
        return true;
    }

}
