public class Main {
    public static void main(String[] args) {
        MusicStyles[] musicStyles = {new PopMusic("Lady Gaga"), new RockMusic("Queen"),
                new ClassicMusic("Johann Sebastian Bach")};
        for (MusicStyles styles : musicStyles) {
            styles.playMusic();
        }
    }
}
