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
        int countActors = 0;
        int idActors = 0;
        for (Actor actor : actors) {
            if (actor.surname.equals(surname)) {
                countActors++;
                idActors = actors.indexOf(actor);
            }
        }
        if (countActors == 1) {
            System.out.println("Такой актер участвует, меняю...");
            actors.remove(idActors);
            actors.add(replacement);
        } else if (countActors == 0) {
            System.out.println("Актер не найден");
        } else {
            System.out.println("Актеров с такой фамилией: " + countActors + ". Отмена замены...");
        }
    }

    public void printActors() {
        for (Actor actor : actors) {
            System.out.println(actor);
        }
    }

    @Override
    public String toString() {
        return "Show {" +
                "director=" + director +
                ", duration=" + duration +
                ", title='" + title + '\'' +
                '}';
    }
}
