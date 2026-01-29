import java.util.Objects;

public class Actor extends Person {
    private int height;

    public Actor(String name, String surname, Gender gender, int height) {
        super(name, surname, gender);
        this.height = height;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Actor actor = (Actor) o;
        return Objects.equals(name, actor.name) && Objects.equals(height, actor.height) &&
                Objects.equals(surname, actor.surname);
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    @Override
    public int hashCode() {
        int hash = 17;
        if (name != null) {
            hash += name.hashCode();
        }
        hash *= 31;
        if (surname != null) {
            hash += surname.hashCode();
        }

        if (height != 0) {

            hash += 31 * height;
        }

        return hash;
    }

    @Override
    public String toString() {
        Gender male = Gender.MALE;
        String isGender;
        if (gender.equals(male)) {
            isGender = "Мужской";
        } else {
            isGender = "Женский";
        }
        return "Актёр: Имя-'" + name + '\'' +
                ", Фамилия-'" + surname + '\'' +
                ", Пол-" + isGender +
                ", Рост(" + height +
                ')';
    }

}
