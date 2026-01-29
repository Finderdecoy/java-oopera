public class Opera extends MusicalShow {
    private int choirSize;

    public Opera(Director director, int duration, String title, String librettoText, Person musicAuthor, int choirSize) {
        super(director, duration, title, librettoText, musicAuthor);
        this.choirSize = choirSize;
    }

    public int getChoirSize() {
        return choirSize;
    }

    public void setChoirSize(int choirSize) {
        this.choirSize = choirSize;
    }
}
