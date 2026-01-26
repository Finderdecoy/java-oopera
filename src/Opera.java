public class Opera extends MusicalShow {
    int choirSize;

    public Opera(Director director, int duration, String title, String librettoText, String musicAuthor, int choirSize) {
        super(director, duration, title, librettoText, musicAuthor);
        this.choirSize = choirSize;
    }
}
