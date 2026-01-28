public class MusicalShow extends Show {
    protected Person musicAuthor;
    protected String librettoText;

    public MusicalShow(Director director, int duration, String title, String librettoText, Person musicAuthor) {
        super(director, duration, title);
        this.librettoText = librettoText;
        this.musicAuthor = musicAuthor;
    }

    public void printLibretto() {
        System.out.println(librettoText);
    }
}
