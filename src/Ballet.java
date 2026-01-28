public class Ballet extends MusicalShow {
    Person choreographer;

    public Ballet(Director director, int duration, String title, String librettoText, Person musicAuthor, Person choreographer) {
        super(director, duration, title, librettoText, musicAuthor);
        this.choreographer = choreographer;
    }
}
