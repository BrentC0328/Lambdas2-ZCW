import java.util.List;
import java.util.function.BiConsumer;

public class Main {

    public static void main(String[] args) {
        BiConsumer<List<Person>, CheckPerson > = PersonList::
            @Override
            public void r(List<Person> roster, CheckPerson tester) {
                for (Person p : roster) {
                    if (tester.test(p)) {
                        p.printPerson();
                    }
                }
            }
        };
    }
}
