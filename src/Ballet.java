public class Ballet extends MusicalShow {
    private Person choreographer;

    public Ballet(Director director, int duration, String title, String librettoText, Person musicAuthor, Person choreographer) {
        super(director, duration, title, librettoText, musicAuthor);
        this.choreographer = choreographer;
    }

    public Person getChoreographer() {
        return choreographer;
    }

    public void setChoreographer(Person choreographer) {
        this.choreographer = choreographer;
    }
}
