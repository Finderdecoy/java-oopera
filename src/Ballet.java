public class Ballet extends MusicalShow {
    String choreographer;

    public Ballet(Director director, int duration, String title, String librettoText, String musicAuthor, String choreographer) {
        super(director, duration, title, librettoText, musicAuthor);
        this.choreographer = choreographer;
    }
}
