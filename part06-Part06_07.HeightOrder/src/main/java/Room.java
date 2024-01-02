import java.util.ArrayList;

public class Room {

    private ArrayList<Person> people;

    public Room() {
        this.people = new ArrayList<>();
    }

    public void add(Person person) {
        this.people.add(person);
    }

    public boolean isEmpty() {
        return (this.people.isEmpty());
    }

    public ArrayList<Person> getPersons() {
        return this.people;
    }

    public Person shortest() {
        if (isEmpty()) {
            return null;
        }

        int minHeight = this.people.get(0).getHeight();
        Person shortestPerson = this.people.get(0);
        for (Person p : this.people) {
            if (p.getHeight() < minHeight) {
                minHeight = p.getHeight();
                shortestPerson = p;
            }
        }
        return shortestPerson;
    }

    public Person take() {
        if (this.people.isEmpty()) {
            return null;
        }
        Person shortest = shortest();
        this.people.remove(shortest());
        return shortest;
    }
}
