import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Employees {
    private ArrayList<Person> people;

    public Employees(){
        this.people = new ArrayList<>();
    }
    public void add(Person personToAdd) {
        people.add(personToAdd);
    }

    public void add(List<Person> peopleToAdd) {
        peopleToAdd.forEach(this::add);
    }

    public void print() {
        people.forEach(System.out::println);
    }

    public void print(Education education) {
        Iterator<Person> iterator = people.iterator();
        while (iterator.hasNext()) {
            Person current_person = iterator.next();
            if (current_person.getEducation() == education) {
                System.out.println(current_person);
            }
        }
    }

    public void fire(Education education) {
        Iterator<Person> iterator = people.iterator();
        while (iterator.hasNext()) {
            Person current_person = iterator.next();
            if (current_person.getEducation() == education) {
                iterator.remove();
            }
        }
    }
}
