public class ClassicMusic extends MusicStyles {

    public ClassicMusic(String artistName) {
        this.artistName = artistName;
    }

    public String getArtistName() {
        return artistName;
    }

    public void setArtistName(String artistName) {
        this.artistName = artistName;
    }

    @Override
    public void playMusic() {
        System.out.println("I am playing the classic composition of " + artistName);
    }
}

