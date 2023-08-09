import java.util.ArrayList;
import java.util.List;

public class PersonList extends ArrayList<Person> {


    public static void printPersonsOlderThan(List<Person> roster, int age) {
        for (Person p : roster) {
            if (p.getAge() >= age) {
                p.printPerson();
            }
        }
    }

    public static void printPersonsWithinAgeRange(
            List<Person> roster, int low, int high) {
        for (Person p : roster) {
            if (low <= p.getAge() && p.getAge() < high) {
                p.printPerson();
            }
        }
    }

    public static void printPersons(List<Person> roster) {
        for (Person p : roster) {
            if (p.getAge() > 21) {
                p.printPerson();
            }
        }
    }



    }




