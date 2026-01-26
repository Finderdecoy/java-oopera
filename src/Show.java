import java.util.ArrayList;

public class Show {
    String title;
    int duration;
    Director director;
    ArrayList<Actor> actors = new ArrayList<>();

    public Show(Director director, int duration, String title) {
        this.director = director;
        this.duration = duration;
        this.title = title;
    }

    public void addActor(Actor actor) {
        if (actors.contains(actor)) {
            System.out.println("Такой актер уже существует");
        } else {
            actors.add(actor);
        }
    }

    public void changeActor(Actor replacement, String surname) {
        for (Actor actor : actors) {
            if(actor.surname.equals(surname)) {
                System.out.println("Такой актер участвует, меняю...");
                actors.remove(actor);
                actors.add(replacement);
                return;
            }
        }System.out.println("Актер не найден");
    }

    public void printActors() {
        for (Actor actor : actors) {
            System.out.println(actor);
        }
    }

    @Override
    public String toString() {
        return "Show{" +
                "director=" + director +
                ", duration=" + duration +
                ", title='" + title + '\'' +
                '}';
    }
}
