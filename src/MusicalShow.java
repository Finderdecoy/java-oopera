public class MusicalShow extends Show {
    String musicAuthor;
    String librettoText;

    public MusicalShow(Director director, int duration, String title, String librettoText, String musicAuthor) {
        super(director, duration, title);
        this.librettoText = librettoText;
        this.musicAuthor = musicAuthor;
    }

    public void printLibretto() {
        System.out.println(librettoText);
    }
}
