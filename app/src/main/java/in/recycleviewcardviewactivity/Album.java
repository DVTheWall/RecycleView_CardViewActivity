package in.recycleviewcardviewactivity;

/**
 * Created by peacock on 9/3/17.
 */

public class Album {

    private String name;
    private int numofsongs;
    private int thumbnail;

    public Album() {
    }

    public Album(String name, int numofsongs, int thumbnail) {
        this.name = name;
        this.numofsongs = numofsongs;
        this.thumbnail = thumbnail;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumofsongs() {
        return numofsongs;
    }

    public void setNumofsongs(int numofsongs) {
        this.numofsongs = numofsongs;
    }

    public int getThumbnail() {
        return thumbnail;
    }

    public void setThumbnail(int thumbnail) {
        this.thumbnail = thumbnail;
    }
}
